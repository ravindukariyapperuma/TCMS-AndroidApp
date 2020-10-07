package com.example.tcmsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Broadcast_sms extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_broadcast_sms,container,false);

        ImageView broadcastsms = view.findViewById(R.id.broadcastbackbtn);
        Button btnSend = view.findViewById(R.id.btnSend);

        broadcastsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new EnqueryList());

                fragmentTransaction.commit();
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getActivity(),
                        "Send Successfully",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return view;
    }

}