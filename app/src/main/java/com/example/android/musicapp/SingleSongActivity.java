package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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

        // Find the Button that shows the allSongs category
        Button allSongsButton = (Button) findViewById(R.id.button_left);
        allSongsButton.setText(R.string.all_songs);
        // Make intent to AllSongsActivity using OnClickListener for bandSinger
        allSongsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(SingleSongActivity.this, AllSongsActivity.class);
                startActivity(allSongsIntent);
            }
        });

        // Find the Button that shows the favorite songs category
        Button favoriteButton = (Button) findViewById(R.id.button_center_left);
        favoriteButton.setText(R.string.favorite);
        // Make intent to FavoriteActivity using OnClickListener for bandSinger
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(SingleSongActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Find the Button that shows the bands category
        Button bandsButton = (Button) findViewById(R.id.button_center_right);
        bandsButton.setText(R.string.music_bands);
        // Make intent to OnlyBandsSingerActivity using OnClickListener for bandSinger
        bandsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent bandSingerIntent = new Intent(SingleSongActivity.this, OnlyBandsSingerActivity.class);
                startActivity(bandSingerIntent);
            }
        });


        // Find the Button that shows the main category
        Button mainActivityButton = (Button) findViewById(R.id.button_right);
        mainActivityButton.setText(R.string.main_activity);
        // Make intent to MainActivity using OnClickListener for bandSinger
        mainActivityButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainActivityIntent = new Intent(SingleSongActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

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