package com.example.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private TextView statusText;
    private Button loginButton;
    ActivityResultLauncher<Intent> launcher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.editTextText);
        passwordEditText = findViewById(R.id.editTextText2);
        loginButton = findViewById(R.id.button2);
        statusText = findViewById(R.id.textView7);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();


                Intent intent = new Intent(LoginActivity.this, LoginInfoActivity.class);
                intent.putExtra("ID", email);
                intent.putExtra("Password", password);
                launcher.launch(intent);
            }
        });


        launcher = registerForActivityResult(new ActivityResultContracts.
                StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        statusText.setText(data.getStringExtra("status"));
                    }
                });
    }
}