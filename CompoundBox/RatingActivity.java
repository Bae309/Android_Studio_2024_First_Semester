package com.example.compoundbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rating_bar);

        Button btnSubmit = (Button) findViewById(R.id.button);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        TextView txtResult = (TextView) findViewById(R.id.textView4);

        txtResult.setText("");
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float score = ratingBar.getRating();
                txtResult.setText("Score : " + score);
            }
        });
    }
}