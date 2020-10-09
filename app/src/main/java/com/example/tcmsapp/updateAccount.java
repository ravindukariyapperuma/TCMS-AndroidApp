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


public class updateAccount extends Fragment {

    ImageButton btnUpdateMyAccountBack;
    Button btnMyAccountUpdate;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_update_account,container,false);

        btnUpdateMyAccountBack = view.findViewById(R.id.btnUpdateMyAccountBack);
        btnMyAccountUpdate = view.findViewById(R.id.btnMyAccountUpdate);

        btnUpdateMyAccountBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new MyAccount());
                fragmentTransaction.commit();
            }
        });

        btnMyAccountUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new MyAccount());
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}