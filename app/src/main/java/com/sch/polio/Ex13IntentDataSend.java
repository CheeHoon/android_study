package com.sch.polio;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Ex13IntentDataSend extends AppCompatActivity {
    TextView textView;

    String[] items = {"사과", "오렌지", "딸기"};
    String temp = "";//스피너 선택값 저장변수
    EditText etPrice;
    String data1="사과";
    String data2="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex13_intent_data_send);

        textView = (TextView) findViewById(R.id.tvSel);
        etPrice = (EditText) findViewById(R.id.etPrice);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, items
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        spinner.setAdapter(adapter);

        // 스피너에서 선택 했을 경우 이벤트 처리
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                ((TextView)adapterView.getChildAt(0)).setTextColor(Color.WHITE);
                ((TextView)adapterView.getChildAt(0)).setTextSize(40);
                textView.setText(items[position]);

                temp = items[position];
                Log.d("스피너테스트", "선택값 저장된 변수 temp : " + temp);
                //문자열비교로할경우

                //인덱스 position으로 비교할경우
                if(position == 0){
                    data1=temp;

                }
                else if(position == 1){
                    data1=temp;

                }
                else if(position == 2){
                    data1=temp;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                textView.setText("선택 : ");
            }
        });


        findViewById(R.id.btnFoo).setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnFoo:
                    data2=etPrice.getText().toString();
                    Intent ex13 = new Intent(Ex13IntentDataSend.this, com.sch.polio.Ex13IntentDataReceive.class);
                    ex13.putExtra("data1",data1);
                    ex13.putExtra("data2",data2);
                    startActivity(ex13);
                    break;
            }

        }
    };
}