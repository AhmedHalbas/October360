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

public class RestaurantsFragment extends Fragment {

    private final String[] REVIEWS = {"https://bit.ly/2ONQWfN", "https://bit.ly/2Q2Uj2P", "https://bit.ly/2DwfIjz", "https://bit.ly/2OarMLk", "https://bit.ly/2Dt8HQf", "https://bit.ly/2O948iu"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.october_zayed_place_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.chickenfilla, getString(R.string.ChickenFilA), 29.9763389, 30.9563023, REVIEWS[0]));

        places.add(new Place(R.drawable.lillys, getString(R.string.Lillys), 30.028212, 31.000469, REVIEWS[1]));

        places.add(new Place(R.drawable.maharaja, getString(R.string.Maharaja), 29.9722168, 30.9540534, REVIEWS[2]));

        places.add(new Place(R.drawable.portadoro, getString(R.string.PortaDoro), 30.030769, 31.001682, REVIEWS[3]));

        places.add(new Place(R.drawable.zacks, getString(R.string.ZacksFriedChicken), 29.958655, 30.91763, REVIEWS[4]));

        places.add(new Place(R.drawable.rosto, getString(R.string.Rosto), 29.9743844, 30.9449542, REVIEWS[5]));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }


}
