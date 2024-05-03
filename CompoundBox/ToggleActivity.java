package com.example.compoundbox;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class ToggleActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);
    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            imageView.setImageResource(R.drawable.pic);
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setImageResource(0);
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}