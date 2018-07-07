package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);

        // Create a list of places
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.jw_image, getResources().getString(R.string.jw_name), getResources().getString(R.string.jw_description), getResources().getString(R.string.jw_address),
                getResources().getString(R.string.jw_web), getResources().getString(R.string.jw_phone)));
        places.add(new Place(R.drawable.four_image, getResources().getString(R.string.four_name), getResources().getString(R.string.four_description), getResources().getString(R.string.four_address),
                getResources().getString(R.string.four_web), getResources().getString(R.string.four_phone)));
        places.add(new Place(R.drawable.gran_image, getResources().getString(R.string.gran_name), getResources().getString(R.string.gran_description), getResources().getString(R.string.gran_address),
                getResources().getString(R.string.gran_web), getResources().getString(R.string.gran_phone)));
        places.add(new Place(R.drawable.regis_image, getResources().getString(R.string.regis_name), getResources().getString(R.string.regis_description), getResources().getString(R.string.regis_address),
                getResources().getString(R.string.regis_web), getResources().getString(R.string.regis_phone)));
        places.add(new Place(R.drawable.tl_image, getResources().getString(R.string.tl_name), getResources().getString(R.string.tl_description), getResources().getString(R.string.tl_address),
                getResources().getString(R.string.tl_web), getResources().getString(R.string.tl_phone)));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView1 = (ListView) rootView.findViewById(R.id.city_list);
        listView1.setAdapter(adapter);

        return rootView;
    }
}