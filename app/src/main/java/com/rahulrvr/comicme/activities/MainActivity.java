package com.rahulrvr.comicme.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.fragments.ComicFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity{

    @Bind(R.id.mainContainer)
    FrameLayout mainContainer;
    @Bind(R.id.tool_bar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new ComicFragment()).commit();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }
}
