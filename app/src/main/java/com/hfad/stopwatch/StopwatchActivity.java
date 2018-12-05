package com.hfad.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class StopwatchActivity extends Activity {

    private int seconds = 0;
    private boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }


    public void onClickStart(View view) {         // get's called when start button is clicked
        running = true;                           // start the stopwatch
    }

    public void onClickStop(View view) {         // get's called when stop button is clicked
        running = false;                         // stop the stopwatch
    }
}
