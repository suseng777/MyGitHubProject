package com.example.suks.progressbartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.suks.progressbartest.refactor.Playpen;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    public static final String HELLO = "Hello Android";
    ProgressBar progressBar;
    private  int i=0;
    private Playpen mPlaypen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPlaypen = new Playpen();
        mPlaypen.greeTings("Test");
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(i == 100) i =0;
                progressBar.setProgress(i++);
            }
        }, 0, 100);

    }
}
