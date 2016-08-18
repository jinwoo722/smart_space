package com.example.jimwo.asdf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jimwo on 2016-08-16.
 */
public class login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void onClick05(View V) {

        Intent m = new Intent(this, MainActivity.class);
        m.putExtra("5", "activity");
        startActivity(m);
    }
}