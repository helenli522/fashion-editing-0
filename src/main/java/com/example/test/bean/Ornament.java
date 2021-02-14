package com.example.test.bean;

public class Ornament {

    private Integer OID;
    private Integer OType;
    private Integer ImageUrl;

    public Integer getOID() {
        return OID;
    }

    public void setOID(Integer OID) {
        this.OID = OID;
    }

    public Integer getOType() {
        return OType;
    }

    public void setOType(Integer OType) {
        this.OType = OType;
    }

    public Integer getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        ImageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Ornament{" +
                "OID=" + OID +
                ", OType=" + OType +
                ", ImageUrl=" + ImageUrl +
                '}';
    }
}
