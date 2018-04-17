package com.example.android.musicapp;

import java.util.Comparator;

/**
 * Created by egi-megi on 17.04.18.
 */

public class BandSingerNaneComparator implements Comparator<Band> {
    @Override
    // Here is made the comparator for songs after titles of songs
    public int compare(Band o1, Band o2) {
        if (o1 != null && o2 != null) {
            if (o1.getBandSinger() != null && o2.getBandSinger() != null) {
                return o1.getBandSinger().compareTo(o2.getBandSinger());
            }
        }
        return 0;
    }
}
