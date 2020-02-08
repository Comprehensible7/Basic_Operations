package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 변수선언
    Button a_pl;
    Button a_min;
    Button a_multi;
    Button a_div;

    EditText w_tx1;
    EditText w_tx2;
    TextView w_res;

    String num_1;
    String num_2;

    int res;

    // 자동정렬 : Option + Command + L
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a_pl    = (Button) findViewById(R.id.a_pl);
        a_min   = (Button) findViewById(R.id.a_min);
        a_multi = (Button) findViewById(R.id.a_multi);
        a_div   = (Button) findViewById(R.id.a_div);

        w_tx1 = (EditText) findViewById(R.id.w_t1);
        w_tx2 = (EditText) findViewById(R.id.w_t2);
        w_res = (TextView) findViewById(R.id.w_r1);

        a_pl.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                num_1 = w_tx1.getText().toString();
                num_2 = w_tx2.getText().toString();

                res = Integer.parseInt(num_1) + Integer.parseInt(num_2);
                w_res.setText(Integer.toString(res)); // 인트로 받아온 값을 스트링으로 변환
            }
        });

        a_min.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num_1 = w_tx1.getText().toString();
                num_2 = w_tx2.getText().toString();

                res = Integer.parseInt(num_1) - Integer.parseInt(num_2);
                        w_res.setText(Integer.toString(res));
            }
        });

        a_multi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num_1 = w_tx1.getText().toString();
                num_2 = w_tx2.getText().toString();

                res = Integer.parseInt(num_1) * Integer.parseInt(num_2);
                        w_res.setText(Integer.toString(res));
            }
        });

        a_div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num_1 = w_tx1.getText().toString();
                num_2 = w_tx2.getText().toString();

                res = Integer.parseInt(num_1) / Integer.parseInt(num_2);
                        w_res.setText(Integer.toString(res));
            }
        });


    }




}
