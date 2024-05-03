package com.example.compoundbox;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class RadioActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        layout = (LinearLayout) findViewById(R.id.layout);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_red:
                if (checked)
                    layout.setBackgroundColor(Color.RED);
                break;

            case R.id.radio_blue:
                if (checked)
                    layout.setBackgroundColor(Color.BLUE);
                break;
        }
    }
}