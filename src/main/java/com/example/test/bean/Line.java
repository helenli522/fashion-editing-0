package com.example.test.bean;

public class Line {

    private Integer LID;
    private Integer LType;
    private Integer LGender;
    private String ImageUrl;

    public Integer getLID() {
        return LID;
    }

    public void setLID(Integer LID) {
        this.LID = LID;
    }

    public Integer getLType() {
        return LType;
    }

    public void setLType(Integer LType) {
        this.LType = LType;
    }

    public Integer getLGender() {
        return LGender;
    }

    public void setLGender(Integer LGender) {
        this.LGender = LGender;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Line{" +
                "LID=" + LID +
                ", LType=" + LType +
                ", LGender=" + LGender +
                ", ImageUrl='" + ImageUrl + '\'' +
                '}';
    }
}
