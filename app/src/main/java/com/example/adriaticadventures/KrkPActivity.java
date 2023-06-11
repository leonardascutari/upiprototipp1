package com.example.adriaticadventures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KrkPActivity extends AppCompatActivity {

    Button mjestofragmentBtn, prirodafragmentBtn, zanimljivostfragbtn, zabavafragbtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krk_pactivity);

        mjestofragmentBtn = findViewById(R.id.btnkrkmjesta);
        prirodafragmentBtn = findViewById(R.id.btnkrkpriroda);
        zanimljivostfragbtn = findViewById(R.id.btnkrkzanimljivosti);
        zabavafragbtn = findViewById(R.id.btnkrkzabava);


    }

}