package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 11.04.18.
 */

public class BandsSingerActivity extends AppCompatActivity {

    public void goToBandActivity(View view) {
        // Find the View that shows the bandSinger category
        TextView textView = (TextView) view.findViewById(R.id.band_singer_text_view);


        Intent bandIntent = new Intent(BandsSingerActivity.this, BandActivity.class);
        String bandName=textView.getText().toString();
        bandIntent.putExtra("band",bandName);
        startActivity(bandIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<String> bandsSingers = ((SongsApplication) this.getApplication()).bandsList;

        BandsAdapter adapter = new BandsAdapter(this, bandsSingers,((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }



}
