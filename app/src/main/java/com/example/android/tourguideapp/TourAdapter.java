package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourAdapter extends FragmentPagerAdapter {

    public TourAdapter(FragmentManager fragmentManager, MainActivity mainActivity) {
        super(fragmentManager);
    }

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public TourAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new ShoppingFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.Shop);
        } else if (position == 2) {
            return mContext.getString(R.string.Tour);
        } else {
            return mContext.getString(R.string.Eat);
        }
    }
}
