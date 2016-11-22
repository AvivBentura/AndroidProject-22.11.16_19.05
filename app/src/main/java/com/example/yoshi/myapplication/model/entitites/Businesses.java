package com.example.yoshi.myapplication.model.entitites;

import android.net.MailTo;

import java.net.URL;

/**
 * Created by yoshi on 11/20/16.
 */

public class Businesses {
    private int IDN;
    private String name;
    private String address;
    private int phoneNum;
    private MailTo email;
    private URL site;


    public int getIDN() {
        return IDN;
    }

    public void setIDN(int IDN) {
        this.IDN = IDN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public MailTo getEmail() {
        return email;
    }

    public void setEmail(MailTo email) {
        this.email = email;
    }

    public URL getSite() {
        return site;
    }

    public void setSite(URL site) {
        this.site = site;
    }
}
