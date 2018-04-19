package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 11.04.18.
 */

public class SongsInBandActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the songs_list.xml layout file
        setContentView(R.layout.songs_list);
        String band = getIntent().getStringExtra("band");

        // Set in ActionBar like name of band or singer
        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        getSupportActionBar().setTitle(band); // set the top title


        // Find the Button that shows the allSongs category
        Button allSongsButton = (Button) findViewById(R.id.button_left);
        allSongsButton.setText(R.string.all_songs);
        // Make intent to AllSongsActivity using OnClickListener for bandSinger
        allSongsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(SongsInBandActivity.this, AllSongsActivity.class);
                startActivity(allSongsIntent);
            }
        });

        // Find the Button that shows the favorite songs category
        Button favoriteButton = (Button) findViewById(R.id.button_center);
        favoriteButton.setText(R.string.favorite);
        // Make intent to FavoriteActivity using OnClickListener for bandSinger
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent bandSingerIntent = new Intent(SongsInBandActivity.this, FavoriteActivity.class);
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
                Intent mainActivityIntent = new Intent(SongsInBandActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

        //Reference to ArrayList of Song named songsInBand which is created in SongsApplication using
        // generateSongsInBand(band) method and using OnlyBandsSingerAdapter.
        ArrayList<Song> songsInBand = ((SongsApplication) this.getApplication()).generateSongsInBand(band);

        SongsInBandAdapter adapter = new SongsInBandAdapter(this, songsInBand, ((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }

}