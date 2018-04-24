package com.example.android.musicapp;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * Created by egi-megi on 05.04.18.
 */

public class Song implements Serializable {

    // This is the class in which are placed variables and get methods
    // for titles and bands/singers of songs and for images of these bands/singers
    private String mTitle;
    private String mBandSinger;
    private int mImageResourceId;
    private boolean favoriteSong = false;

    public Song(String title, String bandSinger, int imageResourceId) {
        mTitle = title;
        mBandSinger = bandSinger;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }


    public String getBandSinger() {
        return mBandSinger;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean isFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(boolean favoriteSong) {
        this.favoriteSong = favoriteSong;
    }


}
