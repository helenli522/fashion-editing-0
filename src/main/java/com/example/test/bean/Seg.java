package com.example.test.bean;

public class Seg {
    private Integer SegID;
    private String ImageUrl;

    public Integer getSegID() {
        return SegID;
    }

    public void setSegID(Integer segID) {
        SegID = segID;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public Seg(Integer segID, String imageUrl) {
        SegID = segID;
        ImageUrl = imageUrl;
    }
}
