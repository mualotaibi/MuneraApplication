package com.example.muneraapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Handler h = new Handler(getMainLooper());
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(i);
            }
        };

        h.postDelayed(r, 5000);

    }
}