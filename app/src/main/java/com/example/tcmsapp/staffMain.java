package com.example.tcmsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class staffMain extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_staff_main,container,false);
        ImageView staffmgr = view.findViewById(R.id.staffmgr);
        ImageView staffmainback = view.findViewById(R.id.staffmainbackBtn);

        staffmainback .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new calenderFM());

                fragmentTransaction.commit();
            }
        });
        staffmgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new staffList());
                fragmentTransaction.commit();
            }
        });
        ImageView staffsalary = view.findViewById(R.id.activeManager);
        staffsalary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new select_staff_member());
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
