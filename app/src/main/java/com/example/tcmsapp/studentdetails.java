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


public class studentdetails extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_studentdetails,container,false);

        ImageView backbtn = view.findViewById(R.id.backBtn);
        ImageView menubtn = view.findViewById(R.id.menubtn);


        Button addbtn = view.findViewById(R.id.ba);
        final EditText stdId = view.findViewById(R.id.as);
        final EditText rollnum = view.findViewById(R.id.rm);
        final EditText stdname = view.findViewById(R.id.sn);
        final  EditText parentName = view.findViewById(R.id.pn);
        final  EditText dob = view.findViewById(R.id.dob);
        final EditText mobnum = view.findViewById(R.id.mn);
        final EditText address = view.findViewById(R.id.ad);
        final EditText amount = view.findViewById(R.id.amt);
        final EditText startdate = view.findViewById(R.id.startdate);
        final EditText scl = view.findViewById(R.id.sc);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stdId.getText().toString().isEmpty() || rollnum.getText().toString().isEmpty() || stdname.getText().toString().isEmpty() || parentName.getText().toString().isEmpty() || dob.getText().toString().isEmpty() ||
                        mobnum.getText().toString().isEmpty() || address.getText().toString() .isEmpty() || amount.getText().toString().isEmpty() || startdate.getText().toString().isEmpty() ||  scl.getText().toString().isEmpty()){


                    Toast.makeText(getActivity(),"Please fill all required fields !", Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(getActivity(),"Adding successfull", Toast.LENGTH_LONG).show();
                }
            }
        });



        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new ActivestudentList());

                fragmentTransaction.commit();
            }
        });
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new calenderFM());

                fragmentTransaction.commit();
            }
        });

        return view;
    }
}