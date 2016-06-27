package com.qianfeng.navigationandslidingpanel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action",
                        Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        SlidingPaneLayout panel = (SlidingPaneLayout) findViewById(R.id.drawer_layout);
        panel.setPanelSlideListener(new SlidingPaneLayout.PanelSlideListener()
        {
            @Override
            public void onPanelSlide(View panel, float slideOffset)
            {
                // 在当前回调可以实现类似QQ的抽屉页面的动画效果(通过slideOffset计算progress)
            }

            @Override
            public void onPanelOpened(View panel)
            {

            }

            @Override
            public void onPanelClosed(View panel)
            {

            }
        });
    }

    // 按物理返回键
    @Override
    public void onBackPressed()
    {
        SlidingPaneLayout panel = (SlidingPaneLayout) findViewById(R.id.drawer_layout);
        if (panel.isOpen())
        {
            panel.closePane();
        }
        else
        {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera)
        {
            // Handle the camera action
        }
        else if (id == R.id.nav_gallery)
        {

        }
        else if (id == R.id.nav_slideshow)
        {

        }
        else if (id == R.id.nav_manage)
        {

        }
        else if (id == R.id.nav_share)
        {

        }
        else if (id == R.id.nav_send)
        {

        }

        SlidingPaneLayout paneLayout = (SlidingPaneLayout) findViewById(R.id.drawer_layout);
        paneLayout.closePane();
        return true;
    }
}
