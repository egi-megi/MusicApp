package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 05.04.18.
 */

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songFavorite = ((SongsApplication) this.getApplication()).favSongs;

        SongsAdapter adapter = new SongsAdapter(this, songFavorite,((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }

}

