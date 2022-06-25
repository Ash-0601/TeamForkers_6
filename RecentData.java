package com.example.myapplication.model;

public class RecentsData {
    String placename;
    String countryname;
    String price;

    public RecentsData(String placename,String countryname,String price) {
        this.placename = placename;
        this.countryname=countryname;
        this.price=price;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
