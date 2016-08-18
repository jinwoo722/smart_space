package com.example.jimwo.baseballgame;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int cnt;
            int[]ran = new int[3];
    int []num = new int[3];
    int strike, ball;

    EditText edit;
    TextView result_st;
    TextView result_ba;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cnt = 0;

        edit = (EditText)findViewById(R.id.EditText1);
        result_st = (TextView)findViewById(R.id.text01);
        result_ba = (TextView)findViewById(R.id.text02);
        info = (TextView)findViewById(R.id.TextView01);
        findViewById(R.id.Button01).setOnClickListener(howGame);
        findViewById(R.id.Button02).setOnClickListener(gameStart);
        findViewById(R.id.Button03).setOnClickListener(enter);
    }
    Button.OnClickListener gameStart = new Button.OnClickListener(){
        public void onClick(View V){
            Toast.makeText(MainActivity.this, "Start Game", Toast.LENGTH_SHORT).show();

            info.setText("숫자를 세개 입력하시오");
            for(int i =0; i<ran.length; i++);{
                ran[i] = new Random().nextInt(9)+1;

                for(int j =0; j<i; j++){
                    if (ran[i] == ran[j]){
                        i--;
                        break;
                    }
                }
            }
        }
    };

    Button.OnClickListener howGame = new Button.OnClickListener(){
        public void onClick(View V){
            AlertDialog.b
        }
    }
}
