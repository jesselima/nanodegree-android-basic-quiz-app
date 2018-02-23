package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    //View isActive;

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

        // Send me a copy
        CheckBox sendMeACopyCheckbox = findViewById(R.id.checkbox_send_me_copy);
            boolean sendMeACopy = sendMeACopyCheckbox.isChecked();

        // Send me more quiz in the future
        CheckBox sendMeFutureQuizCheckbox = findViewById(R.id.checkbox_send_me_future);
            boolean sendMeFuture = sendMeFutureQuizCheckbox.isChecked();

        // Grab user answer from question 3
        RadioGroup radioGroupAthleteActive = findViewById(R.id.radio_group_active_athlete);
        String isAthleteActive = ((RadioButton) findViewById(radioGroupAthleteActive.getCheckedRadioButtonId())).getText().toString();

        // Call the onRadioButtonClicked method and check is YES or NO was selected.
        //onRadioButtonClicked(view);

        EditText editTextAge = findViewById(R.id.age);
            int age = Integer.parseInt(editTextAge.getText().toString());

        Intent intent = new Intent(this, QuestionsActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("age", age);
            intent.putExtra("sendMeACopy", sendMeACopy);
            intent.putExtra("sendMeFuture", sendMeFuture);
            intent.putExtra("isAthleteActive", isAthleteActive);

        // Testing
        Log.v("WelcomeActivity", "Name: " + name);
        Log.v("WelcomeActivity", "Email: " + email);
        Log.v("WelcomeActivity", "Age: " + age);
        Log.v("WelcomeActivity", "sendMeACopy: " + sendMeACopy);
        Log.v("WelcomeActivity", "sendMeFuture: " + sendMeFuture);
        Log.v("WelcomeActivity", "isAthleteActive: " + isAthleteActive);
        //Log.v("WelcomeActivity", "isActive: " + isActive);

        startActivity(intent);
    }

}
