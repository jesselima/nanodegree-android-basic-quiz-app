package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class QuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void viewSummary(View view){

         Bundle userData = getIntent().getExtras();
        if (userData == null) {
            return;
        }
        String name = userData.getString("name");
        String email = userData.getString("email");
        String age = userData.getString("age");

        Log.v("QuestionsActivity", "Name: " + name);
        Log.v("QuestionsActivity", "Email: " + email);
        Log.v("QuestionsActivity", "Age: " + age);

        Intent intent = new Intent(this, SummaryActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("age", age);

        // Testing...
        Log.v("viewSummary()", "Name: " + name);
        Log.v("viewSummary()", "Email: " + email);
        Log.v("viewSummary()", "Age: " + age);

        startActivity(intent);
    }
}
