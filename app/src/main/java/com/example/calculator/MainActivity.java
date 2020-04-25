package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public double Result(double a, double b, String operator) {
        double result = 0.0;
        if (operator.equals("+")){
            result = a + b;
        }else if (operator.equals("-")){
            result = a - b;
        }else if (operator.equals("/")){
            result = a / b;
        }else if (operator.equals("*")){
            result = a * b;
        }
        return result;
    }

}
