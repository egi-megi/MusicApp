package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 11.04.18.
 */

public class OnlyBandsSingerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Find the Button that shows the allSongs category
        Button allSongsButton = (Button) findViewById(R.id.button_left);
        allSongsButton.setText(R.string.all_songs);
        // Make intent to AllSongsActivity using OnClickListener for bandSinger
        allSongsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent allSongsIntent = new Intent(OnlyBandsSingerActivity.this, AllSongsActivity.class);
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
                Intent bandSingerIntent = new Intent(OnlyBandsSingerActivity.this, FavoriteActivity.class);
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
                Intent mainActivityIntent = new Intent(OnlyBandsSingerActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

        //Reference to ArrayList of Band named bandsSingers which is created in SongsApplication from list bandsList
        // using OnlyBandsSingerAdapter.
        ArrayList<Band> bandsSingers = ((SongsApplication) this.getApplication()).bandsList;

        OnlyBandsSingerAdapter adapter = new OnlyBandsSingerAdapter(this, bandsSingers, ((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }


}
