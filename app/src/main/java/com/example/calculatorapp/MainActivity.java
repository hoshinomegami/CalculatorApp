package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView resultText;
    Button addBtn, subBtn, mulBtn, divBtn, sq1Btn, sq2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        resultText = findViewById(R.id.resultText);

        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);
        sq1Btn = findViewById(R.id.sq1Btn);
        sq2Btn = findViewById(R.id.sq2Btn);

        addBtn.setOnClickListener(v -> {
            double a = getNum(firstNumber);
            double b = getNum(secondNumber);
            resultText.setText("Result: " + (a + b));
        });

        subBtn.setOnClickListener(v -> {
            double a = getNum(firstNumber);
            double b = getNum(secondNumber);
            resultText.setText("Result: " + (a - b));
        });

        mulBtn.setOnClickListener(v -> {
            double a = getNum(firstNumber);
            double b = getNum(secondNumber);
            resultText.setText("Result: " + (a * b));
        });

        divBtn.setOnClickListener(v -> {
            double a = getNum(firstNumber);
            double b = getNum(secondNumber);
            if (b == 0) {
                resultText.setText("Result: Cannot divide by 0");
            } else {
                resultText.setText("Result: " + (a / b));
            }
        });

        sq1Btn.setOnClickListener(v -> {
            double a = getNum(firstNumber);
            resultText.setText("Result: " + (a * a));
        });

        sq2Btn.setOnClickListener(v -> {
            double b = getNum(secondNumber);
            resultText.setText("Result: " + (b * b));
        });
    }

    private double getNum(EditText input) {
        String s = input.getText().toString();
        return s.isEmpty() ? 0 : Double.parseDouble(s);
    }
}
