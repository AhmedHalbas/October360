package com.example.android.octobertourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ShoppingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.october_zayed_activity_category);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new ShoppingFragment()).commit();


    }
}
