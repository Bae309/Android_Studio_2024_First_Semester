package com.example.tablelayout_test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    TextView resultText;

    Button addButton, dropButton, multiButton, divButton;

    Button numberButtons[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberButtons = new Button[]{
                findViewById(R.id.button0),
                findViewById(R.id.button1),
                findViewById(R.id.button2),
                findViewById(R.id.button3),
                findViewById(R.id.button4),
                findViewById(R.id.button5),
                findViewById(R.id.button6),
                findViewById(R.id.button7),
                findViewById(R.id.button8),
                findViewById(R.id.button9)
        };

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        resultText = findViewById(R.id.resultText);
        addButton = findViewById(R.id.addbutton);
        dropButton = findViewById(R.id.dropbutton);
        multiButton = findViewById(R.id.multibutton);
        divButton = findViewById(R.id.divbutton);

        // 숫자 버튼에 대한 클릭 리스너 추가
        for (int i = 0; i < numberButtons.length; i++) {
            final int finalI = i;
            numberButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (editText1.hasFocus()) {
                        String currentText = editText1.getText().toString();
                        editText1.setText(currentText + finalI);
                    }

                    else if (editText2.hasFocus()) {
                        String currentText = editText2.getText().toString();
                        editText2.setText(currentText + finalI);
                    }

                    else {
                        Toast.makeText(getApplicationContext(),"먼저 에디트 텍스트를 선택하시오.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('+');
            }
        });

        dropButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });

        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });
    }

    private boolean isValidInput() {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        return !text1.isEmpty() && !text2.isEmpty();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    
    private void calculate(char operator) {
        double operand1 = Double.parseDouble(editText2.getText().toString());
        double operand2 = Double.parseDouble(editText1.getText().toString());
        double result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    resultText.setText("0으로 나눌수 없습니다!");
                    return;
                }
                break;
        }

        resultText.setText("결과 : " + result);
    }
}