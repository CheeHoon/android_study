package com.sch.polio;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex1AnimationActivity extends AppCompatActivity {
    Animation ani1,ani2,ani3,ani4,ani5,ani6;
    ImageView ivHu,ivRu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_anmation);

        ivHu = (ImageView)findViewById(R.id.ivHuton);
        ivRu = (ImageView)findViewById(R.id.ivRuise);
        findViewById(R.id.btnAni1).setOnClickListener(mClickListener);
        findViewById(R.id.btnAni2).setOnClickListener(mClickListener);
        findViewById(R.id.btnAni3).setOnClickListener(mClickListener);

        ani1 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.jump);
        ani2 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.translate2);
        ani3 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.scale2);
        ani4= AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.set);
        ani5 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.scale);
        ani6 = AnimationUtils.loadAnimation(Ex1AnimationActivity.this, R.anim.ani_1);

    }
    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnAni1:
                    ivHu.startAnimation(ani1);
                    ivRu.startAnimation(ani4);
                    break;
                case R.id.btnAni2:
                    ivHu.startAnimation(ani2);
                    ivRu.startAnimation(ani1);
                    break;
                case R.id.btnAni3:
                    ivHu.startAnimation(ani3);
                    ivRu.startAnimation(ani3);
                    break;
            }
        }
    };
}