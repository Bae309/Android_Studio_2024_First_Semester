package com.example.generate_random_num;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewRandomNumber = (TextView) findViewById(R.id.textViewRandomNumber);
        textViewRandomNumber.setText("0");
    }

    public void generateRandomNumber(View view) {
        // 난수 생성
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // 텍스트 뷰에 난수 표시
        textViewRandomNumber.setText("" + randomNumber);
    }
}