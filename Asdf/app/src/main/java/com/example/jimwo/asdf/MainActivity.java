package com.example.jimwo.asdf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent m = getIntent();
        String temp;
        temp = m.getStringExtra("5");

        Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
    }

    public void onClick01(View V) {

        Intent i = new Intent(MainActivity.this, asdf.class);
        i.putExtra("1", "activity");
        startActivity(i);
    }

}