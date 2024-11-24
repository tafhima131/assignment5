package com.example.myapplication;

import android.content.ClipData;
import android.media.RouteListingPreference;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ItemAdapter itemAdapter;

    private List<Item>itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        itemList=new ArrayList<>();
        itemList.add(new Item(R.drawable.img,"Item 1","This is item 1","$10"));
        itemList.add(new Item(R.drawable.img,"Item 1","This is item 2","$20"));
        itemList.add(new Item(R.drawable.img,"Item 1","This is item 3","$30"));
        itemList.add(new Item(R.drawable.img,"Item 1","This is item 4","$40"));
        itemList.add(new Item(R.drawable.img,"Item 1","This is item5","$50"));
        itemAdapter=new ItemAdapter(itemList);
        recyclerView.setAdapter(itemAdapter);

    }
}