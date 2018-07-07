package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {


    public PlaceAdapter(Activity Attractions, ArrayList<Place> places) {
        super(Attractions, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_place, parent, false);
        }

        Place currentPlace = getItem(position);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getPlaceImageId());
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.name);
        placeTextView.setText(currentPlace.getPlaceNameId());

        // Find the TextView in the item_place.xml layout with the ID description.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentPlace.getPlaceDescriptionId());

        // Find the TextView in the item_place.xml layout with the ID address.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentPlace.getPlaceAddressId());

        // Find the TextView in the item_place.xml layout with the ID web.
        TextView webTextView = (TextView) listItemView.findViewById(R.id.web);
        webTextView.setText(currentPlace.getPlaceWebId());

        // Find the TextView in the item_place.xml layout with the ID phone.
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        phoneTextView.setText(currentPlace.getPlacePhoneId());


        // Return the whole list item layout (containing 5 TextViews and 1 imageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}

