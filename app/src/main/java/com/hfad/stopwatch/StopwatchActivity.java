package com.hfad.stopwatch;

import android.app.Activity;
import android.os.Bundle;

public class StopwatchActivity extends Activity {

    private int seconds = 0;
    private boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }
}
