package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PerActivity extends AppCompatActivity {
    ImageView backbutton5;
    Button applyButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per);

        backbutton5 = findViewById(R.id.BbackBtn5);
        backbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PerActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        applyButton5 = findViewById(R.id.applybtn5);
        applyButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });

    }
}
