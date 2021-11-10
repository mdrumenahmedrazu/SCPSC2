package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Stafflist extends AppCompatActivity {

    Button buttonCall1;
    Button buttonCall2;
    Button buttonCall3;
    Button buttonCall4;
    Button buttonCall5;
    Button buttonCall6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stafflist);


        buttonCall1 = findViewById(R.id.callOS);
        buttonCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01754798654"));
                startActivity(intent);
            }
        });

        buttonCall2 = findViewById(R.id.callAC);
        buttonCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01878085311"));
                startActivity(intent);
            }
        });

        buttonCall3 = findViewById(R.id.callOA1);
        buttonCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01986275933"));
                startActivity(intent);
            }
        });

        buttonCall4 = findViewById(R.id.callOA2);
        buttonCall4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01986275933"));
                startActivity(intent);
            }
        });

        buttonCall5 = findViewById(R.id.callOA3);
        buttonCall5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01791903416"));
                startActivity(intent);
            }
        });


        buttonCall6 = findViewById(R.id.callOA4);
        buttonCall6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01748448868"));
                startActivity(intent);
            }
        });


    }

}