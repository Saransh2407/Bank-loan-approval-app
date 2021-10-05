package com.android.easyloan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.Registrar;

public class SignIn extends AppCompatActivity {
ImageView backButton;
EditText mEmail, mPassword;
Button mRegisterBtn2;
TextView mLoginBtn;
FirebaseAuth fAuth;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        backButton = findViewById(R.id.backBtn2);
        backButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mEmail = findViewById(R.id.email);
        mPassword = findViewById(R.id.password);

        mRegisterBtn2 = findViewById(R.id.RegisterButton2);
        mLoginBtn = findViewById(R.id.Lgnbutton);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar1);



if(fAuth.getCurrentUser() != null){
    startActivity(new Intent(getApplicationContext(),AppActivity.class));
    finish();
}
        mRegisterBtn2.setOnClickListener(new View.OnClickListener(){
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
                 progressBar.setVisibility(View.VISIBLE);

                 fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if(task.isSuccessful()) {
                             Toast.makeText(SignIn.this, "User Created.", Toast.LENGTH_SHORT).show();
                             startActivity(new Intent(getApplicationContext(), MainActivity.class));
                         }else {
                             Toast.makeText(SignIn.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                             progressBar.setVisibility(View.GONE);
                         }

                         }
                 });


            }
            });
    }
}
