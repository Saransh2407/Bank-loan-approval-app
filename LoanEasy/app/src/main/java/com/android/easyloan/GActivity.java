package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GActivity extends AppCompatActivity {
ImageView backbutton3;
Button applyButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g);

        backbutton3 = findViewById(R.id.BbackBtn2);
        backbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        applyButton2 = findViewById(R.id.applybtn2);
        applyButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });
    }
}
