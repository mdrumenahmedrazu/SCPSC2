package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sir2 extends AppCompatActivity {
    Button buttonCallSir2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sir2);

        buttonCallSir2 = findViewById(R.id.callSir2);
        buttonCallSir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01710094500"));
                startActivity(intent);
            }
        });
    }
}