package com.example.tcmsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class incomeoption extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_incomeoption,container,false);
        ImageView optioniicon = view.findViewById(R.id.optioniicon);
        ImageView optioneicon = view.findViewById(R.id.optioneicon);
        ImageView backBtn = view.findViewById(R.id.backBtn);

        optioniicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new incomeNewEntry());
                fragmentTransaction.commit();

            }
        });

        optioneicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new incomeReport());
                fragmentTransaction.commit();

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new incomeAndExp());
                fragmentTransaction.commit();

            }
        });
        return view;
    }
}