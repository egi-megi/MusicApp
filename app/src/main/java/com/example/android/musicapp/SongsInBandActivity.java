package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 11.04.18.
 */

public class SongsInBandActivity extends AppCompatActivity {

    public void goToSingleSongActivity(View view) {
        // Find the View that shows the bandSinger category
        TextView textView =
                view instanceof ImageView ? (TextView) ((View) view.getParent()).findViewById(R.id.title_text_view) :
                        (TextView) view.findViewById(R.id.title_text_view);

        Intent titleIntent = new Intent(SongsInBandActivity.this, SingleSongActivity.class);
        String songTitle = textView.getText().toString();
        titleIntent.putExtra("titleSingleSong", songTitle);
        startActivity(titleIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        String band = getIntent().getStringExtra("band");

        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        getSupportActionBar().setTitle(band); // set the top title

        ArrayList<Song> songsInBand = ((SongsApplication) this.getApplication()).generateSongsInBand(band);

        SongsInBandAdapter adapter = new SongsInBandAdapter(this, songsInBand, ((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }

}