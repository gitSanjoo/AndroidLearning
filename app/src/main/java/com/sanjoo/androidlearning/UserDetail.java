package com.sanjoo.androidlearning;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserDetail extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);


        String name=getIntent().getStringExtra("name");


        TextView nameTextView=findViewById(R.id.user_name);

        nameTextView.setText(name);
    }
}
