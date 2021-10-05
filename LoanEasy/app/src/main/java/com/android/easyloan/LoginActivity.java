package com.android.easyloan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
//import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
ImageView backButton;
FirebaseAuth fAuth;
    EditText mEmail, mPassword;
    Button mloginbtn;
   // ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        backButton = findViewById(R.id.backBtn);
                backButton .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                mEmail = findViewById(R.id.editText);
                mPassword = findViewById(R.id.editText2);
                fAuth = FirebaseAuth.getInstance();
                mloginbtn = findViewById(R.id.Lgnbutton);
       // progressBar = findViewById(R.id.progressBar2);

                mloginbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String email = mEmail.getText().toString().trim();
                        String password = mPassword.getText().toString().trim();


                        if(TextUtils.isEmpty(email)) {
                            mEmail.setError("Email is Required.");
                            return;
                        }
                        if(TextUtils.isEmpty(password)) {
                            mPassword.setError("Password is Required.");
                            return;
                        }
                        if(password.length() < 6) {
                            mPassword.setError("Password Must be >=6 Characters");
                            return;
                        }


                        fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(LoginActivity.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(getApplicationContext(), AppActivity.class));
                                }else {
                                    Toast.makeText(LoginActivity.this, "Error !" + Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();

                                }


                            }
                        });
                    }
                });
    }

}
