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

public class CafesFragment extends Fragment {

    private final String[] REVIEWS = {"https://tinyurl.com/ycnczf6l", "https://tinyurl.com/y96y5j9q", "https://tinyurl.com/y8lkcva5", "https://tinyurl.com/ybnp6z6z", "https://tinyurl.com/y8rwcp7s", "https://tinyurl.com/yclcus22", "https://tinyurl.com/yd3lfryr"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.october_zayed_place_list, container, false);


        ArrayList<Place> places = new ArrayList<Place>();


        places.add(new Place(R.drawable.uno, getString(R.string.UNOCafe), 29.972854968572, 30.944924354553, REVIEWS[0]));

        places.add(new Place(R.drawable.fayrouz, getString(R.string.FairouzCafe), 29.976168218987, 30.952295064926, REVIEWS[1]));

        places.add(new Place(R.drawable.costa, getString(R.string.CostaCafe), 29.974647831815, 30.942432943149, REVIEWS[2]));

        places.add(new Place(R.drawable.zampaleta, getString(R.string.ZampaletaCafe), 29.971465434631, 30.943851342599, REVIEWS[3]));

        places.add(new Place(R.drawable.infinity, getString(R.string.InfinityCafe), 29.971293566816, 30.948507785797, REVIEWS[4]));

        places.add(new Place(R.drawable.future, getString(R.string.FutureCafe), 29.979513885666, 30.947526097298, REVIEWS[5]));

        places.add(new Place(R.drawable.tartino, getString(R.string.TartinoHoffeCafe), 30.06305855071, 30.957273244858, REVIEWS[6]));


        PlaceAdapter adapter = new PlaceAdapter(getContext(), places);


        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }


}
