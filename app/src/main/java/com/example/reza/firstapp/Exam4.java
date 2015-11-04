package com.example.reza.firstapp;

import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Exam4 extends AppCompatActivity implements View.OnClickListener {
ProgressBar progressBar;
    Button start,stop;
    static int progress;
    int progressStatus = 0;
    Handler handler = new Handler();  //handler for
    Boolean isCanceled = true;
    Thread a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam4);
        progressBar= (ProgressBar) findViewById(R.id.progress);
        start= (Button) findViewById(R.id.start);
        stop= (Button) findViewById(R.id.stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        Button next= (Button) findViewById(R.id.Next);
        Button per= (Button) findViewById(R.id.Per);

        next.setOnClickListener(this);
        per.setOnClickListener(this);


        progress = 0;
//        progressBar.setMax(200); in mitone to xml bashe

        //---do some work in background thread-----this is where we will do work and update progress bar
        //   do the work as a separate Thread whe will with start() method invocation below start running

        a =new Thread(new Runnable()          //IN YELLOW showing the anonymous instance of Runnable class createing here
        {
            public void run()
            {
                //—-do some work here—-

                while (progressStatus < 100) {
                    if (!isCanceled)
                    {
                        progressStatus++;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // Update the progress bar
                        handler.post(new Runnable() {
                            public void run() {
                                progressBar.setProgress(progressStatus);
                            }
                        });
                    }
                }
            }

        });
        a.start();


    }
//    int i=0;
    @Override
    public void onClick(final View v) {
        switch (v.getId())
        {
            case R.id.start :
                isCanceled =false;
                stop.setVisibility(View.VISIBLE);
                start.setVisibility(View.GONE);
                break;
            case R.id.stop :
                isCanceled = true;
                start.setVisibility(View.VISIBLE);
                stop.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(),"Toggle Button is Off",Toast.LENGTH_LONG).show();
                break;
            case R.id.Next :
                Intent d=new Intent(getBaseContext(),Exam5.class);
                startActivity(d);
                break;

            case R.id.Per:
                finish();
                break;
        }
    }
}
