package com.example.yoshi.myapplication.model.entitites;

import java.util.Date;

/**
 * Created by yoshi on 11/20/16.
 */

public class Actions {
    enum activity{HOTEL,TRAVEL_AGENCY,ENTERTAINMENT,FLIGHTS}

    private String country;
    private Date startDate;
    private Date endDate;
    private double price;
    private String description;
    private int IDN;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIDN() {
        return IDN;
    }

    public void setIDN(int IDN) {
        this.IDN = IDN;
    }
}
