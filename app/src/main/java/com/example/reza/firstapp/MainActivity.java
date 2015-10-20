package com.example.reza.firstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    TextView t;
    int n=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button);
        t= (TextView) findViewById(R.id.num);

        b.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if(n%2==0)
        Toast.makeText(getApplicationContext(), "You Number Is Odd",
                Toast.LENGTH_SHORT).show();

        else
            Toast.makeText(getApplicationContext(), "You Number Is Even",
                    Toast.LENGTH_SHORT).show();
        t.setText("Your Number :" + String.valueOf(n++));
    }
}
