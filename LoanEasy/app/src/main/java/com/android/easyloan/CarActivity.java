package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CarActivity extends AppCompatActivity {
ImageView backbutton6;
Button applyButton6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        backbutton6 = findViewById(R.id.BbackBtn6);
        backbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(CarActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        applyButton6 = findViewById(R.id.applybtn6);
        applyButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });
    }
}
