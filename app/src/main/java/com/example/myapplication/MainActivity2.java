package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView emailtext;
    private TextView passwordtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        emailtext = (TextView) findViewById(R.id.emailtext);
        String email = getIntent().getStringExtra("email");
//        emailtext.setText(getIntent().getStringExtra("email"));
        System.out.println(email);
        emailtext.setText(email);

        passwordtext = (TextView) findViewById(R.id.passwordtext);
        passwordtext.setText(getIntent().getStringExtra("password"));
    }
}