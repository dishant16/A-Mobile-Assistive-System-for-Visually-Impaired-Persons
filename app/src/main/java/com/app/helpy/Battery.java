package com.app.helpy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import java.util.Objects;

public class Battery extends AppCompatActivity {

    private BatteryReceiver mBatteryReceiver = new BatteryReceiver();
    private IntentFilter mIntentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
        Objects.requireNonNull(this.getSupportActionBar()).setTitle("Battery");
    }
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(mBatteryReceiver, mIntentFilter);
    }
    @Override
    protected void onPause() {
        unregisterReceiver(mBatteryReceiver);
        super.onPause();

    }
    @Override
    public void onBackPressed(){
        Intent battery = new Intent(Battery.this,MainActivity.class);
        startActivity(battery);
        finish();
    }
}
