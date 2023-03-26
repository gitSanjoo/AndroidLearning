package com.sanjoo.androidlearning;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Button btn_cow=(Button)findViewById(R.id.cow_btn);
        btn_cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a cow",Toast.LENGTH_SHORT).show();

            }
        });
        Button btn_dog=(Button)findViewById(R.id.dog_btn);
        btn_dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a dog",Toast.LENGTH_SHORT).show();

            }
        });
        Button btn_buffalo=(Button)findViewById(R.id.buffalo_btn);
        btn_buffalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a buffalo",Toast.LENGTH_SHORT).show();

            }
        });
        Button btn_cat=(Button)findViewById(R.id.cat_btn);

        btn_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"this is a cat",Toast.LENGTH_SHORT).show();

            }
        });





    }


}
