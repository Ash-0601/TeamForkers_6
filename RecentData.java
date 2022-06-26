package com.example.dreamtravel.model;

import android.media.Image;

public class RecentData {
    String placename;
    String countryname;
    String state;
    Image imageurl;

    public Image getImageurl() {
        return imageurl;
    }

    public void setImageurl(Image imageurl) {
        this.imageurl = imageurl;
    }

    public void RecentsData(String placename, String state, String countryname) {
        this.placename = placename;
        this.countryname=countryname;
        this.state=state;
        this.imageurl=imageurl;

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}

