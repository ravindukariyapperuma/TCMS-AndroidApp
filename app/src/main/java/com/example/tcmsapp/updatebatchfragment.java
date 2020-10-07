package com.example.tcmsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class updatebatchfragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =  inflater.inflate(R.layout.fragment_updatefragment, container, false);
        ImageView backbtn = view.findViewById(R.id.backBtn);
        ImageView menubtn = view.findViewById(R.id.menubtn);

        Button batchbtn = view.findViewById(R.id.batchbtn);
        final EditText bname = view.findViewById(R.id.bname);
        final EditText location = view.findViewById(R.id.location);
        final  EditText teacher = view.findViewById(R.id.teacher);
        final  EditText time = view.findViewById(R.id.time);
        final EditText slots = view.findViewById(R.id.slots);

        batchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bname.getText().toString().isEmpty() || location.getText().toString().isEmpty() || teacher.getText().toString().isEmpty() || time.getText().toString() .isEmpty() || slots.getText().toString() .isEmpty() ){
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
                fragmentTransaction.replace(R.id.contrainer,new studentdetails());

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