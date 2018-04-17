package com.example.android.musicapp;

import android.app.Application;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by egi-megi on 09.04.18.
 */

public class SongsApplication extends Application {
    // Here are declaring the components of the class SongsApplication
    ArrayList<Song> allSongs;
    ArrayList<Song> favSongs;
    ArrayList<Band> bandsList;

    public SongsApplication() {
        // Here are create 3 new ArrayLists for objects Song and Band included songs
        this.allSongs = new ArrayList<>();
        favSongs = new ArrayList<>();
        bandsList = new ArrayList<>();
        insertSongs();
        // Sorting songs after titles in allSongs ArrayList
        Collections.sort(allSongs, new SongsTitleComparator());
        // Running the method for create favorite songs list
        generateFavSongs();
        // Running the method for create bands/singers list
        generateBandsList();
        // Sorting songs after names fo band/singer in bandsList ArrayList
        Collections.sort(bandsList, new BandSingerNaneComparator());
    }

    //Here are placed all songs for this Music Application
    void insertSongs() {
        allSongs.add(new Song("Somebody That I Used to Know", "Gotye", R.drawable.gotye_small));
        allSongs.add(new Song("I Wanna Dance with Somebody", "Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("One Moment in Time", "Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("I’m Every Woman", "Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("I Will Always Love You", "Whitney Houston", R.drawable.whitney_houston_small));
        allSongs.add(new Song("Hallelujah", "Rufus Wainwright", R.drawable.hallelujah_small));
        allSongs.add(new Song("Nie jestem sobą", "Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Nowa gwiazda", "Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Co ty tutaj robisz", "Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Przewróciło się niech leży", "Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("Jestem z miasta", "Elektryczne Gitary", R.drawable.elektryczne_gitary_small));
        allSongs.add(new Song("The black pearl", "Pirates of the Caribbean (soundtrack)", R.drawable.pirates_small));
        allSongs.add(new Song("My Life Would Suck Without You", "Kelly Clarkson", R.drawable.clarkson_kelly_small));
        allSongs.add(new Song("Waka Waka (This Time for Africa)", "Shakira", R.drawable.shakira_small));
        allSongs.add(new Song("Radetzky March", "Strauss", R.drawable.strauss_small));
        allSongs.add(new Song("Bałkanica", "Piersi ", R.drawable.piersi_small));
    }

    //This method adding songs to favSongs ArrayList
    public void generateFavSongs() {
        favSongs.clear();
        for (int i = 0; i < allSongs.size(); i++) {
            Song song = allSongs.get(i);
            if (song.isFavoriteSong()) {
                favSongs.add(song);
            }
        }
        // Sorting songs after titles
        Collections.sort(favSongs, new SongsTitleComparator());
    }

    //This method adding songs to bandsList ArrayList if in the bandList there is not this song
    private void generateBandsList() {
        ArrayList<String> helpl = new ArrayList<>();
        for (int i = 0; i < allSongs.size(); i++) {
            Song song = allSongs.get(i);
            if (!helpl.contains(song.getBandSinger())) {
                helpl.add(song.getBandSinger());
                bandsList.add(new Band(song.getBandSinger(), song.getImageResourceId()));
            }
        }

    }

    //This method adding songs to songsForBand ArrayList for one band - in one SongsInBandActivity
    public ArrayList<Song> generateSongsInBand(String band) {
        ArrayList<Song> songsForBand = new ArrayList<>();
        for (int i = 0; i < allSongs.size(); i++) {
            Song song = allSongs.get(i);
            if (song.getBandSinger().equals(band)) {
                songsForBand.add(song);
            }
        }
        // Sorting songs after titles
        Collections.sort(songsForBand, new SongsTitleComparator());
        return songsForBand;
    }

    // Method fot display single song in SingleSongActivity
    public Song findSingleSong(String titleSingleSong) {
        for (int i = 0; i < allSongs.size(); i++) {
            Song song = allSongs.get(i);
            if (song.getTitle().equals(titleSingleSong)) {
                return song;
            }
        }
        return null;
    }


}
