package com.example.timerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LinearLayout linearScrollableMin = findViewById(R.id.linearScrollableMin);
        View minutesView = getLayoutInflater().inflate(R.layout.activity_main2, null, false);
        linearScrollableMin.addView(minutesView);


    }
    public void hourNumbers(View view){
        TextView hourTV =(TextView) findViewById(view.getId());
        System.out.println(hourTV.getText().toString());
    }
}