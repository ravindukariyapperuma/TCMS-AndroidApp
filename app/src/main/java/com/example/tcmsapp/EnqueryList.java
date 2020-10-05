package com.example.tcmsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class EnqueryList extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.enquiry_list,container,false);

        ImageView opnenquery = view.findViewById(R.id.messagebutton);
        ImageView enquirylistbackbtn = view.findViewById(R.id.enquirylistbackbtn);

        enquirylistbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new enqueryOptions());

                fragmentTransaction.commit();
            }
        });

        opnenquery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new Broadcast_sms());

                fragmentTransaction.commit();
            }
        });

        return view;
    }

}
