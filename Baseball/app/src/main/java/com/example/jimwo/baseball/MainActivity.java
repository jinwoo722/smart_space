package com.example.jimwo.baseball;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity implements OnClickListener {
    int life = 8, ran, Pa, Pb, Pc;
    int C1 = 1, C2 = 3, C3 = 8;
    int Strike = 0, Ball = 0, Out = 0, OutCnt = 0;
    TextView Te, T1, T2, T3, T4, T5, T6, T7, T8;
    Button Choose;
    Button Exit, Restart;
    EditText PS1, PS2, PS3;
    LinearLayout LoseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoseView = (LinearLayout) findViewById(R.id.View_Lose);
        Te = (TextView) findViewById(R.id.TxLife);
        Choose = (Button) findViewById(R.id.Btn_Choose);
        Exit = (Button) findViewById(R.id.Btn_Finish);
        Restart = (Button) findViewById(R.id.Btn_Restart);
        PS1 = (EditText) findViewById(R.id.PS1);
        PS2 = (EditText) findViewById(R.id.PS2);
        PS3 = (EditText) findViewById(R.id.PS3);
        T1 = (TextView) findViewById(R.id.T1);
        T2 = (TextView) findViewById(R.id.T2);
        T3 = (TextView) findViewById(R.id.T3);
        T4 = (TextView) findViewById(R.id.T4);
        T5 = (TextView) findViewById(R.id.T5);
        T6 = (TextView) findViewById(R.id.T6);
        T7 = (TextView) findViewById(R.id.T7);
        T8 = (TextView) findViewById(R.id.T8);
        Restart.setOnClickListener(this);
        Exit.setOnClickListener(this);
        Choose.setOnClickListener(this);

        for (int i = 0; i < 3; i++) {
            ran = (int) (Math.random() * 10);
            switch (i) {
                case 0:
                    C1 = ran;
                    break;
                case 1:
                    C2 = ran;
                    break;
                case 2:
                    C3 = ran;
                    break;
            }
        }
    }

    /*
* Button.OnClickListener howGame = new Button.OnClickListener() {
            public void onClick(View V) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("게임설명");
                alert.setMessage("숫자야구 게임이란?\n" + "1~9까지 중 임의의 숫자 3개를 컴퓨터가 랜덤으로 기억하고 있다. 그걸 유저들이 맞추는 게임\n" + "단, 똑같은 숫자가 두번 이상 들어가면 안된다.\n");
                alert.setPositiveButton("확인", null);
                alert.show();

                 findViewById(R.id.Button01).setOnClickListener(howGame);

* */

    @Override
    public void onClick(final View v) {
        Pa = Integer.parseInt(PS1.getText().toString().trim());
        Pb = Integer.parseInt(PS2.getText().toString().trim());
        Pc = Integer.parseInt(PS3.getText().toString().trim());

        if (v == Exit) {
            LoseView.setVisibility(View.GONE);
            finish();
        }
        if (v == Restart) {
            LoseView.setVisibility(View.GONE);
            life = 8;
            Te.setText("8");

            for (int i = 0; i < 3; i++) {
                ran = (int) (Math.random() * 10);
                switch (i) {
                    case 0:
                        C1 = ran;
                        break;
                    case 1:
                        C2 = ran;
                        break;
                    case 2:
                        C3 = ran;
                        break;
                }
            }
            Strike = 0;
            Ball = 0;
            Out = 0;
        }
        if (v == Choose) {
            if (Pa == Pb || Pb == Pc || Pc == Pa) {
                Toast.makeText(MainActivity.this, "중복된 숫자가 존재합니다.", Toast.LENGTH_SHORT).show();
            } else {
                if (Pa == C1) {
                    Strike++;
                }
                if (Pb == C2) {
                    Strike++;
                }
                if (Pc == C3) {
                    Strike++;
                }

                if (Pa == C2 || Pa == C3) {
                    Ball++;
                }
                if (Pb == C1 || Pb == C3) {
                    Ball++;
                }
                if (Pc == C2 || Pc == C1) {
                    Ball++;
                }

                if (Pa != C1 && Pa != C2 && Pa != C3) {
                    OutCnt++;
                }
                if (Pb != C1 && Pb != C2 && Pb != C3) {
                    OutCnt++;
                }
                if (Pc != C1 && Pc != C2 && Pc != C3) {
                    OutCnt++;
                }
                if (OutCnt == 3) {
                    Out += 1;
                    OutCnt = 0;
                }
                switch (life) {
                    case 8:
                        T1.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃");
                        life--;
                        Te.setText("7");
                        break;
                    case 7:
                        T2.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃");
                        life--;
                        Te.setText("6");
                        break;
                    case 6:
                        T3.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃");
                        life--;
                        Te.setText("5");
                        break;
                    case 5:
                        T4.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃");
                        life--;
                        Te.setText("4");
                        break;
                    case 4:
                        T5.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃");
                        life--;
                        Te.setText("3");
                        break;
                    case 3:
                        T6.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃");
                        life--;
                        Te.setText("2");
                        break;
                    case 2:
                        T7.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃" + C1 + C2 + C3);
                        life--;
                        Te.setText("1");
                        break;
                    case 1:
                        T8.setText(Strike + "스트라이크, " + Ball + "볼, " + Out + "아웃");
                        life--;
                        Te.setText("0");
                        break;
                }

                OutCnt = 0;
                Strike = 0;
                Ball = 0;
                Out = 0;
                if (life == 0) {
                    LoseView.setVisibility(View.VISIBLE);
                }
            }
        }
    }
}
