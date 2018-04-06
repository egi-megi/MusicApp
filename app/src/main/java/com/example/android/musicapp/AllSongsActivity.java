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
        song.add(new Song("Somebody That I Used to Know","Gotye", R.drawable.gotye_small));
        song.add(new Song("I Wanna Dance with Somebody","Whitney Houston", R.drawable.whitney_houston_small));
        song.add(new Song("One Moment in Time","Whitney Houston", R.drawable.whitney_houston_small));
        song.add(new Song("I’m Every Woman","Whitney Houston", R.drawable.whitney_houston_small));
        song.add(new Song("I Will Always Love You","Whitney Houston", R.drawable.whitney_houston_small));
        song.add(new Song("Hallelujah","Rufus Wainwright", R.drawable.piersi_small));
        song.add(new Song("Nie jestem sobą","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        song.add(new Song("Nowa gwiazda","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        song.add(new Song("Co ty tutaj robisz","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        song.add(new Song("Przewróciło się niech leży","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        song.add(new Song("Jestem z miasta","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        song.add(new Song("The black pearl","Pirates of the Caribbean (soundtrack)", R.drawable.pirates_small));
        song.add(new Song("My Life Would Suck Without You","Kelly Clarkson", R.drawable.clarkson_kelly_small));
        song.add(new Song("Waka Waka (This Time for Africa)","Shakira", R.drawable.shakira_small));
        song.add(new Song("Radetzky March","Strauss", R.drawable.strauss_small));
        song.add(new Song("Bałkanica","PIERSI ", R.drawable.piersi_small));


    SongsAdapter adapter = new SongsAdapter(this, song);
    ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
}

}

