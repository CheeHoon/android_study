package com.sch.polio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnEx1).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx2).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx3).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx4).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx5).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx6).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx7).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx8).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx9).setOnClickListener(mClickListener);
        findViewById(R.id.btnEx10).setOnClickListener(mClickListener);
    }
    Button.OnClickListener mClickListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnEx1:
                    Intent ex1 = new Intent(MainActivity.this,Ex1AnimationActivity.class);
                    startActivity(ex1);
                    break;
                case R.id.btnEx2:
                    Intent ex2 = new Intent(MainActivity.this, Ex2gifActivity.class);
                    startActivity(ex2);
                    break;
                case R.id.btnEx3:
                    Intent ex3 = new Intent(MainActivity.this, com.sch.polio.Ex3VideoActivity.class);
                    startActivity(ex3);
                    break;
                case R.id.btnEx4:
                    Intent ex4 = new Intent(MainActivity.this, com.sch.polio.Ex4MediaActivity.class);
                    startActivity(ex4);
                    break;
                case R.id.btnEx5:
                    Intent ex5 = new Intent(MainActivity.this, com.sch.polio.Ex5WebViewActivity.class);
                    startActivity(ex5);
                    break;
                case R.id.btnEx6:
                    Intent ex6 = new Intent(MainActivity.this, com.sch.polio.Ex6TelActivity.class);
                    startActivity(ex6);
                    break;
                case R.id.btnEx7:
                    Intent ex7 = new Intent(MainActivity.this, com.sch.polio.Ex7SmsActivity.class);
                    startActivity(ex7);
                    break;
                case R.id.btnEx8:
                    Intent ex8 = new Intent(MainActivity.this, com.sch.polio.Ex8GalleryViewEx.class);
                    startActivity(ex8);
                    break;
                case R.id.btnEx9:
                    Intent ex9 = new Intent(MainActivity.this, com.sch.polio.Ex9listActivity.class);
                    startActivity(ex9);
                    break;
                case R.id.btnEx10:
                    Intent ex10 = new Intent(MainActivity.this, com.sch.polio.Ex10listviewActivity.class);
                    startActivity(ex10);
                    break;
            }
        }
    };
}