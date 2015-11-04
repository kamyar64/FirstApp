package com.example.reza.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b,b1,b2,b3;
    TextView t;
    EditText ed;
    int n=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button);
        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        t= (TextView) findViewById(R.id.num);
        ed= (EditText) findViewById(R.id.tb1);
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case  R.id.button :
            if (n % 2 == 0)
                Toast.makeText(getApplicationContext(), "You Number Is Odd",
                        Toast.LENGTH_SHORT).show();

            else
                Toast.makeText(getApplicationContext(), "You Number Is Even",
                        Toast.LENGTH_SHORT).show();
            t.setText("Your Number :" + String.valueOf(n++));
            break;
        case R.id.button1 :
            Toast.makeText(getApplicationContext(),ed.getText(),Toast.LENGTH_LONG).show();
            String vlaue=String.valueOf(ed.getText()) ;
            Intent intent = new Intent(getBaseContext(),SecoundA.class);
            intent.putExtra("ID",vlaue);
            startActivity(intent);
            break;
        case R.id.button2 :
            Intent ss = new Intent(getBaseContext(),People_Activity.class);
            startActivity(ss);
            break;
        case R.id.button3 :
            Intent dd = new Intent(getBaseContext(),Exam1.class);
            startActivity(dd);
            break;

    }
    }
}
