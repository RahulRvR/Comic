package com.rahulrvr.comicme;

import android.app.Application;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
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

        OkHttpClient.Builder okHttpClient = new OkHttpClient().newBuilder();
        okHttpClient.addInterceptor(chain -> {
            Timber.d(chain.toString());
            Request request = chain.request();
            HttpUrl url = request.url().newBuilder().addQueryParameter("ts", "1")
                    .addQueryParameter("apikey", "eb95459cac0b6177473decbeb608a839")
                    .addQueryParameter("hash", "1ae5d2e78ffa4682eb728f01a6c0c4f5").build();
            request = request.newBuilder().url(url).build();
            return chain.proceed(request);
        });

        mRestAdapter = new Retrofit.Builder().baseUrl(endpoint).addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient.build())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
    }

    public Retrofit getRestAdapter() {
        return mRestAdapter;
    }

}
