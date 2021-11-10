package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnTeachers(View view) {
        Intent intent =new Intent(this, Class.class);
        startActivity(intent);
    }
    public void btnAdministration(View view) {
        Intent intent =new Intent(this, Administration.class);
        startActivity(intent);
    }
    public void btnNotice(View view) {
        Intent intent =new Intent(this, Notice.class);
        startActivity(intent);
    }
}