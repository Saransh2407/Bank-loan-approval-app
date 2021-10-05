package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PropActivity extends AppCompatActivity {
ImageView backbutton4;
Button applyButton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prop);
        backbutton4 = findViewById(R.id.BbackBtn3);
        backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PropActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        applyButton3 = findViewById(R.id.applybtn3);
        applyButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PropActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });

    }
}
