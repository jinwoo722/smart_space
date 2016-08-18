package com.example.jimwo.activitynext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);


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

    }
}
