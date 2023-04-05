package com.sanjoo.androidlearning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FragmentFlatDetail extends Fragment {

    Button goToFlatImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(),"how are you",Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_flat_detail, container, false);

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
}