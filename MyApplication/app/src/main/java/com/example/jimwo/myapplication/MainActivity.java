package com.example.jimwo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View V) {


        Intent i = new Intent(MainActivity.this, Second_Activity.class);
        i.putExtra("1", "please wait, this is activity");
        startActivity(i);
    }
}