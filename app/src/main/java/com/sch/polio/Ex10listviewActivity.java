package com.sch.polio;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Ex10listviewActivity extends AppCompatActivity {
    private String TAG = "리스트뷰예제";
    private ListView listview = null;
    private ListViewAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex10listview);

        listview = (ListView) findViewById(R.id.listview);
        adapter = new ListViewAdapter();

        adapter.addItem(new Ex10PhoneNum("1", "홍길동","01012341234" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("2", "홍길동","01012341233" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("3", "홍길동","01012341234" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("4", "홍길동","01012341244" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("5", "홍길동","01012341264" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("6", "홍길동","01012341114" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("7", "홍길동","01012341554" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("8", "홍길동","01012341234" ,R.drawable.callic));
        adapter.addItem(new Ex10PhoneNum("9", "홍길동","01012341234" ,R.drawable.callic));

        listview.setAdapter(adapter);
    }

    private class ListViewAdapter extends BaseAdapter {
        ArrayList<Ex10PhoneNum> items = new ArrayList<Ex10PhoneNum>();


        @Override
        public int getCount() {return items.size();}
        public void addItem(Ex10PhoneNum item) { items.add(item);}

        @Override
        public Object getItem(int i) {return items.get(i);}

        @Override
        public long getItemId(int i) {return i;}

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            final Context context = viewGroup.getContext();
            final Ex10PhoneNum phonenum = items.get(i);

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.activity_ex10list_it, viewGroup, false);

            } else {
                View view = new View(context);
                view = (View) convertView;
            }

            TextView tv_num = (TextView) convertView.findViewById(R.id.tvNum);
            TextView tv_name = (TextView) convertView.findViewById(R.id.tvName);
            TextView tv_phone = (TextView) convertView.findViewById(R.id.tvPhone);
            ImageView iv_icon = (ImageView) convertView.findViewById(R.id.ivIcon);

            tv_num.setText(phonenum.getNum());
            tv_name.setText(phonenum.getName());
            tv_phone.setText(phonenum.getPhone());
            iv_icon.setImageResource(phonenum.getResId());

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch(iv_icon.getId()) {
                        case R.id.ivIcon:
                            String tel_number = "tel:"+tv_phone.getText().toString();
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tel_number));
                            startActivity(intent);
                            break;
                    }
                }
            });
            return convertView;
        }
    }
}