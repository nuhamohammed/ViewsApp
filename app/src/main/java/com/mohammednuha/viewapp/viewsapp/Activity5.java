package com.mohammednuha.viewapp.viewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    public ScrollView scrollView;
    public TextView txt;
    public Button home;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        scrollView=findViewById(R.id.scrollView);
        txt= findViewById(R.id.scroll_text);
        home = findViewById(R.id.homebtn5);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        txt.setMovementMethod(new ScrollingMovementMethod());

    }

}
