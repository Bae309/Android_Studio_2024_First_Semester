package com.example.guessnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1부터 100까지의 난수 생성
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;

        resultTextView = findViewById(R.id.resultTextView);
    }

    public void guess(View view) {
        // 사용자가 입력한 수를 추출
        EditText inputTextView = findViewById(R.id.inputTextView);
        String inputString = inputTextView.getText().toString();

        // 사용자가 입력한 수를 정수로 변환
        int userInput;
        try {
            userInput = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            // 입력이 숫자가 아닌 경우
            resultTextView.setText("숫자를 입력하세요.");
            return;
        }

        // 사용자 입력과 난수 비교하여 결과 출력
        if (userInput > randomNumber) {
            resultTextView.setText("HIGH");
        } else if (userInput < randomNumber) {
            resultTextView.setText("LOW");
        } else if (userInput == randomNumber) {
            resultTextView.setText("정답입니다!");
            ImageView imageView2 = findViewById(R.id.imageView2);
            imageView2.setVisibility(View.VISIBLE);
        } else if (userInput < 1) {
            resultTextView.setText("범위를 벗어났습니다!");
        } else {
            resultTextView.setText("범위를 벗어났습니다!");
        }
    }
}
