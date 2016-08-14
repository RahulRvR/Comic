package com.rahulrvr.comicme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by vijayr on 3/18/15.
 * Copyright (C) 2014 rVr
 */
public class SplashActivity extends BaseActivity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
