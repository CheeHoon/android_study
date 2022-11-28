package com.sch.polio;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ex16LoginSharedPreferences extends AppCompatActivity implements View.OnClickListener {
    CheckBox cbId;
    SharedPreferences pref;
    boolean saveLoginData;// 프리퍼런스
    SharedPreferences.Editor editor;
    String myStr;
    EditText etString;
    String id = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex16_login_shared_preferences);

        etString = findViewById(R.id.etString);

        pref = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        cbId = (CheckBox) findViewById(R.id.cbId);
        load();

        cbId.setOnClickListener(this);

        myStr = pref.getString("MyStr", "A");
        etString.setText(myStr);
    }


    @Override
    public void onClick(View view) {
        if(cbId.isChecked()==true){
            saveId();
        }
        else{
            etString.setText("");
        }
    }
    private void saveId() {
        // SharedPreferences 객체만으론 저장 불가능 Editor 사용
        SharedPreferences.Editor editor = pref.edit();

        // 에디터객체.put타입( 저장시킬 이름, 저장시킬 값 )
        // 저장시킬 이름이 이미 존재하면 덮어씌움
        editor.putBoolean("SAVE_LOGIN_DATA", cbId.isChecked());
        editor.putString("ID", etString.getText().toString().trim());

        // apply, commit 을 안하면 변경된 내용이 저장되지 않음
        editor.apply();
    }
    // 설정값을 불러오는 함수
    private void load() {
        // SharedPreferences 객체.get타입( 저장된 이름, 기본값 )
        // 저장된 이름이 존재하지 않을 시 기본값
        saveLoginData = pref.getBoolean("SAVE_LOGIN_DATA", false);
        id = pref.getString("ID", "");

        //체크박스가 체크되었던 값으로 기억시 체크됨.
        if(saveLoginData){cbId.setChecked(true);}

        //처음로드시 값이 공백이면 무시 값이 있다면 아이디 가져와서 셋팅
        if(id.equals("")) {
        }
        else {
            etString.setText(id);
        }
    }
}