package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by egi-megi on 12.04.18.
 */

public class SingleSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_song_item);
        String titleSingleSong = getIntent().getStringExtra("titleSingleSong");
        //Hide the ActionBar
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        actionBar.hide(); // or even hide the actionbar

        Song song = ((SongsApplication) this.getApplication()).findSingleSong(titleSingleSong);

        if (song != null) {
            // Find the TextView in the single_song_item.xml layout with the ID version_name
            TextView titleTextView = (TextView) findViewById(R.id.title_text_view);
            // Get the version name from the current Song object and
            // set this text on the name TextView
            titleTextView.setText(song.getTitle());

            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView bandSingerTextView = (TextView) findViewById(R.id.band_singer_text_view);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            bandSingerTextView.setText(song.getBandSinger());

            // Find the ImageView in the single_song_item.xml layout with the ID version_number
            ImageView bandSingerImageView = (ImageView) findViewById(R.id.band_singer_image_view);
            // Get the version number from the current AndroidFlavor object and
            // set this image on the number ImageView
            bandSingerImageView.setImageResource(song.getImageResourceId());
        }


    }

}