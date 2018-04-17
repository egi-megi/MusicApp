package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find the View that shows the all songs category
        TextView allSongs = (TextView) findViewById(R.id.all_songs);

        // Make intent to AllSongsActivity using OnClickListener for allSongs
        allSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongsActivity.class);
                startActivity(allSongsIntent);
            }
        });


        // Find the View that shows the favorite category
        TextView favorite = (TextView) findViewById(R.id.favorite);

        // Make intent to FavoriteActivity using OnClickListener for favorite
        favorite.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
            });


        // Find the View that shows the bandSinger category
        TextView bandSinger = (TextView) findViewById(R.id.music_bands_singers);

        // Make intent to OnlyBandsSingerActivity using OnClickListener for bandSinger
        bandSinger.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
        Intent bandSingerIntent = new Intent(MainActivity.this, OnlyBandsSingerActivity.class);
        startActivity(bandSingerIntent);
            }
        });
    }

    // Make method for searching the song after title. It is not complete method
    // because it finds only first song for searching word
    public void findSong(View view) {
        EditText searchSongEditText = (EditText) findViewById(R.id.search);
        String titleOfSong = searchSongEditText.getText().toString();
        for (Song s : ((SongsApplication) getApplication()).allSongs) {
            if (s.getTitle().toLowerCase().matches(".*" + titleOfSong.toLowerCase() + ".*")) {
                Intent singleSongIntent = new Intent(MainActivity.this, SingleSongActivity.class);
                singleSongIntent.putExtra("titleSingleSong", s.getTitle());
                startActivity(singleSongIntent);
                return; // Here the method is breaking
            }
        }
    }

}