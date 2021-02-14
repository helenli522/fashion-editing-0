package com.example.test.bean;

public class Work {

    private Integer WorkID;
    private Integer UserID;
    private Integer LID;
    private Integer TID;
    private String ImageUrl;

    public Integer getWorkID() {
        return WorkID;
    }

    public void setWorkID(Integer workID) {
        WorkID = workID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public Integer getLID() {
        return LID;
    }

    public void setLID(Integer LID) {
        this.LID = LID;
    }

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
        return "Work{" +
                "WorkID=" + WorkID +
                ", UserID=" + UserID +
                ", LID=" + LID +
                ", TID=" + TID +
                ", ImageUrl='" + ImageUrl + '\'' +
                '}';
    }
}
