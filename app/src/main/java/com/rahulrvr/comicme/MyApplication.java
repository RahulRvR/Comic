package com.rahulrvr.comicme;

import android.app.Application;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class MyApplication extends Application {

    private static MyApplication myApplication;
    String endpoint = "https://gateway.marvel.com/";
    Retrofit mRestAdapter;


    public static MyApplication getInstance() {
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Grinched.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

        mRestAdapter = new Retrofit.Builder().baseUrl(endpoint).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
    }

    public Retrofit getRestAdapter() {
        return mRestAdapter;
    }


}
