package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void viewSummary(View view){
        // TODO: Create Intent to send answers to
        Intent intent = new Intent(this, SummaryActivity.class);
        startActivity(intent);
    }
}
