package com.example.tcmsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class NavBar extends AppCompatActivity {

    private ChipNavigationBar chipNavigationBar;
    private Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bar);

        chipNavigationBar = findViewById(R.id.bottOnNavBar);
        chipNavigationBar.setItemSelected(R.id.calen,true);
      getSupportFragmentManager().beginTransaction().replace(R.id.contrainer, new calenderFM()).commit();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.contrainer, new calenderFM() );
        fragmentTransaction.commit();


        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i){
                    case R.id.calen:

                        fragment= new calenderFM();

                        break;
                    case R.id.people:

                        fragment= new peopleFM();

                        break;
                    case  R.id.camera:
                        fragment= new camFM();
                        break;
                    case R.id.notification:
                        fragment= new notifyFM();
                        break;
                    case R.id.profile:
                        fragment= new profileFM();
                        break;

                }

                if(fragment!=null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.contrainer,fragment).commit();
                }
            }
        });




    }
}