package com.example.tcmsapp;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class addStudentFragment extends Fragment {

    private static final int gallryRequestCode = 123;
    ImageView profilePic;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_add_student,container,false);

        profilePic = view.findViewById(R.id.profilePic);
        profilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent,"Pick an Profile Picture"),gallryRequestCode);

            }
        });


        Button addbtn = view.findViewById(R.id.addbtn);
       final EditText stdId = view.findViewById(R.id.stdId);
        final EditText rollnum = view.findViewById(R.id.rollnum);
        final EditText stdname = view.findViewById(R.id.stdname);
        final  EditText parentName = view.findViewById(R.id.parentName);
        final  EditText dob = view.findViewById(R.id.dob);
        final EditText mobnum = view.findViewById(R.id.mobnum);
        final EditText address = view.findViewById(R.id.address);
        final EditText amount = view.findViewById(R.id.amount);
        final EditText startdate = view.findViewById(R.id.startdate);
        final EditText scl = view.findViewById(R.id.scl);

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



        ImageView backbtn = view.findViewById(R.id.backBtn);
        ImageView menubtn = view.findViewById(R.id.menubtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contrainer,new studentfragment());

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

        final Calendar myCalendar = Calendar.getInstance();


        final EditText edittext= (EditText) view.findViewById(R.id.dob);
       // final EditText startdate= (EditText) view.findViewById(R.id.startdate);
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

            private void updateLabel() {
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                edittext.setText(sdf.format(myCalendar.getTime()));
            }

        };



        edittext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(getActivity() , date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }


        });

        final DatePickerDialog.OnDateSetListener date1 = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel1();
            }

            private void updateLabel1() {
                String myFormat = "MM/dd/yy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

                startdate.setText(sdf.format(myCalendar.getTime()));
            }

        };



        startdate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new DatePickerDialog(getActivity() , date1, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }


        });




        return view;
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == gallryRequestCode && resultCode == getActivity().RESULT_OK && data!= null  ){

            Uri uri = data.getData();
            profilePic.setImageURI(uri);
            
            
        }
    }
}