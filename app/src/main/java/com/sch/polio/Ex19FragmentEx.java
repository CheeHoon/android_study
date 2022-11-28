package com.sch.polio;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Ex19FragmentEx extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private com.sch.polio.Ex19AFragment fragmentA;
    private Ex19BFragment fragmentB;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ex19_fragment);

        fragmentManager = getSupportFragmentManager();

        fragmentA = new com.sch.polio.Ex19AFragment();
        fragmentB = new Ex19BFragment();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();

        findViewById(R.id.btn_fragmentA).setOnClickListener(mClick);
        findViewById(R.id.btn_fragmentB).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            transaction = fragmentManager.beginTransaction();

            switch(v.getId())
            {
                case R.id.btn_fragmentA:
                    transaction.replace(R.id.frameLayout, fragmentA).commitAllowingStateLoss();
                    break;
                case R.id.btn_fragmentB:
                    transaction.replace(R.id.frameLayout, fragmentB).commitAllowingStateLoss();
                    break;
            }

        }
    };


}