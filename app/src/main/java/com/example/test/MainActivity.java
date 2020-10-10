package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowResult(View view) {
        TextView txtFortune = findViewById(R.id.txtFortune);

        Random rand = new Random();
        int num = rand.nextInt(4);

        String[] result = {"大吉", "吉","末吉","凶"};

        txtFortune.setText(result[num]);
    }
}