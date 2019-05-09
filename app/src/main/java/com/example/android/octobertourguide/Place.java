package com.example.android.octobertourguide;


public class Place {

    private int mImageID;
    private String mPlaceName;
    private double mLATITUDE;
    private double mLONGITUDE;
    private String mReview;


    public Place(int imageID, String placeName, double LATITUDE, double LONGITUDE, String review) {
        this.mImageID = imageID;
        this.mPlaceName = placeName;
        this.mLATITUDE = LATITUDE;
        this.mLONGITUDE = LONGITUDE;
        this.mReview = review;

    }


    public int getImageID() {
        return mImageID;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public double getLATITUDE() {
        return mLATITUDE;
    }

    public double getLONGITUDE() {
        return mLONGITUDE;
    }

    public String getReview() {
        return mReview;
    }


}



