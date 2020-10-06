package com.example.tcmsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class expNewEntry extends Fragment {
 EditText ed1,ed2,ed3;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exp_new_entry, container, false);
        ImageView backBtn = view.findViewById(R.id.backBtn);

        ed1 = view.findViewById(R.id.expCate);
        ed2 = view.findViewById(R.id.remark);
        ed3 = view.findViewById(R.id.type);
        Button saveBtn = view.findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().matches("") || ed2.getText().toString().matches("") || ed3.getText().toString().matches("")){

                    Toast.makeText(getActivity(),"Please insert all fields!",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(),"Inserted Successfully!",Toast.LENGTH_SHORT).show();

                }

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new expenseSelectOptions());
                fragmentTransaction.commit();

            }
        });

        return view;

    }

}