package com.rahulrvr.comicme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.fragments.ComicFragment;
import com.rahulrvr.comicme.fragments.HomeFragment;
import com.rahulrvr.comicme.interfaces.IListItemClickListener;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity implements IListItemClickListener {

    @InjectView(R.id.mainContainer)
    FrameLayout mainContainer;
    @InjectView(R.id.navDrawer)
    DrawerLayout navDrawer;
    @InjectView(R.id.tool_bar)
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    String TITLES[] = {"Comics", "Characters", "Settings"};
    @InjectView(R.id.navList)
    NavigationView navList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.inject(this);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, navDrawer, toolbar, R.string.open_drawer, R.string.close_drawer) {
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
        navList.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                switch (menuItem.getItemId()) {
                    case R.id.nav_comic:
                      // getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new ComicFragment()).commit();
                        Intent intent = new Intent(MainActivity.this, ComicDetailActivity.class);
                        startActivity(intent);
                        navDrawer.closeDrawers();
                    return true;
                   case  R.id.nav_character:
                       getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new HomeFragment()).commit();
                       navDrawer.closeDrawers();
                    return true;


                }


                return false;
            }
        });
    }

    @Override
    public void onItemClicked(String tag) {
        switch (tag) {
            case "Comics":
                getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new ComicFragment()).commit();
                break;
            case "Characters":

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
