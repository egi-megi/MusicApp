package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import javax.xml.transform.Source;

/**
 * Created by egi-megi on 04.04.18.
 */

public class AllSongsActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

   ArrayList<Song> songs=((SongsApplication) this.getApplication()).allSongs;

    SongsAdapter adapter = new SongsAdapter(this, songs,((SongsApplication) this.getApplication()));
    ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

/*
        Intent myIntentOfFavoriteSong = new Intent(this, FavoriteActivity.class);
        myIntentOfF/avoriteSong.putExtra("song", songs);
        myIntentOfFavoriteSong.putExtra("song", songs);
        startActivity(myIntentOfFavoriteSong);*/
}

}

