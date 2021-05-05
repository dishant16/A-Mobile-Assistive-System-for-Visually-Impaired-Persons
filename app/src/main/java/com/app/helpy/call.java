package com.app.helpy;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.Objects;

public class call extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST = 1;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnStar, btnHash, btnDelete, btnDial;
    EditText input;
    String number ="";
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        Objects.requireNonNull(this.getSupportActionBar()).setTitle("Call");

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, MY_PERMISSIONS_REQUEST);
        }

        tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                String text = "In Call dialer";
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                }
            }
        });

        btnOne = findViewById(R.id.buttonOne);
        btnTwo = findViewById(R.id.buttonTwo);
        btnThree = findViewById(R.id.buttonThree);
        btnFour = findViewById(R.id.buttonFour);
        btnFive = findViewById(R.id.buttonFive);
        btnSix = findViewById(R.id.buttonSix);
        btnSeven = findViewById(R.id.buttonSeven);
        btnEight = findViewById(R.id.buttonEight);
        btnNine = findViewById(R.id.buttoNine);
        btnZero = findViewById(R.id.buttonZero);
        btnStar = findViewById(R.id.buttonStar);
        btnHash = findViewById(R.id.buttonHash);
        btnDelete = findViewById(R.id.buttonDelete);
        btnDial = findViewById(R.id.buttonDial);
        input = findViewById(R.id.editText2);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "1";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "1";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }
                    }
                });
                input.setText(number);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "2";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "2";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }

                    }
                });
                input.setText(number);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "3";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "3";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }

                    }
                });
                input.setText(number);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "4";
                tts=new TextToSpeech(call.this,
                        new TextToSpeech.OnInitListener() {
                            @Override
                            public void onInit(int status) {
                                String text = "4";
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                    tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                                }
                            }
                        });
                input.setText(number);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "5";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "5";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }
                    }
                });
                input.setText(number);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "6";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "6";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }
                    }
                });
                input.setText(number);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "7";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "7";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }
                    }
                });
                input.setText(number);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "8";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "8";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }
                    }
                });
                input.setText(number);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "9";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "9";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }
                    }
                });
                input.setText(number);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "0";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "0";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }

                    }
                });
                input.setText(number);
            }
        });
        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "*";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "*";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }

                    }
                });
                input.setText(number);
            }
        });
        btnHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number += "#";
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "#";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }

                    }
                });
                input.setText(number);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number != null && number.length() > 0) {
                    number = number.substring(0, number.length() - 1);
                }
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "last Digit deleted";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }

                    }
                });
                input.setText(number);
            }
        });
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tts=new TextToSpeech(call.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        String text = "Dialing the Call";
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);
                        }

                    }
                });
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + number));
                        input.setText("");
                        number="";
                        startActivity(intent);
                    }
                }, 600);

            }
        });
    }

    @Override
    public void onBackPressed(){
        Intent battery = new Intent(call.this,MainActivity.class);
        startActivity(battery);
        finish();
    }
}
