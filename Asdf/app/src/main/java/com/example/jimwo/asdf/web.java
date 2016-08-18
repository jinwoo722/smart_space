package com.example.jimwo.asdf;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class web extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        Intent k = getIntent();
        String temp;
        temp = k.getStringExtra("3");
    }

    public void onClick05(View V) {

        Intent m = new Intent(this, MainActivity.class);
        m.putExtra("5", "activity");
        startActivity(m);
    }
}
