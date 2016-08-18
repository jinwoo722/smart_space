package com.example.jimwo.longinpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by jimwo on 2016-08-04.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adsf);

        Intent o = getIntent();
         Data data = (Data)o.getSerializableExtra("temps");
        String temp = o.getStringExtra("ㅇㅁㅇ");
        temp = data.name;
        Toast.makeText(SecondActivity.this, data.toString(), Toast.LENGTH_SHORT).show();
    }
}
