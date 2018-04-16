package com.example.android.musicapp;

import java.io.Serializable;

/**
 * Created by egi-megi on 16.04.18.
 */

public class Band implements Serializable {

    private String mBandSinger;
    private int mImageResourceId;

    public Band(String bandSinger, int imageResourceId) {
        mBandSinger = bandSinger;
        mImageResourceId=imageResourceId;
    }


    public String getBandSinger() {
        return  mBandSinger;
    };

    public int getImageResourceId() {
        return mImageResourceId;
    }



}
