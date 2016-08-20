package com.rahulrvr.comicme.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.fragments.CharacterFragment;
import com.rahulrvr.comicme.fragments.ComicFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @Bind(R.id.mainContainer)
    ViewPager mainContainer;
    @Bind(R.id.tool_bar)
    Toolbar toolbar;
    @Bind(R.id.tabs)
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        mainContainer.setAdapter(new MainActivityFragmentPagerAdapter(getSupportFragmentManager()));
        tabs.setupWithViewPager(mainContainer);
    }

    public class MainActivityFragmentPagerAdapter extends FragmentPagerAdapter {
        final int PAGE_COUNT = 2;

        public MainActivityFragmentPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ComicFragment();
                case 1:
                default:
                    return new CharacterFragment();
            }
        }

        @Override public CharSequence getPageTitle(int position) {
            return position == 0 ? "Comics" : "Characters";
        }

        @Override public int getCount() {
            return PAGE_COUNT;
        }
    }
}
