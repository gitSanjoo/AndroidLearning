package com.sanjoo.androidlearning;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        RecyclerView recyclerView=findViewById(R.id.recyclerview);

        List<Item> items=new ArrayList<Item>();
        items.add(new Item("sanju","sanju@gmail.com",R.drawable.pic));
        items.add(new Item("men","men@gmail.com",R.drawable.pic2));
        items.add(new Item("women","women@gmail.com",R.drawable.pic3));
        items.add(new Item("dev","dev@gmail.com",R.drawable.pic));
        items.add(new Item("sanju","sanju@gmail.com",R.drawable.pic));
        items.add(new Item("men","men@gmail.com",R.drawable.pic2));
        items.add(new Item("women","women@gmail.com",R.drawable.pic3));
        items.add(new Item("dev","dev@gmail.com",R.drawable.pic));
        items.add(new Item("sanju","sanju@gmail.com",R.drawable.pic));
        items.add(new Item("men","men@gmail.com",R.drawable.pic2));
        items.add(new Item("women","women@gmail.com",R.drawable.pic3));
        items.add(new Item("dev","dev@gmail.com",R.drawable.pic));
        items.add(new Item("sanju","sanju@gmail.com",R.drawable.pic));
        items.add(new Item("men","men@gmail.com",R.drawable.pic2));
        items.add(new Item("women","women@gmail.com",R.drawable.pic3));
        items.add(new Item("dev","dev@gmail.com",R.drawable.pic));
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyAdapter(items));
    }
}
