package com.sanjoo.androidlearning;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FragmentFirst extends Fragment {

    Button goToSecondButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(),"this is fragment",Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);
        goToSecondButton=view.findViewById(R.id.fragment_button);
        goToSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment secondFragment=new FragmentTwo();
                FragmentTransaction fm=getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.container,secondFragment).commit();
            }
        });


        return view;
    }
}