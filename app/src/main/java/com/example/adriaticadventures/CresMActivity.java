package com.example.adriaticadventures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CresMActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cres_mjesto);

        listView = findViewById(R.id.listView);

        //kreirati podatke za listu
        // arraylist<imeliste>
        ArrayList<MjestaCres> arrayList = new ArrayList<>();

        arrayList.add(new MjestaCres(R.drawable.cres1, "Cres 1", "Mjesto je odlicno :)"));
        arrayList.add(new MjestaCres(R.drawable.cres2, "Cres 2", "Mjesto je odlicno :))"));
        arrayList.add(new MjestaCres(R.drawable.cres3, "Cres 3", "Mjesto je odlicno :)"));
        arrayList.add(new MjestaCres(R.drawable.cres1, "Cres 4", "Mjesto je odlicno :)"));
        arrayList.add(new MjestaCres(R.drawable.cres2, "Cres 5", "Mjesto je odlicno :))"));
        arrayList.add(new MjestaCres(R.drawable.cres3, "Cres 6", "Mjesto je odlicno :)"));
        arrayList.add(new MjestaCres(R.drawable.cres1, "Cres 7", "Mjesto je odlicno :)"));
        arrayList.add(new MjestaCres(R.drawable.cres2, "Cres 8", "Mjesto je odlicno :))"));
        arrayList.add(new MjestaCres(R.drawable.cres3, "Cres 9", "Mjesto je odlicno :)"));
        arrayList.add(new MjestaCres(R.drawable.cres1, "Cres 10", "Mjesto je odlicno :)"));
        arrayList.add(new MjestaCres(R.drawable.cres2, "Cres 11", "Mjesto je odlicno :))"));
        arrayList.add(new MjestaCres(R.drawable.cres3, "Cres 12", "Mjesto je odlicno :)"));

        //kreirati adapter nekakav
        MjestaCresAdapter mjestaCresAdapter = new MjestaCresAdapter(this, R.layout.listcp_row,arrayList);

        listView.setAdapter(mjestaCresAdapter);

    }
}