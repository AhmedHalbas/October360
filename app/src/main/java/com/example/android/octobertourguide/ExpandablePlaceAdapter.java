package com.example.android.octobertourguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class ExpandablePlaceAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> listDataGroup;
    private HashMap<String, List<String>> listDataChild;




    private double LATITUDE[][] = {

            {30.0208015, 30.0305638, 29.972277},

            {29.920244, 29.987828, 30.0401465},

            {29.9441527, 29.9892543},

            {29.980456, 29.9892543},

            {29.962545, 30.029119},

            {29.9753541, 29.987087},

            {29.9717719, 29.9860244, 29.9733205},

            {29.9656936}

    };


    private double LONGITUDE[][] = {

            {31.0033228, 31.0216665, 30.977407},

            {30.917024, 30.986500, 31.0080495},

            {30.8972129, 30.9762311},

            {30.959259, 30.9762311},

            {30.926270, 31.008347},

            {30.9435296, 30.9793495},

            {30.9421476, 30.9714042, 31.0159881},

            {30.9334336}

    };




    public ExpandablePlaceAdapter(Context context, List<String> listDataGroup, HashMap<String, List<String>> listChildData) {
        this.context = context;
        this.listDataGroup = listDataGroup;
        this.listDataChild = listChildData;
    }


    @Override
    public int getGroupCount() {
        return this.listDataGroup.size();
    }

    @Override
    public int getChildrenCount(int i) {


        return this.listDataChild.get(this.listDataGroup.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return this.listDataGroup.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {

        return this.listDataChild.get(this.listDataGroup.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded, View View, ViewGroup parent) {


        TextView BankName = new TextView(context);
        BankName.setText(getGroup(listPosition).toString());
        BankName.setTextColor(Color.BLACK);
        BankName.setPadding(140, 0, 0, 0);
        BankName.setTextSize(30);


        return BankName;
    }


    @Override
    public View getChildView(final int listPosition, final int expandedListPosition, boolean isLastChild, View View, ViewGroup parent) {

        View listItemView = View;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.october_zayed_expandable_list_item, parent, false);
        }


        TextView BranchName = listItemView.findViewById(R.id.branch_name);


        BranchName.setText(getChild(listPosition, expandedListPosition).toString());


        Button Location = listItemView.findViewById(R.id.location_btn);

        Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strUri = context.getApplicationContext().getString(R.string.Uri1) + LATITUDE[listPosition][expandedListPosition] + context.getApplicationContext().getString(R.string.Uri2) +
                        LONGITUDE[listPosition][expandedListPosition] + context.getApplicationContext().getString(R.string.Uri3) + getGroup(listPosition) + " " + getChild(listPosition,expandedListPosition) + context.getApplicationContext().getString(R.string.Uri4);
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
                intent.setClassName(context.getApplicationContext().getString(R.string.packageName), context.getApplicationContext().getString(R.string.className));

                context.startActivity(intent);
            }
        });

        return listItemView;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
