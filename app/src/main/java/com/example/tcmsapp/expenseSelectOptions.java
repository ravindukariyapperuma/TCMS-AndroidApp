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


public class expenseSelectOptions extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_expense_select_options, container, false);
        ImageView expcat = view.findViewById(R.id.expcat);
        ImageView addexpicon = view.findViewById(R.id.addexpicon);
        ImageView expalert = view.findViewById(R.id.expalert);
        ImageView expreport = view.findViewById(R.id.expreport);
        ImageView backBtn = view.findViewById(R.id.backBtn);

        expcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new ExpcategoryList());
                fragmentTransaction.commit();

            }
        });


        addexpicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new expNewEntry());
                fragmentTransaction.commit();

            }
        });

        expalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new exp_alert());
                fragmentTransaction.commit();

            }
        });


        expreport.setOnClickListener(new View.OnClickListener() {
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