package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void startQuiz(View view){

        EditText editTextName = findViewById(R.id.name);
            String name = editTextName.getText().toString();

        EditText editTextEmail = findViewById(R.id.email);
            String email = editTextEmail.getText().toString();

        EditText editTextAge = findViewById(R.id.age);
        String age = editTextAge.getText().toString();

        Intent intent = new Intent(this, QuestionsActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("age", age);

        // Testing
        Log.v("WelcomeActivity", "Name: " + name);
        Log.v("WelcomeActivity", "Email: " + email);
        Log.v("WelcomeActivity", "Age: " + age);

        startActivity(intent);
    }

}
