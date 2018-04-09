package com.example.android.musicapp;

import android.app.Application;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by egi-megi on 09.04.18.
 */

public class SongsApplication extends Application {
    ArrayList<Song> allSongs;
    ArrayList<Song> favSongs;

    public SongsApplication() {
        this.allSongs = new ArrayList<>();
        favSongs=new ArrayList<>();
        insertSongs();
        Collections.sort(allSongs,new SongsTitleComparator());
        generateFavSongs();
    }

    void insertSongs(){
        allSongs.add(new Song("Somebody That I Used to Know","Gotye", R.drawable.gotye_small));
        allSongs.add(new Song("I Wanna Dance with Somebody","Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("One Moment in Time","Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("I’m Every Woman","Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("I Will Always Love You","Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("Hallelujah","Rufus Wainwright", R.drawable.piersi_small));
        allSongs.add(new Song("Nie jestem sobą","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Nowa gwiazda","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Co ty tutaj robisz","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Przewróciło się niech leży","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Jestem z miasta","Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("The black pearl","Pirates of the Caribbean (soundtrack)", R.drawable.pirates_small));
        allSongs.add(new Song("My Life Would Suck Without You","Kelly Clarkson", R.drawable.clarkson_kelly_small));
        allSongs.add(new Song("Waka Waka (This Time for Africa)","Shakira", R.drawable.shakira_small));
        allSongs.add(new Song("Radetzky March","Strauss", R.drawable.strauss_small));
        allSongs.add(new Song("Bałkanica","PIERSI ", R.drawable.piersi_small));
  }

    public void generateFavSongs(){
        favSongs.clear();
        for (int i=0; i<allSongs.size();i++) {
            Song song = allSongs.get(i);
            if (song.isFavoriteSong()) {
               favSongs.add(song);
            }
        }

        Collections.sort(favSongs,new SongsTitleComparator());
//
//        Song[] s={new Song("Somebody That I Used to Know","Gotye", R.drawable.gotye_small)};
//        for (int i=0 ; i<s.length;i++){
//            Song song=s[i];
//            System.out.println(song.getTitle());
//        }
//
//        for (Song song : s )
//           {System.out.println(song.getTitle());
//        }

    }


}
