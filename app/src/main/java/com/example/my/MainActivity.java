package com.example.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int a=0;
    int b=0;

    TextView t1;
    TextView t2;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button();
    }
    public void button() {

        button1 = (Button) findViewById(R.id.b_t1_2);
        button2 = (Button) findViewById(R.id.b_t1_3);
        button3 = (Button) findViewById(R.id.b_t1_f);
        button4 = (Button) findViewById(R.id.b_t2_2);
        button5 = (Button) findViewById(R.id.b_t2_3);
        button6 = (Button) findViewById(R.id.b_t2_f);

        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              a+=2;
                t1.setText("" + a);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a+=3;
                t1.setText("" + a);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a+=1;
                t1.setText("" + a);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                b+=2;
                t2.setText("" + b);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                b+=3;
                t2.setText("" + b);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                b+=1;
                t2.setText("" + b);
            }
        });
    }
}
