package com.example.jimwo.asdf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by jimwo on 2016-08-16.
 */
public class app extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent j = getIntent();
        String temp;
        temp = j.getStringExtra("2");
    }

    public void onClick05(View V) {

        Intent m = new Intent(this, MainActivity.class);
        m.putExtra("5", "activity");
        startActivity(m);
    }
}

/*
*  @Override
        public void onClick (View V);

        EditText edit = (EditText) findViewById(R.id.id);
        TextView text = (TextView) findViewById(R.id.idd);
        String temp;

        switch (V.getId()) {
            case (R.id.iddd);
                edit.setText("1");
                edit.setTextColor(0xffff0000);
                temp = edit.getText().toString();
                text.setText(temp);
                break;

            case (R.id.idddd);
                edit.setText("2");
                edit.setTextColor(0xff00ff00);
                temp = edit.getText().toString();
                text.setText(temp);
                break;

            case (R.id.iddddd);
                edit.setText("3");
                edit.setTextColor(0xffffff00);
                temp = edit.getText().toString();
                text.setText(temp);
                break;
        }

    }*
 * */