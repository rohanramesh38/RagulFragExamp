package com.example.rohan.ragulfragexamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment blankFragment=new BlankFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout,blankFragment)
                .addToBackStack(null)
                .commit();




    }
}
