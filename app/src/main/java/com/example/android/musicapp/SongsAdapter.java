package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by egi-megi on 05.04.18.
 */

public class SongsAdapter extends ArrayAdapter<Song> {


    public SongsAdapter(@NonNull Context context, @NonNull List<Song> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        titleTextView.setText(currentSong.getTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView bandSingerTextView = (TextView) listItemView.findViewById(R.id.band_singer_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bandSingerTextView.setText(currentSong.getBandSinger());

        // Find the ImageView in the list_item.xml layout with the ID version_number
        ImageView bandSingerImageView = (ImageView) listItemView.findViewById(R.id.band_singer_image_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bandSingerImageView.setImageResource(currentSong.getImageResourceId());

        return listItemView;
    }
}
