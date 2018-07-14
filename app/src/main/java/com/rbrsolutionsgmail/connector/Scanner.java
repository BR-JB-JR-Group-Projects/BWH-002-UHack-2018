package com.rbrsolutionsgmail.connector;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Scanner extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private final int activity = R.id.nav_connect;
    private final Context current_context = Scanner.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        instanceGUI();

        //OUR STUFF GOES HERE
    }

    public void instanceGUI(){
        mDrawerLayout = findViewById(R.id.drawer_layout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setCheckedItem(activity);

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();

                        int id = menuItem.getItemId();
                        Intent i;
                        //If we've selected a different menu, move somewhere
                        if(id != activity) {
                            switch(id){
                                case R.id.nav_home:
                                    i = new Intent(current_context, Home.class);
                                    startActivity(i);
                                    break;
                                case R.id.nav_connect:
                                    i = new Intent(current_context, Connect.class);
                                    startActivity(i);
                                    break;
                                case R.id.nav_schedule:
                                    i = new Intent(current_context, Schedule.class);
                                    startActivity(i);
                                    break;
                                case R.id.nav_settings:
                                    i = new Intent(current_context, Settings.class);
                                    startActivity(i);
                                    break;
                                case R.id.nav_bt:
                                    break;
                                case R.id.nav_support:
                                    break;
                                case R.id.nav_about:
                                    break;
                            }

                        }
                        return true;
                    }
                });
        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer is opened
                        TextView text = findViewById(R.id.user_text);
                        text.setText(global_variables.data.name);
                        text = findViewById(R.id.url_text);
                        text.setText(global_variables.data.url);
                        text = findViewById(R.id.event_text);
                        text.setText(global_variables.data.event);
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                } );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
