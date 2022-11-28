package com.sch.polio;

import android.content.Context;
import android.content.Intent;
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

public class Mainmain extends AppCompatActivity {
    private String TAG = "리스트뷰예제";
    private ListView listview = null;
    private ListViewAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmain);

        listview = (ListView) findViewById(R.id.listview);
        adapter = new ListViewAdapter();

        adapter.addItem(new Mainlist("1", "  Animation", R.drawable.btngo));
        adapter.addItem(new Mainlist("2", "  gif", R.drawable.btngo));
        adapter.addItem(new Mainlist("3", "  Video play", R.drawable.btngo));
        adapter.addItem(new Mainlist("4", "  Music play", R.drawable.btngo));
        adapter.addItem(new Mainlist("5", "  Web view", R.drawable.btngo));
        adapter.addItem(new Mainlist("6", "  Telephone", R.drawable.btngo));
        adapter.addItem(new Mainlist("7", "  sms", R.drawable.btngo));
        adapter.addItem(new Mainlist("8", "  Gallery view", R.drawable.btngo));
        adapter.addItem(new Mainlist("9", "  List", R.drawable.btngo));
        adapter.addItem(new Mainlist("10", "  List view", R.drawable.btngo));
        adapter.addItem(new Mainlist("11", "  Spinner", R.drawable.btngo));
        adapter.addItem(new Mainlist("12", "  Switch", R.drawable.btngo));
        adapter.addItem(new Mainlist("13", "  IntentData", R.drawable.btngo));
        adapter.addItem(new Mainlist("14", "  IntentData ex", R.drawable.btngo));
        adapter.addItem(new Mainlist("15", "  SharedPreference", R.drawable.btngo));
        adapter.addItem(new Mainlist("16", "  SharedPreference(Login)", R.drawable.btngo));
        adapter.addItem(new Mainlist("17", "  Viewpager", R.drawable.btngo));
        adapter.addItem(new Mainlist("18", "  Handler", R.drawable.btngo));
        adapter.addItem(new Mainlist("19", "  Fragment", R.drawable.btngo));
        adapter.addItem(new Mainlist("20", "  Calculator", R.drawable.btngo));
        adapter.addItem(new Mainlist("21", "  Gps map", R.drawable.btngo));
        adapter.addItem(new Mainlist("22", "  SQ Lite", R.drawable.btngo));

        listview.setAdapter(adapter);
    }

    private class ListViewAdapter extends BaseAdapter {
        ArrayList<Mainlist> items = new ArrayList<Mainlist>();


        @Override
        public int getCount() {return items.size();}
        public void addItem(Mainlist item) { items.add(item);}

        @Override
        public Object getItem(int i) {return items.get(i);}

        @Override
        public long getItemId(int i) {return i;}

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            final Context context = viewGroup.getContext();
            final Mainlist list = items.get(i);

            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.activity_maimmainlist_it, viewGroup, false);

            } else {
                View view = new View(context);
                view = (View) convertView;
            }

            TextView tv_num = (TextView) convertView.findViewById(R.id.tvNum);
            TextView tv_name = (TextView) convertView.findViewById(R.id.tvName);
            ImageView iv_icon = (ImageView) convertView.findViewById(R.id.ivIcon);

            tv_num.setText("Ex "+list.getNum()+" )");
            tv_name.setText(list.getName());
            iv_icon.setImageResource(list.getResId());

            iv_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(list.getNum().equals("1")){
                           Intent act1 = new Intent(Mainmain.this, Ex1AnimationActivity.class);
                           startActivity(act1);
                       }
                    if(list.getNum().equals("2")){
                            Intent act1 = new Intent(Mainmain.this, Ex2gifActivity.class);
                            startActivity(act1);
                       }
                    if(list.getNum().equals("3")){
                        Intent act1 = new Intent(Mainmain.this, Ex3VideoActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("4")){
                        Intent act1 = new Intent(Mainmain.this, Ex4MediaActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("5")){
                        Intent act1 = new Intent(Mainmain.this, Ex5WebViewActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("6")){
                        Intent act1 = new Intent(Mainmain.this, Ex6TelActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("7")){
                        Intent act1 = new Intent(Mainmain.this, com.sch.polio.Ex7SmsActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("8")){
                        Intent act1 = new Intent(Mainmain.this, Ex8GalleryViewEx.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("9")){
                        Intent act1 = new Intent(Mainmain.this, com.sch.polio.Ex9listActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("10")){
                        Intent act1 = new Intent(Mainmain.this, Ex10listviewActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("11")){
                        Intent act1 = new Intent(Mainmain.this, Ex11spinnerActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("12")){
                        Intent act1 = new Intent(Mainmain.this, Ex12SwitchActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("13")){
                        Intent act1 = new Intent(Mainmain.this, Ex13IntentDataSend.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("14")){
                        Intent act1 = new Intent(Mainmain.this, Ex14IntentDataSend.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("15")){
                        Intent act1 = new Intent(Mainmain.this, Ex15SharedPreferences.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("16")){
                        Intent act1 = new Intent(Mainmain.this, Ex16LoginSharedPreferences.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("17")){
                        Intent act1 = new Intent(Mainmain.this, Ex17Viewpager2.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("18")){
                        Intent act1 = new Intent(Mainmain.this, Ex18HadlerEx.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("19")){
                        Intent act1 = new Intent(Mainmain.this, Ex19FragmentEx.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("20")){
                        Intent act1 = new Intent(Mainmain.this, Ex20CalcActivity.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("21")){
                        Intent act1 = new Intent(Mainmain.this, Ex21GpsMapEx.class);
                        startActivity(act1);
                    }
                    if(list.getNum().equals("22")){
                        Intent act1 = new Intent(Mainmain.this, Ex22SQLiteExLogin.class);
                        startActivity(act1);
                    }
                }
            });

            return convertView;
        }
    }
}