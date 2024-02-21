package com.sanjoo.androidlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ScrollActivity extends AppCompatActivity {
    ImageSwitcher imageSwitcher;
    int[] images_id={R.drawable.pic2,R.drawable.pic4,R.drawable.pic7};
    int leng;
    int img_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        imageSwitcher=findViewById(R.id.imgSwitcher);
        leng=images_id.length;

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                return imageView;
            }
        });
        imageSwitcher.setImageResource(images_id[0]);

    }
    public void nextBtn(){
        img_index=img_index+1;
        imageSwitcher.setImageResource(images_id[img_index]);
    }
    public void previousBtn(){

        img_index=img_index-1;
        imageSwitcher.setImageResource(images_id[img_index]);
    }
}