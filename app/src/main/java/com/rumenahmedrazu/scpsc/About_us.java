package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class About_us extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        textView =(TextView) findViewById(R.id.name);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}