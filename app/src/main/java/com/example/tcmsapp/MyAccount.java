package com.example.tcmsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class MyAccount extends Fragment {
    ImageButton btnProfileEdit, btnMyAccountBack;
    Button btnLogout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_account,container,false);
        btnProfileEdit = view.findViewById(R.id.btnProfileedit);
        btnLogout = view.findViewById(R.id.btnLogout);
        btnMyAccountBack = view.findViewById(R.id.btnMyAccountBack);

        btnProfileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer, new updateAccount());
                fragmentTransaction.commit();

            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Signin.class);
                startActivity(intent);
            }
        });

        btnMyAccountBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NavBar.class);
                startActivity(intent);
            }
        });
        return view;
    }
}