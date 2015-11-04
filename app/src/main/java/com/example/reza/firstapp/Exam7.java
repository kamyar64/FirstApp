package com.example.reza.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam7 extends AppCompatActivity implements View.OnClickListener {
    Button btn,btn2;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam7);
        btn= (Button) findViewById(R.id.btn);
        btn2= (Button) findViewById(R.id.btn2);
        pass= (EditText) findViewById(R.id.password);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn :
                if( pass.getText().toString().length() < 6 )
                    pass.setError( "Your Password Must be Atleast 6 charecter !" );
                break;
            case R.id.btn2 :
                    pass.setError(null);
                break;
        }
    }
}
