package com.rahulrvr.comicme.activities;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.rahulrvr.comicme.R;
import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by rahulrv on 8/9/15.
 */
public class ComicDetailActivity extends AppCompatActivity {

    com.rahulrvr.comicme.model.comics.Thumbnail mThumbnail;
    @InjectView(R.id.backdrop)
    ImageView backdrop;
    @InjectView(R.id.toolbar)
    Toolbar toolbar;
    @InjectView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;
    @InjectView(R.id.appbar)
    AppBarLayout appbar;
    @InjectView(R.id.main_content)
    CoordinatorLayout mainContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comic_detail_layout);
        ButterKnife.inject(this);
        mThumbnail = (com.rahulrvr.comicme.model.comics.Thumbnail) getIntent().getSerializableExtra("comic");
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(getIntent().getStringExtra("comicTitle"));
        String url =  mThumbnail.getPath() + "/landscape_incredible." + mThumbnail.getExtension();

        Picasso.with(this).load(url).into(backdrop);
    }
}

