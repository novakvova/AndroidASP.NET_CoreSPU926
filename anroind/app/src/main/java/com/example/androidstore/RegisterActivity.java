package com.example.androidstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void OnClickButtonRegister(View view)
    {
        final TextInputEditText email = findViewById(R.id.textInputEmail);

        final TextInputLayout phoneLayout = findViewById(R.id.textFieldPhone);
        final TextInputEditText phone = findViewById(R.id.textInputPhone);
        if(phone.getText().toString().isEmpty())
        {
            phoneLayout.setError("Не вказали телефон");
        }
        else {
            phoneLayout.setError(null);
        }

        Log.d("btnRegInfo", email.getText().toString());
    }
}