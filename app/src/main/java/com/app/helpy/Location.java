package com.app.helpy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        this.getSupportActionBar().setTitle("Location");
    }
}
