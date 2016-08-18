package com.example.jimwo.listview2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

class Activity1 extends Activity {
    private String data[] =
            { "지하 2층", "지하 1층", "1층","2층","3층","4층"};


    ListView list;
    EditText edit;
    ArrayAdapter<String> array;


    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

        if (position == 0) {
            Intent intent0 = new Intent(Activity1.this, test2.class);
            startActivity(intent0);
        }
        else if (position == 1) {
            Intent intent1 = new Intent(Activity1.this, test3.class);
            startActivity(intent1);
        }
        else if (position == 2) {
            Intent intent2 = new Intent(Activity1.this, test4.class);
            startActivity(intent2);
        }

    }
    public void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list=(ListView)findViewById(R.id.ListView01);


        array =  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , data);
        list.setAdapter(array);
        list.setOnItemClickListener((AdapterView.OnItemClickListener) this);


        // By using setTextFilterEnabled method in Listview we can filter the Listview items.


        list.setTextFilterEnabled(true);
        edit.addTextChangedListener(new TextWatcher()
        {
            public void onTextChanged( CharSequence arg0, int arg1, int arg2, int arg3)
            {
                // TODO Auto-generated method stub
            }


            public void beforeTextChanged( CharSequence arg0, int arg1, int arg2, int arg3)
            {
                // TODO Auto-generated method stub
            }

            public void afterTextChanged( Editable arg0)
            {
                Activity1.this.array.getFilter().filter(arg0);
            }
        });
    }
}

