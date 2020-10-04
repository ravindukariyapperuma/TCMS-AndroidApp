package com.example.tcmsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


public class todo_task_list extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_todo_task_list, container, false);
        ImageButton btn_createNew = view.findViewById(R.id.btn_createNew);
        ImageButton edit1 = view.findViewById(R.id.edit1);
        ImageButton todoListBack = view.findViewById(R.id.todoListBack);

        todoListBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer, new calenderFM());
                fragmentTransaction.commit();

            }
        });

        btn_createNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer, new add_todo_task());
                fragmentTransaction.commit();

            }
        });

        edit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence[] items = {"Update", "Delete"};
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setTitle("Choose an action");
                dialog.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {


                                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                                    fragmentTransaction.replace(R.id.contrainer, new update_todo_task());
                                    fragmentTransaction.commit();


                        }
                        if (i == 1) {

                            showDialogDelete();

                        }
                    }
                });
                dialog.show();

            }
        });




        return view;
    }

    private void showDialogDelete() {
        final Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.delete_layout);
        ImageButton btnYes = dialog.findViewById(R.id.btnYes);
        ImageButton btnNo = dialog.findViewById(R.id.btnNo);

        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(getActivity(),"Delete successfully",Toast.LENGTH_SHORT).show();
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}