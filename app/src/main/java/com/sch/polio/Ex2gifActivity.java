package com.sch.polio;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Ex2gifActivity extends AppCompatActivity {
    ImageView ivM1,ivM2,ivM3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_gif);

        ivM1 = (ImageView) findViewById(R.id.ivM1);
        ivM2 = (ImageView) findViewById(R.id.ivM2);
        ivM3 = (ImageView) findViewById(R.id.ivM3);

        Glide.with(Ex2gifActivity.this).load(R.drawable.sonb2).into(ivM1);
        Glide.with(Ex2gifActivity.this).load(R.drawable.sonb).into(ivM2);
        Glide.with(Ex2gifActivity.this).load(R.drawable.sonb1).into(ivM3);
    }

}