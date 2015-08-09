package com.rahulrvr.comicme.activities;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.adapters.NavDrawerListAdapter;
import com.rahulrvr.comicme.adapters.NavDrawerListViewHolder;
import com.rahulrvr.comicme.fragments.ComicFragment;
import com.rahulrvr.comicme.fragments.HomeFragment;
import com.rahulrvr.comicme.interfaces.IListItemClickListener;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity implements IListItemClickListener{

    @InjectView(R.id.mainContainer)
    FrameLayout mainContainer;
    @InjectView(R.id.navDrawer)
    DrawerLayout navDrawer;
    @InjectView(R.id.tool_bar)
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    String TITLES[] = {"Comics","Characters","Settings"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.inject(this);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,navDrawer,toolbar,R.string.open_drawer,R.string.close_drawer){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // code here will execute once the drawer is opened( As I dont want anything happened whe drawer is
                // open I am not going to put anything here)
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                // Code here will execute once drawer is closed
            }

        }; // Drawer Toggle Object Made
        navDrawer.setDrawerListener(actionBarDrawerToggle); // Drawer Listener set to the Drawer toggle
        actionBarDrawerToggle.syncState();               // Finally we set the drawer toggle sync State
        RecyclerView.Adapter<NavDrawerListViewHolder> adapter = new NavDrawerListAdapter(this,TITLES,this);
    }

    @Override
    public void onItemClicked(String tag) {
        switch (tag) {
            case "Comics" :
                getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new ComicFragment()).commit();
                break;
            case "Characters" :
                getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new HomeFragment()).commit();
                break;

        }
        navDrawer.closeDrawers();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager().beginTransaction().add(R.id.mainContainer, new ComicFragment()).commit();
    }
}
