package com.example.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginInfoActivity extends AppCompatActivity {

    private TextView displayIDTextView, displayPasswordTextView, statusTextView;
    String id, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_info);

        displayIDTextView = findViewById(R.id.textView2);
        displayPasswordTextView = findViewById(R.id.textView4);
        statusTextView = findViewById(R.id.textView8);

        Intent intent = getIntent();
        if (intent != null) {
            id = intent.getStringExtra("ID");
            password = intent.getStringExtra("Password");

            displayIDTextView.setText("아이디 : " + id);
            displayPasswordTextView.setText("비밀번호 : " + password);
        }
    }

    public void check(View e) {
        Intent intent = new Intent();
        if(isUserValid(id, password)) {
            intent.putExtra("status", "로그인 성공!!!!");
        }
        else {
            intent.putExtra("Status", "로그인 실패!");
        }
        setResult(RESULT_OK, intent);
        finish();
    }

    private boolean isUserValid(String username, String password) {
        return username.equals("Kim") && password.equals("1234");
    }
}