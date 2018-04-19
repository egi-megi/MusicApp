package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
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

public class OnlyBandsSingerAdapter extends ArrayAdapter<Band> {

    SongsApplication application;

    public OnlyBandsSingerAdapter(@NonNull Context context, @NonNull List<Band> objects, SongsApplication application) {
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

        final Band currentBand = getItem(position);


        // Find the TextView in the band_singer_item.xml layout with the ID version_number
        TextView bandSingerTextView = (TextView) listItemView.findViewById(R.id.band_singer_text_view);
        // Get the version number from the current Band object and
        // set this text on the number TextView
        bandSingerTextView.setText(currentBand.getBandSinger());

        // Find the ImageView in the band_singer_item.xml layout with the ID version_number
        ImageView bandSingerImageView = (ImageView) listItemView.findViewById(R.id.band_singer_image_view);
        // Get the version number from the current Band object and
        // set this image on the number TextView
        bandSingerImageView.setImageResource(currentBand.getImageResourceId());

        // OnClickListener to intent to SongsInBandActivity
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make intent to SingleSongActivity
                Intent bandIntent = new Intent(getContext(), SongsInBandActivity.class);
                String bandName = currentBand.getBandSinger();
                bandIntent.putExtra("band", bandName);
                getContext().startActivity(bandIntent);
            }
        };

        bandSingerTextView.setOnClickListener(listener);
        bandSingerImageView.setOnClickListener(listener);


        return listItemView;
    }
}
