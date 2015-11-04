package com.example.reza.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Exam6 extends AppCompatActivity implements View.OnClickListener {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam6);
        Button next= (Button) findViewById(R.id.Next);
        Button per= (Button) findViewById(R.id.Per);
        next.setOnClickListener(this);
        per.setOnClickListener(this);
        web= (WebView) findViewById(R.id.web);
        web.loadUrl("http://www.pfont.ir");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.Next :
                Intent d=new Intent(getBaseContext(),Exam7.class);
                startActivity(d);
                break;

            case R.id.Per:
                finish();
                break;
        }
    }
}
