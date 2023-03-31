package com.sanjoo.androidlearning;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView,emailView;

    public ViewHolder(@NonNull View itemView,RecyclerViewInterface recyclerViewInterface) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageview);
        nameView=itemView.findViewById(R.id.name);
        emailView=itemView.findViewById(R.id.email);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(recyclerViewInterface!=null){
                    int pos=getAdapterPosition();
                    if(pos!=RecyclerView.NO_POSITION){
                        recyclerViewInterface.onItemClick(pos);
                    }
                }
            }
        });
    }
}
