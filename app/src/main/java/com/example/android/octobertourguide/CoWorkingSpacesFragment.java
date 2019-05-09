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

public class CoWorkingSpacesFragment extends Fragment {

    private final String[] REVIEWS = {"https://tinyurl.com/y72xzjfu", "https://tinyurl.com/yarokfyq", "https://tinyurl.com/yanxx8wz", "https://tinyurl.com/y8pvjpa5"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.october_zayed_place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.thezone, getString(R.string.TheZone), 29.978556, 30.945889, REVIEWS[0]));

        places.add(new Place(R.drawable.villa307, getString(R.string.Villa307), 29.977799, 30.944731, REVIEWS[1]));

        places.add(new Place(R.drawable.bosla, getString(R.string.Bosla), 29.9759939, 30.9428797, REVIEWS[2]));

        places.add(new Place(R.drawable.hashtags, getString(R.string.Hashtags), 29.9690293, 30.9544317, REVIEWS[3]));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
