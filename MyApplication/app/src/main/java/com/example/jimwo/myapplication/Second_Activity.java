package com.example.jimwo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by jimwo on 2016-08-02.
 */
public class Second_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out);
        Intent i = getIntent();
                String temp;
               temp = i.getStringExtra("1");

        Toast.makeText(Second_Activity.this, "ㅇㅁㅇ", Toast.LENGTH_SHORT).show();
    }

}
