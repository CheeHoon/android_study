package com.sch.polio;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex12SwitchActivity extends AppCompatActivity {
    Switch switchView;
    TextView today;
    LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex12_switch);
        today = findViewById(R.id.today);
        switchView = findViewById(R.id.switchView);
        background =(LinearLayout)findViewById(R.id.background);
        switchView.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    today.setText("라이트모드");
                    today.setTextColor(Color.parseColor("#000000"));
                    background.setBackgroundResource(R.drawable.backgraw);
                } else {
                    today.setText("다크모드");
                    today.setTextColor(Color.parseColor("#ffffff"));
                    background.setBackgroundResource(R.drawable.backgr);

                }
            }
        });
    }
}