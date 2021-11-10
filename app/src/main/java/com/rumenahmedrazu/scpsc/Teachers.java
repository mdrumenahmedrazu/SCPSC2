package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Teachers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);
    }
    public void btnSir1(View view) {
        Intent intent =new Intent(this, sir1.class);
        startActivity(intent);
    }
    public void btnSir2(View view) {
        Intent intent =new Intent(this, Sir2.class);
        startActivity(intent);
    }
}