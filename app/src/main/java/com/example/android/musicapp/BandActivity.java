package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 11.04.18.
 */

public class BandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        String band=getIntent().getStringExtra("band");

        ArrayList<Song> songsInBand=((SongsApplication) this.getApplication()).generateSongsInBand(band);

        SongsInBandAdapter adapter = new SongsInBandAdapter(this, songsInBand,((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }

}