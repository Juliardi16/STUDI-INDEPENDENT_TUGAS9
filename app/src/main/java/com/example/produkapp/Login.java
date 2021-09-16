package com.example.produkapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    TextInputLayout user,pass;
    Button btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        user = findViewById(R.id.userName);
        pass = findViewById(R.id.password);
        btn =findViewById(R.id.btnLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginn();
            }
        });
    }

    private void loginn() {
        String username = String.valueOf(user.getEditText().getText());
        String password =  String.valueOf(pass.getEditText().getText());
        if (password.isEmpty() || username.isEmpty()) {
            Toast.makeText(this, "Username dan password harus diisi", Toast.LENGTH_SHORT).show();
        } else  if (username.equals("juli") && password.equals("juli")){
            startActivity(new Intent(Login.this,MainActivity.class));
            finish();
        } else {
            Toast.makeText(this, "password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
