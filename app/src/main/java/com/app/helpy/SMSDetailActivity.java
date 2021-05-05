package com.app.helpy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.widget.TextView;

import java.util.Objects;

public class SMSDetailActivity extends AppCompatActivity {

    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_m_s_detail);
        Bundle extras;
        TextView message,time;
        int x;
        message = findViewById(R.id.message);
        time = findViewById(R.id.time);
        final String name, messageData, date;
        if(savedInstanceState == null){
            extras = getIntent().getExtras();
            if(extras != null){
                name = extras.getString("Name");
                messageData = extras.getString("Message");
                date = extras.getString("Date");
                x=extras.getInt("Sent");
                Objects.requireNonNull(this.getSupportActionBar()).setTitle(name);
                message.setText(messageData);
                time.setText(date);
                if(x==1) {
                    tts = new TextToSpeech(SMSDetailActivity.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            String text = "Received from "+ name;
                            String text2 = "massage is " + messageData;
                            String text3 = "Time is " + date;
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                    }
                                }, 1000);
                                tts.speak(text2, TextToSpeech.QUEUE_ADD, null, null);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                    }
                                }, 1000);
                                tts.speak(text3, TextToSpeech.QUEUE_ADD, null, null);
                            }
                        }
                    });
                }
                else
                {
                    tts = new TextToSpeech(SMSDetailActivity.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            String text = "Send to "+ name;
                            String text2 = "massage is " + messageData;
                            String text3 = "Time is " + date;
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                    }
                                }, 1000);
                                tts.speak(text2, TextToSpeech.QUEUE_ADD, null, null);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                    }
                                }, 1000);
                                tts.speak(text3, TextToSpeech.QUEUE_ADD, null, null);
                            }
                        }
                    });
                }
            }
        }
    }
}