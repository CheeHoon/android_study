package com.sch.polio;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex11spinnerActivity extends AppCompatActivity {
    TextView textView;
    ImageView ivCard;
    String[] items = {"벨져", "휴톤", "티엔"};

    String temp = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex11spinner);

        ivCard = (ImageView)findViewById(R.id.ivCard);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ((TextView)adapterView.getChildAt(0)).setTextColor(Color.WHITE);
                ((TextView)adapterView.getChildAt(0)).setTextSize(40);
                ((TextView)adapterView.getChildAt(0)).setBackgroundColor(Color.rgb(76,76,76));


                temp = items[i];

                if(items[i].equals("벨져")){
                    ivCard.setImageResource(R.drawable.belj);
                }
                if(items[i].equals("휴톤")){
                    ivCard.setImageResource(R.drawable.hutt);
                }
                if(items[i].equals("티엔")){
                    ivCard.setImageResource(R.drawable.tien);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}