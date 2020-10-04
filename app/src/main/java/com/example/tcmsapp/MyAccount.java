package com.example.tcmsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class MyAccount extends Fragment {
    ImageButton btnProfileEdit;
    Button btnLogout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_account,container,false);
        btnProfileEdit = view.findViewById(R.id.btnProfileedit);
        btnLogout = view.findViewById(R.id.btnLogout);

        btnProfileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer, new updateAccount());
                fragmentTransaction.commit();

            }
        });
        return view;
    }
}