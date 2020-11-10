package com.atta.myrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<String> data = new ArrayList();
        data.add("Cairo");
        data.add("Alex");
        data.add("Giza");
        data.add("Luxor");
        data.add("Tanta");

        MyAdapter myAdapter = new MyAdapter(data, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        recyclerView.setAdapter(myAdapter);
    }
}