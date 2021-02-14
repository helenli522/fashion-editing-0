package com.example.test.bean;

public class Texture {

    private Integer TID;
    private String ImageUrl;

    public Integer getTID() {
        return TID;
    }

    public void setTID(Integer TID) {
        this.TID = TID;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Texture{" +
                "TID=" + TID +
                ", ImageUrl='" + ImageUrl + '\'' +
                '}';
    }
}
