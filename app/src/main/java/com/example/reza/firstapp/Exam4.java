package com.example.reza.firstapp;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam4);
        progressBar= (ProgressBar) findViewById(R.id.progress);
        start= (Button) findViewById(R.id.start);
        stop= (Button) findViewById(R.id.stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }
    int i=0;
    @Override
    public void onClick(final View v) {
        progress = 0;
        progressBar.setMax(200);

        //---do some work in background thread-----this is where we will do work and update progress bar
        //   do the work as a separate Thread whe will with start() method invocation below start running

        Thread a =new Thread(new Runnable()          //IN YELLOW showing the anonymous instance of Runnable class createing here
        {
            public void run()
            {
                //—-do some work here—-



                        //—-Update the progress bar—-
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                    //---simulate doing some work---
                                    progressStatus = progressStatus + 10;
                                //Do something after 100ms
                                progressBar.setProgress(progressStatus);


                                handler.postDelayed(this, 2000);
                            }
                        }, 1500);







            }

        });
        switch (v.getId())
        {
            case R.id.start :

                a.start();
                break;
            case R.id.stop :
                a.interrupt();
                Toast.makeText(getApplicationContext(),"Toggle Button is Off",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
