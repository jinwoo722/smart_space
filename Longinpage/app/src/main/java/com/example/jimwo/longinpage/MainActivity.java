package com.example.jimwo.longinpage;

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
    public void onClick (View V){
        Intent I = new Intent(MainActivity.this, SecondActivity.class);
        Data a = new Data("a",123);
        String temp ="23";
        I.putExtra("a", new Data("temps", 123));
        startActivity(I);
    }
}
