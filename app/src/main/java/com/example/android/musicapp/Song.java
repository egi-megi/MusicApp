package com.example.android.musicapp;

/**
 * Created by egi-megi on 05.04.18.
 */

public class Song {

    private String mTitle;
    private String mBandSinger;
    private boolean favorite = false;

    public Song(String title, String bandSinger) {
        mTitle = title;
        mBandSinger = bandSinger;
    }

    public String getTitle() {
        return mTitle;
    };

    public String getBandSinger() {
        return  mBandSinger;
    };

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
