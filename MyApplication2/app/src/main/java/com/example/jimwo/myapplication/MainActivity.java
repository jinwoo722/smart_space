package com.example.jimwo.myapplication;

import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private long lastTimeBackPressed() {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onBackPressed()
    {
        if(lastTimeBackPressed= System.currentTimeMillis()-lastTimeBackPressed<1500)
        {
            finish();
            return;
        }
        Toast.makeText(this, "'뒤로' 버튼을 한번 더 누르면 종료합니다.", Toast,LENGTH_SHORT).show();
        lastTimeBackPressed = System.currentTimeMillis();
    }
}
