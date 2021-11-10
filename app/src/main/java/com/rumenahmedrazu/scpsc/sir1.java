package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sir1 extends AppCompatActivity {
    Button buttonCallSir1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sir1);

        buttonCallSir1 = findViewById(R.id.callSir1);
        buttonCallSir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01744882170"));
                startActivity(intent);
            }
        });
    }
}