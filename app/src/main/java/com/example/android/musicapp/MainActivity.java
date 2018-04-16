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

        allSongs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(MainActivity.this, AllSongsActivity.class);
                startActivity(allSongsIntent);
            }
        });


    }

    public void goToFavoriteActivity(View view) {
        // Find the View that shows the favorite category
        TextView favorite = (TextView) findViewById(R.id.favorite);


        Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
        startActivity(favoriteIntent);
    }

    public void goToBandSingerActivity(View view) {
        // Find the View that shows the bandSinger category
        TextView bandSinger = (TextView) findViewById(R.id.music_bands_singers);


        Intent bandSingerIntent = new Intent(MainActivity.this, OnlyBandsSingerActivity.class);
        startActivity(bandSingerIntent);
    }


    public String findSong(View view) {
        EditText searchSongEditText = (EditText) findViewById(R.id.search);
        String titleOfSong = searchSongEditText.getText().toString();
        if (titleOfSong.matches("(.*)+song.getTitle()")) {
            Intent singleSongIntent = new Intent(MainActivity.this, SingleSongActivity.class);
            startActivity(singleSongIntent);
        }
        return titleOfSong;
    }

}