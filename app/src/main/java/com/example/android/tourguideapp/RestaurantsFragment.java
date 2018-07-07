package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.city_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.vic_image, getResources().getString(R.string.vic_name), getResources().getString(R.string.vic_description), getResources().getString(R.string.vic_address),
                getResources().getString(R.string.vic_web), getResources().getString(R.string.vic_phone)));
        places.add(new Place(R.drawable.etoile_image, getResources().getString(R.string.etoile_name), getResources().getString(R.string.etoile_description), getResources().getString(R.string.etoile_address),
                getResources().getString(R.string.etoile_web), getResources().getString(R.string.etoile_phone)));
        places.add(new Place(R.drawable.huynh_image, getResources().getString(R.string.huynh_name), getResources().getString(R.string.huynh_description), getResources().getString(R.string.huynh_address),
                getResources().getString(R.string.huynh_web), getResources().getString(R.string.huynh_phone)));
        places.add(new Place(R.drawable.quattro_image, getResources().getString(R.string.quattro_name), getResources().getString(R.string.quattro_description), getResources().getString(R.string.quattro_address),
                getResources().getString(R.string.quattro_web), getResources().getString(R.string.quattro_phone)));
        places.add(new Place(R.drawable.mortons_image, getResources().getString(R.string.mortons_name), getResources().getString(R.string.mortons_description), getResources().getString(R.string.mortons_address),
                getResources().getString(R.string.mortons_web), getResources().getString(R.string.mortons_phone)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView1 = (ListView) rootView.findViewById(R.id.city_list);
        listView1.setAdapter(adapter);

        return rootView;

    }
}
