package com.sanjoo.androidlearning;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnimalDetail extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activoity_animal_detail);

        TextView finalView=findViewById(R.id.animalDetailView);

        finalView.setText(getStringFromCallingDetailActivity("message"));

    }
    private String getStringFromCallingDetailActivity(String key){
        return getIntent().getStringExtra(key);
    }
}
