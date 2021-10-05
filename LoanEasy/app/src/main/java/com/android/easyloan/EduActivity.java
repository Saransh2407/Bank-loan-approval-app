package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EduActivity extends AppCompatActivity {
ImageView backbutton8;
Button applyButton8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);

        backbutton8 = findViewById(R.id.BbackBtn8);
        backbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(EduActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        applyButton8 = findViewById(R.id.applybtn8);
        applyButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EduActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });

    }
}
