package com.example.android.octobertourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BanksFragment extends Fragment {

    private int lastExpandedGroupPosition = 0;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.october_zayed_expandable_place_list, container, false);



        Data();


        ExpandablePlaceAdapter expandableAdapter = new ExpandablePlaceAdapter(getContext(),listDataGroup,listDataChild);
        final ExpandableListView expandableListView = rootView.findViewById(R.id.expand_listview);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

                if (groupPosition != lastExpandedGroupPosition) {
                    expandableListView.collapseGroup(lastExpandedGroupPosition);
                }
                lastExpandedGroupPosition = groupPosition;

            }
        });

        expandableListView.setAdapter(expandableAdapter);




        return rootView;
    }


    public void Data()
    {
        listDataGroup = new ArrayList<>();
        listDataChild = new HashMap<>();

        listDataGroup.add(getString(R.string.HSBC));
        listDataGroup.add(getString(R.string.Alex));
        listDataGroup.add(getString(R.string.QNB));
        listDataGroup.add(getString(R.string.NBE));
        listDataGroup.add(getString(R.string.CIB));
        listDataGroup.add(getString(R.string.CairoBank));
        listDataGroup.add(getString(R.string.MisrBank));
        listDataGroup.add(getString(R.string.AudiBank));

        String[] array;


        List<String> HSBCBranches = new ArrayList<>();
        array = getResources().getStringArray(R.array.HSBCBranches);
        for (String item : array) {
            HSBCBranches.add(item);
        }

        List<String> AlexBranches = new ArrayList<>();
        array = getResources().getStringArray(R.array.AlexBranches);
        for (String item : array) {
            AlexBranches.add(item);
        }

        List<String> QNBBranches = new ArrayList<>();
        array = getResources().getStringArray(R.array.QNBBranches);
        for (String item : array) {
            QNBBranches.add(item);
        }

        List<String> NBEBranches = new ArrayList<>();
        array = getResources().getStringArray(R.array.NBEBranches);
        for (String item : array) {
            NBEBranches.add(item);
        }

        List<String> CIBBranches = new ArrayList<>();
        array = getResources().getStringArray(R.array.CIBBranches);
        for (String item : array) {
            CIBBranches.add(item);
        }

        List<String> CairoBranches = new ArrayList<>();
        array = getResources().getStringArray(R.array.CairoBranches);
        for (String item : array) {
            CairoBranches.add(item);
        }

        List<String> MisrBranches = new ArrayList<>();
        array = getResources().getStringArray(R.array.MisrBranches);
        for (String item : array) {
            MisrBranches.add(item);
        }

        List<String> AudiBranch = new ArrayList<>();
        array = getResources().getStringArray(R.array.AudiBranch);
        for (String item : array) {
            AudiBranch.add(item);
        }

        // Adding child data
        listDataChild.put(listDataGroup.get(0), HSBCBranches);
        listDataChild.put(listDataGroup.get(1), AlexBranches);
        listDataChild.put(listDataGroup.get(2), QNBBranches);
        listDataChild.put(listDataGroup.get(3), NBEBranches);
        listDataChild.put(listDataGroup.get(4), CIBBranches);
        listDataChild.put(listDataGroup.get(5), CairoBranches);
        listDataChild.put(listDataGroup.get(6), MisrBranches);
        listDataChild.put(listDataGroup.get(7), AudiBranch);


    }
}
