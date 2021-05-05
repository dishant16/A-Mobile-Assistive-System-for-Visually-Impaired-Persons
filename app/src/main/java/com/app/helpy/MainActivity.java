package com.app.helpy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButton1,mButton2,mButton3,mButton4,mButton5;
    private TextToSpeech tts;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                String text = "Welcome to helpy app,  click the different side of the screen to know details";
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                }
                else {
                    tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
        mButton1=(Button)findViewById(R.id.button1);
        mButton2=(Button)findViewById(R.id.button2);
        mButton3=(Button)findViewById(R.id.button3);
        mButton4=(Button)findViewById(R.id.button4);
        mButton5=(Button)findViewById(R.id.button5);

        mButton1.setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                    Intent call = new Intent(MainActivity.this,call.class);
                    startActivity(call);
                    finish();
                    return super.onDoubleTap(e);
                }
                @Override
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "try double click", Toast.LENGTH_SHORT).show();
                    tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            String text = "you clicked call, double click to open call" ;
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                            }
                            else {
                                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }
                    });
                    return super.onSingleTapConfirmed(e);
                }
                @Override
                public void onLongPress(MotionEvent e) {
                    super.onLongPress(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });

        mButton2.setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                    Intent msg = new Intent(MainActivity.this, MessageActivity.class);
                    startActivity(msg);
                    return super.onDoubleTap(e);
                }
                @Override
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "try double click", Toast.LENGTH_SHORT).show();
                    tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            String text = "you clicked Messages, double click to open Messages";
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                            }
                            else {
                                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }
                    });
                    return super.onSingleTapConfirmed(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });
        mButton3.setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                    Intent note = new Intent(MainActivity.this,notes.class);
                    startActivity(note);
                    return super.onDoubleTap(e);
                }
                @Override
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "try double click", Toast.LENGTH_SHORT).show();
                    tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            String text = "you clicked Notes, double click to open Notes" ;
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                            }
                            else {
                                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }
                    });
                    return super.onSingleTapConfirmed(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });
        mButton4.setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                    Intent Location = new Intent(MainActivity.this,Location.class);
                    startActivity(Location);
                    return super.onDoubleTap(e);
                }
                @Override
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "try double click", Toast.LENGTH_SHORT).show();
                    tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            String text = "you clicked Location, double click to open Location" ;
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                            }
                            else {
                                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }
                    });
                    return super.onSingleTapConfirmed(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });
        mButton5.setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG).show();
                    Intent battery = new Intent(MainActivity.this,Battery.class);
                    startActivity(battery);
                    return super.onDoubleTap(e);
                }
                @Override
                public boolean onSingleTapConfirmed(MotionEvent e) {
                    //Toast.makeText(getApplicationContext(), "try double click", Toast.LENGTH_SHORT).show();
                    tts=new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            String text = "you clicked battery, double click to open battery" ;
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                            }
                            else {
                                tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                            }
                        }
                    });
                    return super.onSingleTapConfirmed(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return true;
            }
        });


    }
    @Override
    public void onBackPressed()
    {
        finishAffinity();
        finish();
    }

}
