package com.sch.polio;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Ex14IntentDataSend extends AppCompatActivity {

    EditText etName, etAge, etTel, etAddr;
    String dataName, dataAge, dataTel, dataAddr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex14_intent_send);

        //초기값을 셋팅
        dataName="noName";
        dataAge="0";
        dataTel="noTel";
        dataAddr="noAddr";

        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etTel = (EditText) findViewById(R.id.etTel);
        etAddr = (EditText) findViewById(R.id.etAddr);

        findViewById(R.id.btn).setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btn:

                    //입력한 값이 공백이 아닐경우에 가져옴....
                    if(!etName.getText().toString().equals(""))
                    { dataName = etName.getText().toString();}
                    if(!etAge.getText().toString().equals(""))
                    { dataAge = etAge.getText().toString();}
                    if(!etTel.getText().toString().equals(""))
                    { dataTel = etTel.getText().toString();}
                    if(!etAddr.getText().toString().equals(""))
                    { dataAddr = etAddr.getText().toString();}

                    Intent ex17 = new Intent(Ex14IntentDataSend.this, com.sch.polio.Ex14IntentDataReceive.class);
                    ex17.putExtra("dataName",dataName);
                    ex17.putExtra("dataAge",dataAge);
                    ex17.putExtra("dataTel",dataTel);
                    ex17.putExtra("dataAddr",dataAddr);
                    startActivity(ex17);
                    break;
            }

        }
    };
}