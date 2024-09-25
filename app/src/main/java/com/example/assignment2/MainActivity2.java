package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2;
    private RatingBar ratingBar;
    private SeekBar seekBar;
    private Switch switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        switchButton = findViewById(R.id.switch1);


        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(MainActivity2.this, "CheckBox is checked", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity2.this, "CheckBox is unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioButton1) {
                Toast.makeText(MainActivity2.this, "RadioButton 1 selected", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.radioButton2) {
                Toast.makeText(MainActivity2.this, "RadioButton 2 selected", Toast.LENGTH_SHORT).show();
            }
        });


        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            Toast.makeText(MainActivity2.this, "Rating: " + rating, Toast.LENGTH_SHORT).show();
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity2.this, "SeekBar Progress: " + progress, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        switchButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(MainActivity2.this, "Switch is ON", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity2.this, "Switch is OFF", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

