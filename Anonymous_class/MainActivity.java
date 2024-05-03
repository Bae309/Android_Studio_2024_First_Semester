package com.example.anonymous_class;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView clothingImageView;
    private Button[] colorButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clothingImageView = findViewById(R.id.clothingImageView);
        colorButtons = new Button[]{
                findViewById(R.id.colorbutton1),
                findViewById(R.id.colorbutton2),
                findViewById(R.id.colorbutton3),
                findViewById(R.id.colorbutton4)
        };

        for (int i = 0; i < colorButtons.length; i++) {
            final int colorIndex = i;
            colorButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int color = getColorForIndex(colorIndex);
                    changeClothingColor(color);
                }
            });
        }
    }

    private int getColorForIndex(int index) {
        switch (index) {
            case 0:
                return Color.YELLOW;
            case 1:
                return Color.parseColor("#00BCD4"); 
            case 2:
                return Color.parseColor("#D19090");
            case 3:
                return Color.parseColor("#8BC34A");
            default:
                return Color.WHITE; // Default White
        }
    }

    private void changeClothingColor(int color) {
        clothingImageView.setBackgroundColor(color);
    }
}
