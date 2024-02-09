package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultsActivity extends AppCompatActivity{
    private TextView txvResult;
    private TextView txvNorm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultsactivity);
        txvResult = findViewById(R.id.txvR);
        txvNorm = findViewById(R.id.txvN);

        Intent intent = getIntent();
        float res = intent.getFloatExtra("res", 0);
        int age = intent.getIntExtra("age", 0);
        txvResult.setText(String.valueOf((int)res));
        if(age >=19&&age<=24) txvNorm.setText("Norm: 19-24");
        if(age >=25&&age<=34) txvNorm.setText("Norm: 20-25");
        if(age >=35&&age<=44) txvNorm.setText("Norm: 21-26");
        if(age >=45&&age<=54) txvNorm.setText("Norm: 22-27");
        if(age >=55&&age<=64) txvNorm.setText("Norm: 23-28");
        if(age >=65) txvNorm.setText("Norm: 24-29");

    }


    public void back(View v){
        Intent intent = new Intent(this,MainActivity .class);
        startActivity(intent);
    }
    public void exit(View v){
        finishAffinity();
    }
}