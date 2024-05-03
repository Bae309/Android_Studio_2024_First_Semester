package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView5);
    }

    public void counterUp(View view) {
        num++;
        textView.setText("" + "카운터 : " + num);
    }

    public void counterDown(View view) {
        num--;
        textView.setText("" + "카운터 : " + num);
    }

    public void reset(View view) {
        num = 0;
        textView.setText("" + "카운터 : ");
    }
}