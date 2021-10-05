package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {
ImageView backbutton4;
Button applyButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        backbutton4 = findViewById(R.id.BbackBtn4);
        backbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        applyButton4 = findViewById(R.id.applybtn4);
        applyButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FinalActivity.class);
                startActivity(intent);
            }
        });


    }
}
