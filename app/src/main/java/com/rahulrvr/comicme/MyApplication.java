package com.rahulrvr.comicme;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
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

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

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
