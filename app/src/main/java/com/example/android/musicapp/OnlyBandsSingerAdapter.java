package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by egi-megi on 11.04.18.
 */

public class OnlyBandsSingerAdapter extends ArrayAdapter<String> {

    SongsApplication application;

    public OnlyBandsSingerAdapter(@NonNull Context context, @NonNull List<String> objects, SongsApplication application) {
        super(context, 0, objects);
        this.application = application;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.band_singer_item, parent, false);
        }

        final String currentBand = getItem(position);


        // Find the TextView in the song_on_list_itemist_item.xml layout with the ID version_number
        TextView bandSingerTextView = (TextView) listItemView.findViewById(R.id.band_singer_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bandSingerTextView.setText(currentBand);

        return listItemView;
    }
}
