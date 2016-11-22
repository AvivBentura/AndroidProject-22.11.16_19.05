package com.example.yoshi.myapplication.model.backend;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

import java.util.ArrayList;

import com.example.yoshi.myapplication.model.entitites.Actions;
import com.example.yoshi.myapplication.model.entitites.Businesses;
import com.example.yoshi.myapplication.model.entitites.Users;

/**
 * Created by yoshi on 11/20/16.
 */

public class Backend extends ContentProvider {

    private ArrayList<Users> users = new ArrayList();
    private ArrayList<Businesses> businesses = new ArrayList<>();
    private ArrayList<Actions> actions = new ArrayList<>();

    public ArrayList<Users> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }

    public ArrayList<Businesses> getBusinesses() {
        return businesses;
    }

    public void setBusinessses(ArrayList<Businesses> businesses) {
        this.businesses = businesses;
    }

    public ArrayList<Actions> getActions(){
        return actions;
    }

    public void setActions(ArrayList<Actions> actions) {
        this.actions = actions;
    }

    void addUser(Users user) {
        users.add(user);
    }

    void addBusiness(Businesses business) {
        businesses.add(business);
    }

    void addActivity(Actions action) {
        actions.add(action);
    }

    boolean addTest() {
        return true;
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings1, String s1) {
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}

