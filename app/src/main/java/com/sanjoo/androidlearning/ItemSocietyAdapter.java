package com.sanjoo.androidlearning;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemSocietyAdapter extends RecyclerView.Adapter<SocietyViewHolder> {

    private  final RecyclerViewInterface recyclerViewInterface;

    private  final List<ItemSelectFlat> selectFlats;
    public ItemSocietyAdapter(List<ItemSelectFlat> itemSelectFlats, AdapterItemClickListener adapterItemClickListener){
        this.selectFlats= itemSelectFlats;
        this.recyclerViewInterface=new RecyclerViewInterface() {
            @Override
            public void onRecyclerViewItemClick(int position) {
                adapterItemClickListener.onAdapterItemClick(selectFlats.get(position));
            }
        };
    }


    @NonNull
    @Override
    public SocietyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SocietyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_select_flat,parent,false),recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull SocietyViewHolder holder, int position) {
        holder.flatNoView.setText(String.valueOf(selectFlats.get(position).getFlatNo()));
        holder.ownerNameView.setText(selectFlats.get(position).getOwnerName());
    }

    @Override
    public int getItemCount() {
        return selectFlats.size();
    }


    interface AdapterItemClickListener{

        void onAdapterItemClick(ItemSelectFlat selectedFlat);

    }
}
