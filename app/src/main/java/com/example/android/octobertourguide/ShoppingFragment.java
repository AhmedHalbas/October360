package com.example.android.octobertourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShoppingFragment extends Fragment {

    private final String[] REVIEWS = {"https://bit.ly/2xlKMgk", "https://bit.ly/2xo8QyY", "https://bit.ly/2O7eM9a", "https://bit.ly/2OMdPQX", "https://bit.ly/2MW2oEo", "https://bit.ly/2xxuhhm", "https://bit.ly/2OL679L", "https://4sq.com/2ztELj4"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.october_zayed_place_list, container, false);


        ArrayList<Place> places = new ArrayList<>();


        places.add(new Place(R.drawable.mallofegypt, getString(R.string.MallofEgypt), 29.9722532, 31.0175244, REVIEWS[0]));

        places.add(new Place(R.drawable.mallofarabia, getString(R.string.MallofArabia), 30.0062993, 30.9734805, REVIEWS[1]));

        places.add(new Place(R.drawable.cityscapemall, getString(R.string.CityscapeMall), 29.9631542, 30.9269062, REVIEWS[2]));

        places.add(new Place(R.drawable.americanaplazamall, getString(R.string.AmericanaPlazaMall), 30.0275556, 31.0136, REVIEWS[3]));

        places.add(new Place(R.drawable.arkanplazamall, getString(R.string.ArkanPlazaMall), 30.0206259, 31.0057175, REVIEWS[4]));

        places.add(new Place(R.drawable.capitalbusinesspark, getString(R.string.CapitalBusinessPark), 30.0254024, 31.0124338, REVIEWS[5]));

        places.add(new Place(R.drawable.familymall, getString(R.string.FamilyMall), 29.9764122, 30.9540948, REVIEWS[6]));

        places.add(new Place(R.drawable.almorshedymall, getString(R.string.AlMorshedy), 29.9647914, 30.9254183, REVIEWS[7]));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);


        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }


}

