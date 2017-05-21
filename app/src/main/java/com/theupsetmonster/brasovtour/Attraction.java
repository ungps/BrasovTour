package com.theupsetmonster.brasovtour;

public class Attraction {
    String name;
    String location;
    float rating;
    int preview;

    public Attraction(String name, String location, float rating, int preview) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.preview = preview;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getRating() {
        return rating;
    }

    public int getPreview() {
        return preview;
    }
}
