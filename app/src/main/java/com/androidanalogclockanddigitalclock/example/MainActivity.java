package com.androidanalogclockanddigitalclock.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    private static Button btn;
    private static AnalogClock analog;
    private static TextClock text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListener();
    }

    public void onButtonClickListener() {
        btn = (Button)findViewById(R.id.button);
        text = (TextClock)findViewById(R.id.textClock);
        analog = (AnalogClock) findViewById(R.id.analogClock);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(text.getVisibility() == TextClock.GONE) {
                            text.setVisibility(TextClock.VISIBLE);
                            analog.setVisibility(AnalogClock.GONE);
                        } else {
                            text.setVisibility(TextClock.GONE);
                            analog.setVisibility(AnalogClock.VISIBLE);
                        }
                    }
                }
        );
    }
}
