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


    int a;
    //사용자가 입력한 횟수
    int[]ran = new int[3];  //랜덤을 사용함으로써 게임을 새로 시작 할 때마다 숫자가 바뀐다.
    int []num = new int[3]; //유저가 입력한 숫자를 말한다.
    int strike, ball;

    EditText edit;  //사용자가 숫자를 입력하는 곳.
    TextView result_st; //스트라이크가 처리되는곳
    TextView result_ba;  //볼이 처리되는 곳
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = 0;

        edit = (EditText)findViewById(R.id.EditText1);
        result_st = (TextView)findViewById(R.id.text01); //아래 글자로 스트라이크가 몇개가 됬는지 보여준다
        result_ba = (TextView)findViewById(R.id.text02); //아래 글자로 볼이 몇개가 되었는지 보여준다.
        info = (TextView)findViewById(R.id.TextView01);
        findViewById(R.id.Button01).setOnClickListener(howGame);
        findViewById(R.id.Button02).setOnClickListener(gameStart);
        findViewById(R.id.Button03).setOnClickListener(enter);
    }
    Button.OnClickListener gameStart = new Button.OnClickListener(){
        public void onClick(View V){
            Toast.makeText(MainActivity.this, "Start Game", Toast.LENGTH_SHORT).show();

            info.setText("숫자를 세개 입력하시오");
            for(int i =0; i<ran.length; i++) // 랜덤의 최대인 3만큼 사용가능
            {
                ran[i] = new Random().nextInt(9)+1; // 1부터 9까지의 숫자를 변수 i에 저장을 한다. 그리고 랜덤으로 뽑은 숫자들이 겹치는지 안겹치는지 확인

                for(int j =0; j<i; j++){
                    if (ran[i] == ran[j]){
                        i--;
                        break;
                    }
                }
            }
        }
    };
  //게임에 대한 간단한 설명을 버튼을 누를시 보여준다..
    Button.OnClickListener howGame = new Button.OnClickListener(){
        public void onClick(View V){
            AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("게임설명");
            alert.setMessage("숫자야구 게임아란?"+ "임의의 숫자 3개를 컴퓨터가 랜덤으로 기억하고 있다. 그걸 유저들이 맞추는 게임"+"단, 똑같은 숫자가 두번 이상 들어가면 안된다.");
            alert.setPositiveButton("확인",null);
            alert.show();
        }
    };
    Button.OnClickListener enter = new Button.OnClickListener(){
        public void onClick(View V){
            a++; // 버튼을 누를 때 마다 도전 횟수 증가
            strike = 0;
            ball = 0;
            for (int k =0; k<num.length; k++){
                num[k] = edit.getText().charAt(k) - 48; // (친구가 알려준것) 아스키 코드표를 이용하여 8이나 문자 0 을 뺴줘야 인식을 할 수 있다

            }
            for (int i =0; i<ran.length; i++) //내가 지정한 랜덤값인 3 만큼 반복을 계속해준다.
            {
                for (int j = 0; j<num.length; j++)
                    if (ran[i] == num[j]) {
                        if (i == j) {
                            strike++;

                            result_st.setText(Integer.toString(strike));
                            if (strike == 1)
                                Toast.makeText(MainActivity.this, "1 스트라이크 입니다", Toast.LENGTH_SHORT).show();
                            if (strike == 2)
                                Toast.makeText(MainActivity.this, "2 스트라이크 입니다", Toast.LENGTH_SHORT).show();
                            if (strike == 3)
                                Toast.makeText(MainActivity.this, "3 스트라이크 입니다", Toast.LENGTH_SHORT).show();

                        }
                        if (i != j)
                        {

                            ball++;
                            result_ba.setText(Integer.toString(ball));

                        }
                        else{
                            result_ba.setText("0");
                        }
                    }
                if (strike == 3);
                strike = 0;
                ball = 0;

                result_st.setText(Integer.toString(strike));
                result_ba.setText(Integer.toString(ball));
                AlertDialog.Builder alert2 = new AlertDialog.Builder(MainActivity.this);
                alert2.setMessage("당신이 컴퓨터를 이겼습니다"+"다시하려면 게임시작 버튼을 눌러주세요");
                alert2.setPositiveButton("확인",null);
                alert2.show();
                info.setText("게임시작 버튼을 눌러주세요");
            }
        }
    };
}
