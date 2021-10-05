package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PActivity extends AppCompatActivity {
    ImageView backButton2;
    Button applyButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p);
        backButton2 = findViewById(R.id.BbackBtn);
        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        applyButton1 = findViewById(R.id.applybtn1);
        applyButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });
    }
}
