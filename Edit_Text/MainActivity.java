package com.example.edit_text;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editID;
    private EditText editPW;
    private EditText editPN;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editID = findViewById(R.id.editID);
        editPW = findViewById(R.id.editPW);
        editPN = findViewById(R.id.editPN);
        txtResult = findViewById(R.id.ViewUser);
    }

    public void onSignupButtonClick(View view) {
        String username = editID.getText().toString();
        String password = editPW.getText().toString();
        String phoneNumber = editPN.getText().toString();

        String usrinfo = "아이디 : " + username + "\n패스워드 : " + password + "\n전화번호 : " +
                phoneNumber;
        txtResult.setText(usrinfo);
    }
}