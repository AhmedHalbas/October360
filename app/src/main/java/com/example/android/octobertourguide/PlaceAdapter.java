package com.example.android.octobertourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class PlaceAdapter extends ArrayAdapter<Place> {


    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Place> places) {
        super(context, 0, places);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Place currentPlace = getItem(position);

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.october_zayed__list_item, parent, false);
        }


        ImageView placeImage = listItemView.findViewById(R.id.place_image);


        Glide.with(getContext()).load(currentPlace.getImageID()).into(placeImage);


        TextView placeName = listItemView.findViewById(R.id.place_name);

        placeName.setText(currentPlace.getPlaceName());


        Button Location = listItemView.findViewById(R.id.loc_btn);

        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strUri = getContext().getString(R.string.Uri1) + currentPlace.getLATITUDE() + getContext().getString(R.string.Uri2) + currentPlace.getLONGITUDE() + getContext().getString(R.string.Uri3) + currentPlace.getPlaceName() + getContext().getString(R.string.Uri4);
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName(getContext().getString(R.string.packageName), getContext().getString(R.string.className));

                getContext().startActivity(intent);
            }
        });


        Button reviewSite = listItemView.findViewById(R.id.rev_btn);

        reviewSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(currentPlace.getReview()));
                getContext().startActivity(intent);

            }
        });


        return listItemView;
    }


}
