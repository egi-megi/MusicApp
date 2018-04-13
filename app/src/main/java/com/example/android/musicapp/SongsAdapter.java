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
 * Created by egi-megi on 05.04.18.
 */

public class SongsAdapter extends ArrayAdapter<Song> {

    SongsApplication application;

    public SongsAdapter(@NonNull Context context, @NonNull List<Song> objects, SongsApplication application) {
        super(context, 0, objects);
        this.application = application;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_on_list_item, parent, false);
        }

        final Song currentSong = getItem(position);

        // Find the TextView in the song_on_list_itemist_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        titleTextView.setText(currentSong.getTitle());

        // Find the TextView in the song_on_list_item.xmlitem.xml layout with the ID version_number
        TextView bandSingerTextView = (TextView) listItemView.findViewById(R.id.band_singer_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bandSingerTextView.setText(currentSong.getBandSinger());

        // Find the ImageView in the song_on_list_itemist_item.xml layout with the ID version_number
        ImageView bandSingerImageView = (ImageView) listItemView.findViewById(R.id.band_singer_image_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bandSingerImageView.setImageResource(currentSong.getImageResourceId());

        CheckBox favorite_song_checkBox = (CheckBox) listItemView.findViewById(R.id.favorite_checkBox);
        favorite_song_checkBox.setChecked(currentSong.isFavoriteSong());
        favorite_song_checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSong.setFavoriteSong(((CheckBox) v).isChecked());
                application.generateFavSongs();
                SongsAdapter.this.notifyDataSetChanged();
            }
        });


        return listItemView;
    }
}
