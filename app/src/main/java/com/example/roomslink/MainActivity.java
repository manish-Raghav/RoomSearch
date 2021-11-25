package com.example.roomslink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splitactivity);
         getSupportActionBar().hide();
       //  getWindow().setFlags(windowManager().LayoutParams.FLAG_FULLSCREEN,windowManager().LayoutParams.FLAG_FULLSCREEN);


         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent =new Intent(MainActivity.this ,Home.class);
                 startActivity(intent);
                 finish();
             }
             },4000);

    }


}