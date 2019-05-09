package com.example.android.octobertourguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private final String[] Tab = {"Shopping", "Hyper Markets", "Restaurants", "Coffee Shops", "Co-Working Spaces", "Banks"};

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ShoppingFragment();
        } else if (position == 1) {
            return new HyperMarketsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else if (position == 3) {
            return new CafesFragment();
        } else if (position == 4) {
            return new CoWorkingSpacesFragment();
        } else if (position == 5) {
            return new BanksFragment();
        }

        return null;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return Tab[0];

            case 1:
                return Tab[1];

            case 2:
                return Tab[2];

            case 3:
                return Tab[3];

            case 4:
                return Tab[4];

            case 5:
                return Tab[5];

            default:
                return null;

        }
    }


}
