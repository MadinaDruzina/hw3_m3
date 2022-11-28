package com.madina.hw3_m3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                if (savedInstanceState == null) {
                    getSupportFragmentManager().beginTransaction().add(R.id.main_container,new MainFragment()).commit();
                }
    }
}