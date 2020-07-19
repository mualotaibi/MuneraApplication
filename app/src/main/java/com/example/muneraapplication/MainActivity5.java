package com.example.muneraapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        Handler h = new Handler(getMainLooper());
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(i);
            }
        };

        h.postDelayed(r, 5000);

    }
}