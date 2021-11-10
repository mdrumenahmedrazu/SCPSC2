package com.rumenahmedrazu.scpsc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Administration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administration);
    }
    public void btnStaff(View view) {
        Intent intent =new Intent(this, Stafflist.class);
        startActivity(intent);
    }
    public void btnTeacher(View view) {
        Intent intent =new Intent(this, Teachers.class);
        startActivity(intent);
    }
    public void btnAbout(View view) {
        Intent intent =new Intent(this, About_us.class);
        startActivity(intent);
    }
    public void btnBus(View view) {
        Intent intent =new Intent(this, Businformation.class);
        startActivity(intent);
    }
    public void btnAccounts(View view) {
        Intent intent =new Intent(this, Accounts.class);
        startActivity(intent);
    }
    public void btnRules(View view) {
        Intent intent =new Intent(this, Acarules.class);
        startActivity(intent);
    }
}