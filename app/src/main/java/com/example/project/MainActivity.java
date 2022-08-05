package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    fragment_main fragment_main;
    fragment_search fragment_search;
    fragment_setting fragment_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_main = new fragment_main();
        fragment_search = new fragment_search();
        fragment_setting = new fragment_setting();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_main).commit();
        BottomNavigationView bottom_menu = findViewById(R.id.bottom_menu);
        bottom_menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_main).commit();
                        return true;
                    case R.id.search:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_search).commit();
                        return true;
                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment_setting).commit();
                        return true;
                }
                return false;
            }
        });
    }
}