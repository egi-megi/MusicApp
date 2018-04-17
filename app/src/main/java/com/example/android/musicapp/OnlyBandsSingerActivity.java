package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 11.04.18.
 */

public class OnlyBandsSingerActivity extends AppCompatActivity {

    public void goToBandActivity(View view) {
        // Find the View that shows the band/singer name
        TextView textView = (TextView) view.findViewById(R.id.band_singer_text_view);

        // Make intent to SongsInBandActivity
        Intent bandIntent = new Intent(OnlyBandsSingerActivity.this, SongsInBandActivity.class);
        String bandName = textView.getText().toString();
        bandIntent.putExtra("band", bandName);
        startActivity(bandIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        //Reference to ArrayList of Band named bandsSingers which is created in SongsApplication from list bandsList
        // using OnlyBandsSingerAdapter.
        ArrayList<Band> bandsSingers = ((SongsApplication) this.getApplication()).bandsList;

        OnlyBandsSingerAdapter adapter = new OnlyBandsSingerAdapter(this, bandsSingers, ((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }


}
