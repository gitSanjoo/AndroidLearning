package com.sanjoo.androidlearning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemFlatAdapter extends RecyclerView.Adapter<FlatViewHolder> {

    private List<ItemFlatData> list;
    private itemClickListener clickListener;

    public itemFlatAdapter(List<ItemFlatData> list, itemClickListener clickListener){
        this.list=list;
        this.clickListener=clickListener;
    }
    @NonNull
    @Override
    public com.sanjoo.androidlearning.FlatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row,parent,false);

        return new com.sanjoo.androidlearning.FlatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull com.sanjoo.androidlearning.FlatViewHolder holder, int position) {
        holder.titleTextview.setText(list.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  interface itemClickListener{
        public void onItemClick(ItemFlatData itemFlatData);
    }
}
