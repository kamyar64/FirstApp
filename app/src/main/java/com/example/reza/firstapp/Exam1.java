package com.example.reza.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Exam1 extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    private Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        radioSexGroup = (RadioGroup) findViewById(R.id.radiogroup);
         radioSexGroup.setOnCheckedChangeListener(this);
        Button next= (Button) findViewById(R.id.Next);
        Button per= (Button) findViewById(R.id.Per);

        next.setOnClickListener(this);
        per.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.Next :
                Intent d=new Intent(getBaseContext(),Exam2.class);
                startActivity(d);
                break;

            case R.id.Per:
               finish();
                break;
        }


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        // get selected radio button from radioGroup
        int selectedId = radioSexGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        radioSexButton = (RadioButton) findViewById(selectedId);

        Toast.makeText(getApplicationContext(),
                radioSexButton.getText(), Toast.LENGTH_SHORT).show();



    }
}
