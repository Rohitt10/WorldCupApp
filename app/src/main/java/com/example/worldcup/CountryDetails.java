package com.example.worldcup;

public class CountryDetails {
    String name,count;
    int imageId;

    public CountryDetails(String name, String count, int imageId) {
        this.name = name;
        this.count = count;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getCount() {
        return count;
    }

    public int getImageId() {
        return imageId;
    }
}
