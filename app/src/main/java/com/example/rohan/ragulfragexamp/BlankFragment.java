package com.example.rohan.ragulfragexamp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);


        Button btblank=(Button) v.findViewById(R.id.buttonblank);

        btblank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment firstFragment=new FirstFragment();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,firstFragment)
                        .addToBackStack(null)
                        .commit();

            }
        });

        return v;

    }

}
