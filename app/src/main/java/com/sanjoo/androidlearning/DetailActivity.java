package com.sanjoo.androidlearning;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
  protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_detail);

      TextView textView= findViewById(R.id.detailText);

      textView.setText(getStringFromCallingActivity("textViewKeyForNextActivity"));
  }


  private String getStringFromCallingActivity(String key){
      return getIntent().getStringExtra(key);
  }


}
