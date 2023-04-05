package com.sanjoo.androidlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SocietyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_society);

        RecyclerView recyclerView=findViewById(R.id.recyclerView);

        List<ItemSelectFlat> itemSelectFlat =new ArrayList<>();

        itemSelectFlat.add(new ItemSelectFlat(4001,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4002,"sanju"));
        itemSelectFlat.add(new ItemSelectFlat(4003,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4004,"sanju bALA"));
        itemSelectFlat.add(new ItemSelectFlat(4005,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4006,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4007,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4008,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4009,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4010,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4011,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4012,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4013,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4014,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4015,"dhoni"));
        itemSelectFlat.add(new ItemSelectFlat(4007,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4008,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4009,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4010,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4011,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4012,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4013,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4014,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4015,"dhoni"));
        itemSelectFlat.add(new ItemSelectFlat(4007,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4008,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4009,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4010,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4011,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4012,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4013,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4014,"dev"));
        itemSelectFlat.add(new ItemSelectFlat(4015,"dhoni"));


        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new ItemSocietyAdapter(itemSelectFlat, new ItemSocietyAdapter.AdapterItemClickListener() {
            @Override
            public void onAdapterItemClick(ItemSelectFlat selectedFlat) {
                Intent intent=new Intent(SocietyActivity.this,FlatDetailActivity.class);
                intent.putExtra("flatNo",selectedFlat.getFlatNo());
                intent.putExtra("ownerName",selectedFlat.getOwnerName());
                startActivity(intent);
            }
        }));

    }

}










