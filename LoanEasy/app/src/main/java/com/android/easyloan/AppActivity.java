package com.android.easyloan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
//import android.widget.ImageView;
//import com.google.firebase.auth.FirebaseAuth;

public class AppActivity extends AppCompatActivity {
CardView busi;
CardView gloan;
CardView property;
CardView homel;
CardView perl;
CardView gaddi;
CardView bult;
CardView educ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        busi = findViewById(R.id.busi);
        busi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, PActivity.class);
                startActivity(intent);

            }
        });

        gloan = findViewById(R.id.gloan);
        gloan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, GActivity.class);
                startActivity(intent);

            }
        });

        property = findViewById(R.id.property);
        property.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, PropActivity.class);
                startActivity(intent);
            }
        });
        homel = findViewById(R.id.homel);
        homel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        perl = findViewById(R.id.perl);
        perl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, PerActivity.class);
                startActivity(intent);
            }
        });

        gaddi = findViewById(R.id.gaddi);
        gaddi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, CarActivity.class);
                startActivity(intent);
            }
        });
        bult = findViewById(R.id.bult);
        bult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        educ = findViewById(R.id.educ);
        educ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AppActivity.this, EduActivity.class);
                startActivity(intent);
            }
        });
        
    }


    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
        finish();
    }
}
