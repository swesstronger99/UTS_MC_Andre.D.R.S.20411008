package com.example.conter;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private ArrayList<ItemData> itemData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new MyAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        itemData = new ArrayList<>();
        itemData.add(new ItemData("Call Of Duty", R.drawable.cod1));
        itemData.add(new ItemData("Drift Dudes", R.drawable.ddt));
        itemData.add(new ItemData("Empire Puzzle", R.drawable.ep));
        itemData.add(new ItemData("Epic Quest", R.drawable.epic));
        itemData.add(new ItemData("Cekres", R.drawable.hri));
        itemData.add(new ItemData("Truck Trial", R.drawable.tt));
    }
}
