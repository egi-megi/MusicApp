package com.example.android.musicapp;

import java.util.Comparator;

/**
 * Created by egi-megi on 11.04.18.
 */

public class BandSingerComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        if (o1!=null && o2!=null) {
            if (o1.getBandSinger()!=null && o2.getBandSinger()!=null) {
                return o1.getBandSinger().compareTo(o2.getBandSinger());
            }
        }
        return 0;
    }
}