package com.example.android.musicapp;

import android.support.annotation.NonNull;

import java.util.Comparator;

/**
 * Created by egi-megi on 09.04.18.
 */

public class SongsTitleComparator implements Comparator<Song>{
    @Override
    public int compare(Song o1, Song o2) {
            if (o1!=null && o2!=null) {
                if (o1.getTitle()!=null && o2.getTitle()!=null) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            }
            return 0;
    }
}

