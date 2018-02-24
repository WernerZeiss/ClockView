package com.cwq.clockview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cwq.clockview.widge.ClockView;

public class MainActivity extends AppCompatActivity {

    ClockView mClockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClockView = findViewById(R.id.clockView);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mClockView.start();
    }


    @Override
    protected void onDestroy() {
        mClockView.stop();
        super.onDestroy();
    }
}
