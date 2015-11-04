package com.example.reza.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class Exam2 extends AppCompatActivity implements View.OnClickListener {
    Button next,per;
    RadioButton a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);
        a= (RadioButton) findViewById(R.id.andbutton);
        b= (RadioButton) findViewById(R.id.phpbutton);
        c= (RadioButton) findViewById(R.id.cbutton);
        Button next= (Button) findViewById(R.id.Next);
        Button per= (Button) findViewById(R.id.Per);

        next.setOnClickListener(this);
        per.setOnClickListener(this);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.andbutton:
                Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_LONG).show();
                a.setChecked(true);
                b.setChecked(false);
                c.setChecked(false);
                break;
            case R.id.phpbutton:
                Toast.makeText(getApplicationContext(),"PHP",Toast.LENGTH_LONG).show();
                a.setChecked(false);
                b.setChecked(true);
                c.setChecked(false);
                break;
            case R.id.cbutton:
                Toast.makeText(getApplicationContext(),"C#",Toast.LENGTH_LONG).show();
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(true);
                break;
            case R.id.Next :
                Intent d=new Intent(getBaseContext(),Exam3.class);
                startActivity(d);
                break;

            case R.id.Per:
                finish();
                break;
        }
    }
}
