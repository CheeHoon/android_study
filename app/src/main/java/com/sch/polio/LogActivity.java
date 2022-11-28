package com.sch.polio;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {
    Animation ani1,ani2,ani3;
    ImageView ivFront1,ivFront2,ivFront3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        ivFront1 = (ImageView)findViewById(R.id.ivFront1);
        ivFront2 = (ImageView)findViewById(R.id.ivFront2);
        ivFront3 = (ImageView)findViewById(R.id.ivFront3);
        ani1 = AnimationUtils.loadAnimation(LogActivity.this,R.anim.scale2);
        ani2 = AnimationUtils.loadAnimation(LogActivity.this,R.anim.rotate2);
        ani3 = AnimationUtils.loadAnimation(LogActivity.this,R.anim.alpha);

        ivFront1.startAnimation(ani1);
        ivFront2.startAnimation(ani2);
        ivFront3.startAnimation(ani3);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LogActivity.this, com.sch.polio.Mainmain.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}