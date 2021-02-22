package com.hannah.mycalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hannah.mycalcapp.network.CalcService;

public class MainActivity extends AppCompatActivity {
    Button add_btn, divide_btn, subtract_btn, multiply_btn;
    EditText value1_txt, value2_txt, result_txt;
   int value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_btn = findViewById(R.id.add);
        divide_btn = findViewById(R.id.divide);
        subtract_btn = findViewById(R.id.subtract);
        multiply_btn = findViewById(R.id.multiply);

        value1_txt = findViewById(R.id.value1);
        value2_txt = findViewById(R.id.value2);
        result_txt = findViewById(R.id.result);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!value1_txt.getText().toString().isEmpty() && !value2_txt.getText().toString().isEmpty()){
                    value1 = Integer.parseInt(value1_txt.getText().toString());
                    value2 = Integer.parseInt(value2_txt.getText().toString());
                }
                calcService.Add();
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!value1_txt.getText().toString().isEmpty() && !value2_txt.getText().toString().isEmpty()){
                    value1 = Integer.parseInt(value1_txt.getText().toString());
                    value2 = Integer.parseInt(value2_txt.getText().toString());
                }
                calcService.Divide();
            }
        });

        subtract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!value1_txt.getText().toString().isEmpty() && !value2_txt.getText().toString().isEmpty()){
                    value1 = Integer.parseInt(value1_txt.getText().toString());
                    value2 = Integer.parseInt(value2_txt.getText().toString());
                }
                calcService.Subtract();
            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!value1_txt.getText().toString().isEmpty() && !value2_txt.getText().toString().isEmpty()){
                    value1 = Integer.parseInt(value1_txt.getText().toString());
                    value2 = Integer.parseInt(value2_txt.getText().toString());
                }
                calcService.Multiply();
            }
        });


    }
    CalcService calcService = new CalcService() {
        @Override
        public void Add() {
            result_txt.setText(String.valueOf(value1 + value2));
        }

        @Override
        public void Divide() {
            result_txt.setText(String.valueOf(value1 / value2));
        }

        @Override
        public void Subtract() {
            result_txt.setText(String.valueOf(value1 - value2));
        }

        @Override
        public void Multiply() {
            result_txt.setText(String.valueOf(value1 * value2));
        }
    };


}