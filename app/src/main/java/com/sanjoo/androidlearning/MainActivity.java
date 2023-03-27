package com.sanjoo.androidlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        setClickListeners();
    }

    private void setClickListeners(){

        Button btn_cow= findViewById(R.id.cow_btn);
        btn_cow.setOnClickListener(this);

        Button btn_dog= findViewById(R.id.dog_btn);
        btn_dog.setOnClickListener(this);

        Button btn_buffalo= findViewById(R.id.buffalo_btn);
        btn_buffalo.setOnClickListener(this);

        Button btn_cat= findViewById(R.id.cat_btn);
        btn_cat.setOnClickListener(this);


        /*btn_cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a cow",Toast.LENGTH_SHORT).show();

            }
        });*/
        /*Button btn_dog= findViewById(R.id.dog_btn);
        btn_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a dog",Toast.LENGTH_SHORT).show();

            }
        });
        Button btn_buffalo= findViewById(R.id.buffalo_btn);
        btn_buffalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a buffalo",Toast.LENGTH_SHORT).show();

            }
        });
        Button btn_cat= findViewById(R.id.cat_btn);

        btn_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a cat",Toast.LENGTH_SHORT).show();

            }
        });*/
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case(R.id.cow_btn):
                switchActivities("this is a cow");
                break;
            case(R.id.dog_btn):
                switchActivities("this is a dog");
                break;
            case(R.id.buffalo_btn):
                switchActivities("this is a buffalo");
                break;
            case(R.id.cat_btn):
                switchActivities("this is a cat");
                break;
        }


    }

    private void showText(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    private void switchActivities(String msgToNextActivity){
        Intent switchActivityIntent =new Intent(this, DetailActivity.class);
        switchActivityIntent.putExtra("textViewKeyForNextActivity",msgToNextActivity);
        startActivity(switchActivityIntent);
    }

}
