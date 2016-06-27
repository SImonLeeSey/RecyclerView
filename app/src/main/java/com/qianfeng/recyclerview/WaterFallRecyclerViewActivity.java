package com.qianfeng.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class WaterFallRecyclerViewActivity extends Activity
{
    private RecyclerView recyclerView;

    private List<String> list;

    private RecyclerWaterFallAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_fall);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        loadData();
        adapter = new RecyclerWaterFallAdapter(this, list);
        // 竖起的布局管理器
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(
                4, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void loadData()
    {
        list = new ArrayList<String>();
        for (int i = 0; i < 100; i++)
        {
            list.add(i + "");
        }
    }
}
