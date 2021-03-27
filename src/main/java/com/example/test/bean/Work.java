package com.example.test.bean;

public class Work {

    private Integer WorkID;
    private String ImageUrl;

    public Integer getWorkID() {
        return WorkID;
    }

    public void setWorkID(Integer workID) {
        WorkID = workID;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Work{" +
                "WorkID=" + WorkID +
                ", ImageUrl='" + ImageUrl + '\'' +
                '}';
    }
}
