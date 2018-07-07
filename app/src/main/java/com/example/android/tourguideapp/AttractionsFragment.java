package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);

        // Create a list of places
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.cockrell_image, getResources().getString(R.string.cockrell_name), getResources().getString(R.string.cockrell_description), getResources().getString(R.string.cockrell_address),
                getResources().getString(R.string.cockrell_web), getResources().getString(R.string.cockrell_phone)));
        places.add(new Place(R.drawable.waugh_image, getResources().getString(R.string.waugh_name), getResources().getString(R.string.waugh_description), getResources().getString(R.string.waugh_address),
                getResources().getString(R.string.waugh_web), getResources().getString(R.string.waugh_phone)));
        places.add(new Place(R.drawable.space_image, getResources().getString(R.string.space_name), getResources().getString(R.string.space_description), getResources().getString(R.string.space_address),
                getResources().getString(R.string.space_web), getResources().getString(R.string.space_phone)));
        places.add(new Place(R.drawable.aqua_image, getResources().getString(R.string.aqua_name), getResources().getString(R.string.aqua_description), getResources().getString(R.string.aqua_address),
                getResources().getString(R.string.aqua_web), getResources().getString(R.string.aqua_phone)));
        places.add(new Place(R.drawable.zoo_image, getResources().getString(R.string.zoo_name), getResources().getString(R.string.zoo_description), getResources().getString(R.string.zoo_address),
                getResources().getString(R.string.zoo_web), getResources().getString(R.string.zoo_phone)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView1 = (ListView) rootView.findViewById(R.id.city_list);
        listView1.setAdapter(adapter);

        return rootView;
    }
}