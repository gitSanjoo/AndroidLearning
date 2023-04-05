package com.sanjoo.androidlearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FlatDetailActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_detail);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setVisibility(View.GONE);
                Fragment fragment=new FragmentFlatDetail();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fragment).commit();
            }
        });

        TextView flatnoTextView=findViewById(R.id.flat_no);
        TextView ownerNameTextView=findViewById(R.id.owner_name);

        int flatNo=getIntent().getIntExtra("flatNo",-1);
        String ownerName=getIntent().getStringExtra("ownerName");

        flatnoTextView.setText(String.valueOf(flatNo));
        ownerNameTextView.setText(ownerName);



    }
}