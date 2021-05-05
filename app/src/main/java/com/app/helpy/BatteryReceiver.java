package com.app.helpy;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BatteryManager;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.widget.ImageView;
import android.widget.TextView;

public class BatteryReceiver extends BroadcastReceiver {
    private TextToSpeech tts;

    @SuppressLint("SetTextI18n")
    @Override
    public void onReceive(Context context, Intent intent) {

        TextView statusLabel =((Battery)context).findViewById(R.id.statusLabel);
        final TextView percentageLabel =((Battery)context).findViewById(R.id.percentageLabel);
        ImageView batteryImage = ((Battery)context).findViewById(R.id.batteryImage);

        String action = intent.getAction();

        if (action != null && action.equals(Intent.ACTION_BATTERY_CHANGED)) {

            int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
            String message = "";

            switch (status) {
                case BatteryManager.BATTERY_STATUS_FULL:
                    message = "Full";
                    break;
                case BatteryManager.BATTERY_STATUS_CHARGING:
                    message = "Charging";
                    break;
                case BatteryManager.BATTERY_STATUS_DISCHARGING:
                    message = "Discharging";
                    break;
                case BatteryManager.BATTERY_STATUS_NOT_CHARGING:
                    message = "Not Charging";
                    break;
                case BatteryManager.BATTERY_STATUS_UNKNOWN:
                    message = "Unknown";
                    break;
            }
            statusLabel.setText(message);

            //percenttage
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
            int percentage = level * 100 / scale;
            percentageLabel.setText(percentage + "%");

            //image
            Resources res = context.getResources();

            if (percentage == 100) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_full_black_24dp));
            } else if (90 <= percentage && percentage < 100) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_90_black_24dp));
            } else if (90 > percentage && percentage >= 80) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_80_black_24dp));
            } else if (80 > percentage && percentage >= 70) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_70_black_24dp));
            } else if (70 > percentage && percentage >= 60) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_60_black_24dp));
            } else if (60 > percentage && percentage >= 50) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_50_black_24dp));
            } else if (50 > percentage && percentage >= 40) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_40_black_24dp));
            } else if (40 > percentage && percentage >= 30) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_30_black_24dp));
            } else if (30 > percentage && percentage >= 20) {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_20_black_24dp));
            } else {
                batteryImage.setImageDrawable(res.getDrawable(R.drawable.ic_battery_10_black_24dp));
            }
            tts=new TextToSpeech(context, new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    String text = "Battery is"+percentageLabel.getText().toString();
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                    }
                    else {
                        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
            });
        }
    }
}
