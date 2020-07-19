package com.example.muneraapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity13 extends AppCompatActivity {

    Button book1;
    Button book2;
    Button book3;
    Button book4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        book1 =(Button) findViewById(R.id.button1);
        book2 =(Button) findViewById(R.id.button2);
        book3 =(Button) findViewById(R.id.button3);
        book4 =(Button) findViewById(R.id.button4);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(MainActivity13.this,book1.class);
                startActivity(i);
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(MainActivity13.this,book2.class);
                startActivity(i);
            }
        });
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(MainActivity13.this,book3.class);
                startActivity(i);
            }
        });
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(MainActivity13.this,book4.class);
                startActivity(i);
            }
        });

    }
}