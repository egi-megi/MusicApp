package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 04.04.18.
 */

public class AllSongsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Find the Button that shows the favorite category
        Button favoriteSongsButton = (Button) findViewById(R.id.button_left);
        favoriteSongsButton.setText(R.string.favorite);
        // Make intent to FavoriteActivity using OnClickListener for bandSinger
        favoriteSongsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoriteIntent = new Intent(AllSongsActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });

        // Find the Button that shows the bandSinger category
        Button bandSingerButton = (Button) findViewById(R.id.button_center);
        bandSingerButton.setText(R.string.music_bands);
        // Make intent to OnlyBandsSingerActivity using OnClickListener for bandSinger
        bandSingerButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent bandSingerIntent = new Intent(AllSongsActivity.this, OnlyBandsSingerActivity.class);
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
                Intent mainActivityIntent = new Intent(AllSongsActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });


        //Reference to ArrayList of Song named song  which is created in SongsApplication from list allSong
        // using AllSongsAdapter.
        ArrayList<Song> songs = ((SongsApplication) this.getApplication()).allSongs;

        AllSongsAdapter adapter = new AllSongsAdapter(this, songs, ((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }


}
