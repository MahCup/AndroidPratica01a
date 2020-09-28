package com.example.pratica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPlus, btnMinus, btnTimes, btnDivide;
    private EditText n1, n2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciando os widgets
        btnPlus = findViewById(R.id.buttonPlus);
        btnMinus = findViewById(R.id.buttonMinus);
        btnTimes = findViewById(R.id.buttonTimes);
        btnDivide = findViewById(R.id.buttonDivide);

        n1 = findViewById(R.id.TextNumber1);
        n2 = findViewById(R.id.TextNumber2);
        result = findViewById(R.id.TextViewResult);
    }

    public void Sum(View view) {
        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        Double E = C + D;
        result.setText(E.toString());
    }

    public void Subtraction(View view) {
        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        Double E = C - D;
        result.setText(E.toString());
    }

    public void Multiplication(View view) {
        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        Double E = C * D;
        result.setText(E.toString());
    }

    public void Division(View view) {
        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        Double E = C / D;
        result.setText(E.toString());
    }
}