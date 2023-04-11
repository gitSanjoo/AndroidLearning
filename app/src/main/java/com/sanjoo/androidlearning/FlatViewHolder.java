package com.sanjoo.androidlearning;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FlatViewHolder extends RecyclerView.ViewHolder {

    TextView titleTextview;
    public FlatViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTextview= itemView.findViewById(R.id.titleTextView);


    }
}
