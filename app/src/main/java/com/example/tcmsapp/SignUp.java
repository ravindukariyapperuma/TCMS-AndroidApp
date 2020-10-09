package com.example.tcmsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    TextView txtSignUp, rUsername, rMobile, rEmail, rPassword, rComPassword;
    Button btnSignUp;
    ImageButton btnBackSignUp;
    EditText txtUsername, txtMobile, txtEmail, txtPassword, txtComPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        rUsername = findViewById(R.id.rUsername);
        rMobile = findViewById(R.id.rMobile);
        rEmail = findViewById(R.id.rEmail);
        rPassword = findViewById(R.id.rPassword);
        rComPassword = findViewById(R.id.rComPassword);

        txtUsername = findViewById(R.id.txtUsername);
        txtMobile = findViewById(R.id.txtMobile);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        txtComPassword = findViewById(R.id.txtComPassword);

        txtSignUp = findViewById(R.id.txtSignIn);
        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Signin.class);
                startActivity(intent);
            }
        });

        btnSignUp = findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rUsername.setVisibility(View.INVISIBLE);
                rMobile.setVisibility(View.INVISIBLE);
                rEmail.setVisibility(View.INVISIBLE);
                rPassword.setVisibility(View.INVISIBLE);
                rComPassword.setVisibility(View.INVISIBLE);
                rComPassword.setVisibility(View.INVISIBLE);

                if(txtUsername.getText().toString().isEmpty()){
                    rUsername.setVisibility(View.VISIBLE);
                }
                if(txtMobile.getText().toString().isEmpty()){
                    rMobile.setVisibility(View.VISIBLE);
                }
                if(txtEmail.getText().toString().isEmpty()){
                    rEmail.setVisibility(View.VISIBLE);
                }
                if(txtPassword.getText().toString().isEmpty()){
                    rPassword.setVisibility(View.VISIBLE);
                }
                if(txtComPassword.getText().toString().isEmpty()){
                    rComPassword.setVisibility(View.VISIBLE);
                }
                if(txtUsername.getText().toString().isEmpty() && txtMobile.getText().toString().isEmpty() && txtEmail.getText().toString().isEmpty() && txtPassword.getText().toString().isEmpty() && txtComPassword.getText().toString().isEmpty() ){

                    rUsername.setVisibility(View.VISIBLE);
                    rMobile.setVisibility(View.VISIBLE);
                    rEmail.setVisibility(View.VISIBLE);
                    rPassword.setVisibility(View.VISIBLE);
                    rComPassword.setVisibility(View.VISIBLE);
                    rComPassword.setVisibility(View.VISIBLE);
                }
                if(txtUsername.getText().toString().isEmpty() || txtMobile.getText().toString().isEmpty() || txtEmail.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty() || txtComPassword.getText().toString().isEmpty() ){

                }
                else{
                    Intent intent = new Intent(getApplicationContext(),Disclaimer.class);
                    startActivity(intent);
                }
            }
        });

        btnBackSignUp = findViewById(R.id.btnBackSignUp);
        btnBackSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Signin.class);
                startActivity(intent);
            }
        });
    }
}