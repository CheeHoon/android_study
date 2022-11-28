package com.sch.polio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex9listActivity extends AppCompatActivity {
    TextView tvPhone1,tvPhone2,tvPhone3,tvPhone4,tvPhone5,tvPhone6,tvPhone7,tvPhone8;
    ImageView ivcall1,ivcall2,ivcall3,ivcall4,ivcall5,ivcall6,ivcall7,ivcall8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex9list);

        ivcall1 = (ImageView) findViewById(R.id.ivCall1);
        ivcall2 = (ImageView) findViewById(R.id.ivCall2);
        ivcall3 = (ImageView) findViewById(R.id.ivCall3);
        ivcall4 = (ImageView) findViewById(R.id.ivCall4);
        ivcall5 = (ImageView) findViewById(R.id.ivCall5);
        ivcall6 = (ImageView) findViewById(R.id.ivCall6);
        ivcall7 = (ImageView) findViewById(R.id.ivCall7);
        ivcall8 = (ImageView) findViewById(R.id.ivCall8);

        tvPhone1 = (TextView) findViewById(R.id.tvPhone1);
        tvPhone2 = (TextView) findViewById(R.id.tvPhone2);
        tvPhone3 = (TextView) findViewById(R.id.tvPhone3);
        tvPhone4 = (TextView) findViewById(R.id.tvPhone4);
        tvPhone5 = (TextView) findViewById(R.id.tvPhone5);
        tvPhone6 = (TextView) findViewById(R.id.tvPhone6);
        tvPhone7 = (TextView) findViewById(R.id.tvPhone7);
        tvPhone8 = (TextView) findViewById(R.id.tvPhone8);

        findViewById(R.id.ivCall1).setOnClickListener(mClickListener);
        findViewById(R.id.ivCall2).setOnClickListener(mClickListener);
        findViewById(R.id.ivCall3).setOnClickListener(mClickListener);
        findViewById(R.id.ivCall4).setOnClickListener(mClickListener);
        findViewById(R.id.ivCall5).setOnClickListener(mClickListener);
        findViewById(R.id.ivCall6).setOnClickListener(mClickListener);
        findViewById(R.id.ivCall7).setOnClickListener(mClickListener);
        findViewById(R.id.ivCall8).setOnClickListener(mClickListener);



    }
    ImageView.OnClickListener mClickListener = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ivCall1:
                    String tel_number1 = "tel:"+tvPhone1.getText().toString();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number1));
                    startActivity(intent);
                    break;

                case R.id.ivCall2:
                    String tel_number2 = "tel:"+tvPhone2.getText().toString();

                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number2));
                    startActivity(intent2);
                    break;

                case R.id.ivCall3:
                    String tel_number3 = "tel:"+tvPhone3.getText().toString();

                    Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number3));
                    startActivity(intent3);
                    break;

                case R.id.ivCall4:
                    String tel_number4 = "tel:"+tvPhone4.getText().toString();

                    Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number4));
                    startActivity(intent4);
                    break;

                case R.id.ivCall5:
                    String tel_number5 = "tel:"+tvPhone5.getText().toString();

                    Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number5));
                    startActivity(intent5);
                    break;

                case R.id.ivCall6:
                    String tel_number6 = "tel:"+tvPhone6.getText().toString();

                    Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number6));
                    startActivity(intent6);
                    break;

                case R.id.ivCall7:
                    String tel_number7 = "tel:"+tvPhone7.getText().toString();

                    Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number7));
                    startActivity(intent7);
                    break;

                case R.id.ivCall8:
                    String tel_number8 = "tel:"+tvPhone8.getText().toString();

                    Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number8));
                    startActivity(intent8);
                    break;

            }
        }
    };
}