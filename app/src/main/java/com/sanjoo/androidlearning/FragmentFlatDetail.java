package com.sanjoo.androidlearning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class FragmentFlatDetail extends Fragment {

    Button goToFlatImage;
    private ArrayList<ItemFlatData> list=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(),"how are you",Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_flat_detail, container, false);

        goToFlatImage=view.findViewById(R.id.btn);
        goToFlatImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fm=new FragmentFlatImage();
                FragmentTransaction fragmentTransaction=getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container,fm).commit();
            }
        });


        return view;
    }
    private void initRecyclerView(View view){
        RecyclerView recyclerView=view.findViewById(R.id.fragmentRecyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        itemFlatAdapter itemFlatAdapter=new itemFlatAdapter()
        recyclerView.setAdapter();
    }
    private  void buildListData(){
        list.add(new ItemFlatData("Movie1"));
        list.add(new ItemFlatData("Movie2"));
        list.add(new ItemFlatData("Movie3"));
        list.add(new ItemFlatData("Movie4"));
        list.add(new ItemFlatData("Movie5"));
        list.add(new ItemFlatData("Movie6"));
    }
}