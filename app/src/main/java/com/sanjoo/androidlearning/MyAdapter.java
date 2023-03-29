package com.sanjoo.androidlearning;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {


    private final List<Item> items;

    public MyAdapter( List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
