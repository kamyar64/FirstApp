package com.example.reza.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Exam3 extends AppCompatActivity implements View.OnClickListener {
private CheckBox ch;
    ToggleButton btn;
    Switch sw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3);
        ch= (CheckBox) findViewById(R.id.ch1);
        ch.setOnClickListener(this);
        sw= (Switch) findViewById(R.id.swit);
        btn= (ToggleButton) findViewById(R.id.btn);
        sw.setOnClickListener(this);
        btn.setOnClickListener(this); // dalilesh ro bepors
        Button next= (Button) findViewById(R.id.Next);
        Button per= (Button) findViewById(R.id.Per);

        next.setOnClickListener(this);
        per.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.ch1:
                if(ch.isChecked())
                    Toast.makeText(getApplicationContext(),"Check",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"FALSE",Toast.LENGTH_LONG).show();
                break;

            case R.id.swit:
                if(sw.isChecked())
                    Toast.makeText(getApplicationContext(),"Switch Button in on",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Switch Button in Off",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn:
                if(btn.isChecked())
                    Toast.makeText(getApplicationContext(),"Toggle Button is On",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Toggle Button is Off",Toast.LENGTH_LONG).show();
                break;

            case R.id.Next :
                Intent d=new Intent(getBaseContext(),Exam4.class);
                startActivity(d);
                break;

            case R.id.Per:
                finish();
                break;
        }
    }
}
