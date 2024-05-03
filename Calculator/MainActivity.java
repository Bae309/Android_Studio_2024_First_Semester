package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText eText1;
    EditText eText2;
    TextView eText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button bplus = (Button) findViewById(R.id.button);
        eText1 = (EditText) findViewById(R.id.editTextText);
        eText2 = (EditText) findViewById(R.id.editTextText2);
        eText3 = (TextView) findViewById(R.id.result);
    }

    public void cal_plus(View e) {
        String s1 = eText1.getText().toString();
        String s2 = eText2.getText().toString();
        int result = Integer.parseInt(s1) + Integer.parseInt(s2);
        eText3.setText("" + result);
    }

    public void cal_minus(View e) {
        String s1 = eText1.getText().toString();
        String s2 = eText2.getText().toString();
        int result = Integer.parseInt(s1) - Integer.parseInt(s2);
        eText3.setText("" + result);
    }

    public void cal_multiply(View e) {
        String s1 = eText1.getText().toString();
        String s2 = eText2.getText().toString();
        int result = Integer.parseInt(s1) * Integer.parseInt(s2);
        eText3.setText("" + result);
    }
    public void cal_divide(View e) {
        String s1 = eText1.getText().toString();
        String s2 = eText2.getText().toString();

        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);

        if (num2 != 0) { // 분모가 0이 아닌 경우에만 나누기 수행
            double result = num1 / num2;
            String formattedResult = String.format("%.3f", result);
            eText3.setText("" + formattedResult);
        } else {
            eText3.setText("Cannot divide by zero");
        }
    }

    public void percentage(View e) {
        String s1 = eText1.getText().toString();
        String s2 = eText2.getText().toString();
        int result = Integer.parseInt(s1) % Integer.parseInt(s2);
        eText3.setText("" + result);
    }
}