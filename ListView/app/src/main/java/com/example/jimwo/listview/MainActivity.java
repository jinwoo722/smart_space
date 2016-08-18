package com.example.jimwo.listview;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String>arrayList = new ArrayList<String>();
        arrayList.add("지하2층");
        arrayList.add("지하1층");
        arrayList.add("1층");
        arrayList.add("2층");
        arrayList.add("3층");
        arrayList.add("4층");

        ArrayAdapter<String>Adapter;
        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, arrayList);


        ListView list = (ListView)findViewById(R.id.listvew);
        list.setAdapter(Adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                adapterView.getItemAtPosition(i);
                switch(i){

                }
            }

        });

        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);//항목을 선택하는 모드

        list.setDivider(new ColorDrawable(Color.WHITE));//항목 사이의 구분선 생성

        list.setDividerHeight(2);//구분선의 높이 지정
    }
}
