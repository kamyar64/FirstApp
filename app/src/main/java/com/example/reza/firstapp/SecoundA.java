package com.example.reza.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecoundA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        TextView s= (TextView) findViewById(R.id.Text);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("ID");
            s.setText(value);

        }
    }
}
