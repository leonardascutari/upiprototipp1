package com.example.adriaticadventures;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CresPrirodaAcitvity extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cres_priroda);

        listView = findViewById(R.id.listView);

        //kreirati podatke za listu
        // arraylist<imeliste>
        ArrayList<PrirodaCres> arrayList = new ArrayList<>();

        arrayList.add(new PrirodaCres(R.drawable.cres2, "Cres u prirodi", "Priroda i drustvo <3 :)"));
        arrayList.add(new PrirodaCres(R.drawable.cres2, "Cres u prirodi", "Priroda i drustvo <3 :)"));
        arrayList.add(new PrirodaCres(R.drawable.cres2, "Cres u prirodi", "Priroda i drustvo <3 :)"));
        arrayList.add(new PrirodaCres(R.drawable.cres2, "Cres u prirodi", "Priroda i drustvo <3 :)"));
        arrayList.add(new PrirodaCres(R.drawable.cres2, "Cres u prirodi", "Priroda i drustvo <3 :)"));
        arrayList.add(new PrirodaCres(R.drawable.cres2, "Cres u prirodi", "Priroda i drustvo <3 :)"));

        //kreirati adapter nekakav
        PrirodaCresAdapter prirodaCresAdapter = new PrirodaCresAdapter(this, R.layout.listcm_row,arrayList);

        listView.setAdapter(prirodaCresAdapter);
    }
}