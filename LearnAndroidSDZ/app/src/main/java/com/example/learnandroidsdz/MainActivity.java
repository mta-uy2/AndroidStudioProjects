package com.example.learnandroidsdz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        TextView text = new TextView(this);
        text.setText("Bonjour à toutes et à tous!");
        setContentView(text);
    }
}