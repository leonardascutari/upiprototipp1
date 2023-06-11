package com.example.adriaticadventures;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CresZabavaActivity extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cres_zabava);

        listView = findViewById(R.id.listView);

        //kreirati podatke za listu
        // arraylist<imeliste>
        ArrayList<ZabavaCres> arrayList = new ArrayList<>();

        arrayList.add(new ZabavaCres(R.drawable.cres3, "Night life", ":)"));


        //kreirati adapter nekakav
        ZabavaCresAdapter zabavaCresAdapter = new ZabavaCresAdapter(this, R.layout.listczz_row,arrayList);

        listView.setAdapter(zabavaCresAdapter);
    }
}