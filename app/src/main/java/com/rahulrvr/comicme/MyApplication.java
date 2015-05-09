package com.rahulrvr.comicme;

import android.app.Application;

import retrofit.RestAdapter;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class MyApplication extends Application {

    private static MyApplication myApplication;
    String endpoint = "https://gateway.marvel.com/";
    RestAdapter mRestAdapter;


    public static MyApplication getInstance() {
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        mRestAdapter = new RestAdapter.Builder().setEndpoint(endpoint).build();
    }

    public RestAdapter getRestAdapter() {
        return mRestAdapter;
    }


}
