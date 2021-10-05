package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity {
ImageView backbutton10;
Button btn2;
RadioGroup RadioGroup;
RadioButton selectedRbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        backbutton10 = findViewById(R.id.BbackBtn6);
        backbutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FinalActivity.this, AppActivity.class);
                startActivity(intent);

            }
        });
        RadioGroup = findViewById(R.id.radioGroup);
        btn2 = findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedRbtn = RadioGroup.findViewById(RadioGroup.getCheckedRadioButtonId());
                if (selectedRbtn != null) {
                    Toast.makeText(FinalActivity.this, "Applied Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
