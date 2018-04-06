package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by egi-megi on 04.04.18.
 */

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

    // Create an array of songs
    ArrayList<Song> song = new ArrayList<Song>();
        song.add(new Song("Somebody That I Used to Know","Gotye"));
        song.add(new Song("I Wanna Dance with Somebody","Whitney Houston"));
        song.add(new Song("One Moment in Time","Whitney Houston"));
        song.add(new Song("I’m Every Woman","Whitney Houston"));
        song.add(new Song("I Will Always Love You","Whitney Houston"));
        song.add(new Song("Hallelujah","Rufus Wainwright"));
        song.add(new Song("Nie jestem sobą","Elektryczne Gitary"));
        song.add(new Song("Nowa gwiazda","Elektryczne Gitary"));
        song.add(new Song("Co ty tutaj robisz","Elektryczne Gitary"));
        song.add(new Song("Przewróciło się niech leży","Elektryczne Gitary"));
        song.add(new Song("Jestem z miasta","Elektryczne Gitary"));
        song.add(new Song("The black pearl","Klaus Badelt"));
        song.add(new Song("My Life Would Suck Without You","Kelly Clarkson"));
        song.add(new Song("Waka Waka (This Time for Africa)","Shakira"));
        song.add(new Song("Radetzky March","Strauss"));
        song.add(new Song("Bałkanica","PIERSI "));


    SongsAdapter adapter = new SongsAdapter(this, song);
    ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
}

}

