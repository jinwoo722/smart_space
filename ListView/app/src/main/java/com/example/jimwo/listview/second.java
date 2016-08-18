package com.example.jimwo.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jimwo on 2016-08-11.
 */
public class second extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Bundle b = getIntent().getExtras();
        String text = b.getString("arr_text");

        TextView sc_t = (TextView)findViewById(R.id.Text);
        sc_t.setText(text);
    }
}
