package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 04.04.18.
 */

public class AllSongsActivity extends AppCompatActivity {

    public void goToSingleSongActivity(View view) {
        // Find the View that shows the title
        TextView textView =
                view instanceof ImageView ? (TextView) ((View) view.getParent()).findViewById(R.id.title_text_view) :
                        (TextView) view.findViewById(R.id.title_text_view);

        // Make intent to SingleSongActivity
        Intent titleIntent = new Intent(AllSongsActivity.this, SingleSongActivity.class);
        String songTitle = textView.getText().toString();
        titleIntent.putExtra("titleSingleSong", songTitle);
        startActivity(titleIntent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the songs_list.xml layout file
        setContentView(R.layout.songs_list);

        //Reference to ArrayList of Song named song  which is created in SongsApplication from list allSong
        // using AllSongsAdapter.
        ArrayList<Song> songs = ((SongsApplication) this.getApplication()).allSongs;

        AllSongsAdapter adapter = new AllSongsAdapter(this, songs, ((SongsApplication) this.getApplication()));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }


}
