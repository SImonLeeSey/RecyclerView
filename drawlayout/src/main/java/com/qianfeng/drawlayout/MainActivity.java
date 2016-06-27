package com.qianfeng.drawlayout;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawlayout);
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener()
        {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset)
            {

            }

            @Override
            public void onDrawerOpened(View drawerView)
            {
                // drawerLayout.closeDrawer(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView)
            {
//                drawerLayout.openDrawer(Gravity.LEFT);
            }

            @Override
            public void onDrawerStateChanged(int newState)
            {

            }
        });
    }
}
