package com.rahulrvr.comicme.activities;

import android.os.Bundle;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.fragments.ComicFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().add(R.id.mainContainer, new ComicFragment()).commit();
    }
}
