package com.example.android.musicapp;

/**
 * Created by egi-megi on 05.04.18.
 */

public class Song {

    private String mTitle;
    private String mBandSinger;
    private int mImageResourceId;
    private boolean favorite = false;

    public Song(String title, String bandSinger, int imageResourceId) {
        mTitle = title;
        mBandSinger = bandSinger;
        mImageResourceId=imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    };

    public String getBandSinger() {
        return  mBandSinger;
    };

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
