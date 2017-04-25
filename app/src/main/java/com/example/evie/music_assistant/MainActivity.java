package com.example.evie.music_assistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.content.*;
import android.widget.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToTuner(View view) {
        Intent tunerIntent = new Intent(this, Tuner.class);
        startActivity(tunerIntent);
    }

    public void goToMetronome(View view) {
        Intent metroIntent = new Intent(this, Metronome.class);
        startActivity(metroIntent);
    }

    public void goToRecord(View view) {
        Intent recordIntent = new Intent(this, Record.class);
        startActivity(recordIntent);
    }
}
