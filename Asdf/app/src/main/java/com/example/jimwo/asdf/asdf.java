package com.example.jimwo.asdf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class asdf extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asdf);


        Intent i = getIntent();
        String temp;
        temp = i.getStringExtra("1");
    }
    public void onClick02(View V) {

        Intent j = new Intent(asdf.this,app.class);
        j.putExtra("2", "activity");
        startActivity(j);
    }


    public void onClick03(View V) {

        Intent k = new Intent(asdf.this,web.class);
        k.putExtra("3", "activity");
        startActivity(k);
    }

    public void onClick04(View V) {

        Intent l = new Intent(asdf.this, java.class);
        l.putExtra("4", "activity");
        startActivity(l);
    }

    public void onClick05(View V) {

        Intent m = new Intent(this, MainActivity.class);
        m.putExtra("5", "activity");
        startActivity(m);
    }
}