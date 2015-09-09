package com.rahulrvr.comicme.activities;

import android.content.Intent;
import android.os.Bundle;

import com.rahulrvr.comicme.R;

/**
 * Created by vijayr on 3/18/15.
 * Copyright (C) 2014 Elsevier
 */
public class SplashActivity extends BaseActivity {

    private static final int SPLASH_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        new android.os.Handler().postDelayed(() -> startActivity(new Intent(SplashActivity.this, MainActivity.class)), SPLASH_DELAY);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
