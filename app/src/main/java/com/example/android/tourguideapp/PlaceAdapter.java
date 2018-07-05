package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {
    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;

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

            // Get the {@link Place} object located at this position in the list
            Place currentPlace = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID name.
            TextView placeTextView = (TextView) listItemView.findViewById(R.id.name);
            // Get the Place Name from the currentPlace object and set this text on
            // the Place TextView.
            placeTextView.setText(currentPlace.getPlaceNameId());

            // Find the TextView in the item_place.xml layout with the ID description_text_view.
            TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
            // Get the description from the currentPlace object and set this text on
            // the description TextView.
            descriptionTextView.setText(currentPlace.getPlaceDescriptionId());

            // Find the TextView in the item_place.xml layout with the ID description.
            TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
            // Get the address from the currentPlace object and set this text on
            // the address TextView.
            addressTextView.setText(currentPlace.getPlaceAddressId());

            // Find the TextView in the item_place.xml layout with the ID web.
            TextView webTextView = (TextView) listItemView.findViewById(R.id.web);
            // Get the description from the currentPlace object and set this text on
            // the web TextView.
            webTextView.setText(currentPlace.getPlaceWebId());

            // Find the TextView in the item_place.xml layout with the ID phone.
            TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
            // Get the phone from the currentPlace object and set this text on
            // the phone TextView.
            phoneTextView.setText(currentPlace.getPlacePhoneId());

            // Find the ImageView in the item_place.xml layout with the ID image.
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            // Check if an image is provided for this place or not
                imageView.setVisibility(View.VISIBLE);

            // Set the theme color for the item place
            View textContainer = listItemView.findViewById(R.id.container);
            // Find the color that the resource ID maps to
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            // Set the background color of the text container View
            textContainer.setBackgroundColor(color);

            // Return the whole list item layout (containing 5 TextViews) so that it can be shown in
            // the ListView.
            return listItemView;
        }
    }

