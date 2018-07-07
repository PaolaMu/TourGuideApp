package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.city_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.green_image, getResources().getString(R.string.green_name), getResources().getString(R.string.green_description), getResources().getString(R.string.green_address),
                getResources().getString(R.string.green_web), getResources().getString(R.string.green_phone)));
        places.add(new Place(R.drawable.tunnel_image, getResources().getString(R.string.tunnel_name), getResources().getString(R.string.tunnel_description), getResources().getString(R.string.tunnel_address),
                getResources().getString(R.string.tunnel_web), getResources().getString(R.string.tunnel_phone)));
        places.add(new Place(R.drawable.galleria_image, getResources().getString(R.string.galleria_name), getResources().getString(R.string.galleria_description), getResources().getString(R.string.galleria_address),
                getResources().getString(R.string.galleria_web), getResources().getString(R.string.galleria_phone)));
        places.add(new Place(R.drawable.memorial_image, getResources().getString(R.string.memorial_name), getResources().getString(R.string.memorial_description), getResources().getString(R.string.memorial_address),
                getResources().getString(R.string.memorial_web), getResources().getString(R.string.memorial_phone)));
        places.add(new Place(R.drawable.town_image, getResources().getString(R.string.town_name), getResources().getString(R.string.town_description), getResources().getString(R.string.town_address),
                getResources().getString(R.string.town_web), getResources().getString(R.string.town_phone)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView1 = (ListView) rootView.findViewById(R.id.city_list);
        listView1.setAdapter(adapter);

        return rootView;
    }
}
