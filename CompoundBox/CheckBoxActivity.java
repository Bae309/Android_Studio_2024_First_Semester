package com.example.compoundbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imgMeat = (ImageView) findViewById(R.id.imgmeat);
        ImageView imgCheese = (ImageView) findViewById(R.id.imgcheese);

        CheckBox chkMeat = (CheckBox) findViewById(R.id.chkMeat);
        CheckBox chkCheese = (CheckBox) findViewById(R.id.chkCheese);

        chkMeat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    imgMeat.setImageResource(R.drawable.sand1);
                    imgMeat.setVisibility(View.VISIBLE);
                }
                else {
                    imgMeat.setImageResource(0);
                    imgMeat.setVisibility(View.INVISIBLE);
                }
            }
        });

        chkCheese.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    imgCheese.setImageResource(R.drawable.sand2);
                    imgCheese.setVisibility(View.VISIBLE);
                }
                else {
                    imgCheese.setImageResource(0);
                    imgCheese.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}