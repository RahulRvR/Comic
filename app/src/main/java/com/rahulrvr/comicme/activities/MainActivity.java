package com.rahulrvr.comicme.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.databinding.MainLayoutBinding;
import com.rahulrvr.comicme.fragments.CharacterFragment;
import com.rahulrvr.comicme.fragments.ComicFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.main_layout);
        setSupportActionBar(binding.toolbar);
        binding.mainContainer.setAdapter(new MainActivityFragmentPagerAdapter(getSupportFragmentManager()));
        binding.tabs.setupWithViewPager(binding.mainContainer);
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
