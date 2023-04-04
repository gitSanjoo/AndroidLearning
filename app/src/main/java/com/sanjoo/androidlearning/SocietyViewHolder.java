package com.sanjoo.androidlearning;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public   class  SocietyViewHolder extends RecyclerView.ViewHolder {


    TextView flatNoView;
    TextView ownerNameView;

    public SocietyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
        super(itemView);
        flatNoView=itemView.findViewById(R.id.flat_no_view);
        ownerNameView=itemView.findViewById(R.id.owner_name);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(recyclerViewInterface !=null){
                    int pos=getAdapterPosition();
                    recyclerViewInterface.onRecyclerViewItemClick(pos);
                }
            }
        });

    }
}
