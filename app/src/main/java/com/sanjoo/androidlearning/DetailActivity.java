package com.sanjoo.androidlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

  protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_detail);


      TextView textView= findViewById(R.id.detailText);

      textView.setText(getStringFromCallingActivity("textViewKeyForNextActivity"));

      Button btn_ReadMore=findViewById(R.id.ReadMore_btn);
      btn_ReadMore.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              switchDetailToAnimalDetailActivity(String.valueOf(textView));
          }
      });
  }



   private String getStringFromCallingActivity(String key){
          return getIntent().getStringExtra(key);
  }
  private void switchDetailToAnimalDetailActivity(String nextMessage){

      Intent switchIntent=new Intent(this,AnimalDetail.class);
      switchIntent.putExtra("message", nextMessage);
      startActivity(switchIntent);
  }


}
