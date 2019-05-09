package com.example.android.octobertourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HyperMarketsFragment extends Fragment {

    private final String[] REVIEWS = {"https://bit.ly/2xDfkdv", "https://bit.ly/2OPqgeL"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.october_zayed_place_list, container, false);


        ArrayList<Place> places = new ArrayList<Place>();


        places.add(new Place(R.drawable.hyperone, getString(R.string.HyperOne), 30.0297118, 31.0220114, REVIEWS[0]));

        places.add(new Place(R.drawable.pandasuper, getString(R.string.PandaSuper), 29.9622546, 30.9275436, REVIEWS[1]));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);


        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
