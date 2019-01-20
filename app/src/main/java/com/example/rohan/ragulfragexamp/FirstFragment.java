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
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);


        Button btblank=(Button) v.findViewById(R.id.buttonfirst);

        btblank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment=new SecondFragment();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();

                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,secondFragment)
                        .addToBackStack(null)
                        .commit();

            }
        });

        return v;
    }

}
