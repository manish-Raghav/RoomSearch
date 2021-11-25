package com.example.roomslink;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {
  BottomNavigationView bottemview;
//  SearchView sear;

//     FrameLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bottemview = findViewById(R.id.bottem);
       // sear =findViewById(R.id.sear);
      //  layout =findViewById(R)
        getSupportFragmentManager().beginTransaction().replace(R.id.mani,new Fatchimage()).commit();// Attached fragment.

        bottemview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment temp =null;
                switch (item.getItemId())
                {
                    case R.id.upload:
                        temp =new UploadFrag();
                        break;
                    case R.id.profile:
                        temp =new Profile();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.mani,temp).commit();
                return true;
            }
        });

        }


}