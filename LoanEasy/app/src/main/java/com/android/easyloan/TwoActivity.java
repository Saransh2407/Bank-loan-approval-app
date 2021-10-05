package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TwoActivity extends AppCompatActivity {
ImageView backbutton7;
Button applyButton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        backbutton7 = findViewById(R.id.BbackBtn7);
        backbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(TwoActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });

        applyButton7 = findViewById(R.id.applybtn7);
        applyButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TwoActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });


    }
}
