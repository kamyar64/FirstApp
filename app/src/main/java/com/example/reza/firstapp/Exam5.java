package com.example.reza.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Exam5 extends AppCompatActivity implements View.OnClickListener {
    private SeekBar se;
    private TextView text;
    private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam5);
        se= (SeekBar) findViewById(R.id.seek);
        sp= (Spinner) findViewById(R.id.sp);
        Button next= (Button) findViewById(R.id.Next);
        Button per= (Button) findViewById(R.id.Per);
        next.setOnClickListener(this);
        per.setOnClickListener(this);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),parent.getSelectedItem()+" ",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        text= (TextView) findViewById(R.id.Te);
        se.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                text.setText(progress+" ");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.Next :
                Intent d=new Intent(getBaseContext(),Exam6.class);
                startActivity(d);
                break;

            case R.id.Per:
                finish();
                break;
        }
    }
}
