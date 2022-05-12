package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button ravno;
    private Button minus;
    private Button plus;
    private Button delit;
    private Button umnoj;
    private Button clear;
    private Button stepen;
    private TextView textview;
    private Button tochka;
    private String rezult;
    private Calculator calculator;
    private HorizontalScrollView hsv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b3);
        b3 = findViewById(R.id.b2);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        ravno = findViewById(R.id.ravno);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        delit = findViewById(R.id.delit);
        umnoj = findViewById(R.id.umnoj);
        clear = findViewById(R.id.clear);
        stepen = findViewById(R.id.stepen);
        tochka = findViewById(R.id.tochka);
        hsv = findViewById(R.id.hsv);
        textview = findViewById(R.id.textview);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        clear.setOnClickListener(this);
        ravno.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        delit.setOnClickListener(this);
        tochka.setOnClickListener(this);
        umnoj.setOnClickListener(this);
        stepen.setOnClickListener(this);
        calculator = new Calculator();
    }
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case  R.id.b0:
                    rezult = "0";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b1:
                    rezult = "1";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b2:
                    rezult = "2";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b3:
                    rezult = "3";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b4:
                    rezult = "4";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b5:
                    rezult = "5";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b6:
                    rezult = "6";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b7:
                    rezult = "7";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b8:
                    rezult = "8";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.b9:
                    rezult = "9";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.clear:
                    rezult = "clear";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.minus:
                    rezult = "-";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.plus:
                    rezult = "+";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.delit:
                    rezult = "/";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.tochka:
                    rezult = ".";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.ravno:
                    rezult = "=";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.umnoj:
                    rezult = "*";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
                case R.id.stepen:
                    rezult = "^";
                    textview.setText(calculator.calculation(rezult));
                    scroll();
                    break;
            }
        }
        public void scroll(){
            hsv.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
        }

    }