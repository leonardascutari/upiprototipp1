package com.example.adriaticadventures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CresZAcitvity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cres_zacitvity);

        listView = findViewById(R.id.listView);

        //kreirati podatke za listu
        // arraylist<imeliste>
        ArrayList<ZnamenitostiCres> arrayList = new ArrayList<>();

        arrayList.add(new ZnamenitostiCres(R.drawable.cres1, "Otok Cres 1", "Predivno je zaista"));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres2, "Otok Cres 2", "Lijepo je zaista"));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));
        arrayList.add(new ZnamenitostiCres(R.drawable.cres3, "Otok Cres 3", "No stress on Cres."));

        //kreirati adapter nekakav
        ZnamenitostiCresAdapter znamenitostiCresAdapter = new ZnamenitostiCresAdapter(this, R.layout.listcz_row,arrayList);

        listView.setAdapter(znamenitostiCresAdapter);
    }
}