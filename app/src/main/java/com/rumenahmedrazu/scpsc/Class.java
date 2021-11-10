package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
    }
    public void btnOne(View view) {
        Intent intent =new Intent(this, One.class);
        startActivity(intent);
    }
    public void btnTwo(View view) {
        Intent intent =new Intent(this, Two.class);
        startActivity(intent);
    }
    public void btnThree(View view) {
        Intent intent =new Intent(this, Three.class);
        startActivity(intent);
    }
    public void btnFour(View view) {
        Intent intent =new Intent(this, Four.class);
        startActivity(intent);
    }
    public void btnFive(View view) {
        Intent intent =new Intent(this, Five.class);
        startActivity(intent);
    }
    public void btnSix(View view) {
        Intent intent =new Intent(this, Six.class);
        startActivity(intent);
    }
    public void btnSeven(View view) {
        Intent intent =new Intent(this, Seven.class);
        startActivity(intent);
    }
    public void btnEight(View view) {
        Intent intent =new Intent(this, Eight.class);
        startActivity(intent);
    }
    public void btnNine(View view) {
        Intent intent =new Intent(this, Nine.class);
        startActivity(intent);
    }
    public void btnTen(View view) {
        Intent intent =new Intent(this, Ten.class);
        startActivity(intent);
    }
    public void btnEleven(View view) {
        Intent intent =new Intent(this, Eleven.class);
        startActivity(intent);
    }
    public void btnTwelve(View view) {
        Intent intent =new Intent(this, Twelve.class);
        startActivity(intent);
    }
}