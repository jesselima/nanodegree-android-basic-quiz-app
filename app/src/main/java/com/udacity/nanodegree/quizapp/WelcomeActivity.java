package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void startQuiz(View view){

        // check if the user name is empty. If not store it in name variable
        EditText editTextName = findViewById(R.id.name);
        String name = editTextName.getText().toString();
            if(name.isEmpty()){
                Toast.makeText(this, R.string.you_must_type_your_name, Toast.LENGTH_SHORT).show();
                return;
            }

        // check if the user email is empty. If not store it in email variable
        EditText editTextEmail = findViewById(R.id.email);
        String email = editTextEmail.getText().toString();
            if(email.isEmpty()){
                Toast.makeText(this, R.string.you_must_type_your_email, Toast.LENGTH_SHORT).show();
                return;
            }

        // Get check box status for "send me a copy" selection
        CheckBox sendMeACopyCheckbox = findViewById(R.id.checkbox_send_me_copy);
            boolean sendMeACopy = sendMeACopyCheckbox.isChecked();

        // // Get check box status for "send me more quiz in the future" selection
        CheckBox sendMeFutureQuizCheckbox = findViewById(R.id.checkbox_send_me_future);
            boolean sendMeFuture = sendMeFutureQuizCheckbox.isChecked();

        // Grab user answer from question 3
        RadioGroup radioGroupAthleteActive = findViewById(R.id.radio_group_active_athlete);
        String isAthleteActive = "";
            if (radioGroupAthleteActive.getCheckedRadioButtonId() == -1){
                Toast.makeText(this, R.string.select_if_you_are_athlete, Toast.LENGTH_SHORT).show();
                return;
            }else {
                isAthleteActive = ((RadioButton) findViewById(radioGroupAthleteActive.getCheckedRadioButtonId())).getText().toString();
            }

        EditText editTextAge = findViewById(R.id.age);
        String myAge = editTextAge.getText().toString();
            if (myAge.isEmpty()) {
                Toast.makeText(this, R.string.age_can_not_be_empty, Toast.LENGTH_SHORT).show();
                return;
            }
            int age = Integer.parseInt(myAge);
            if (age < 5 ) {
                Toast.makeText(this, R.string.age_must_be_greater_than, Toast.LENGTH_SHORT).show();
                return;
            }

        // Grab form data and send to QuestionsActivity using a intent object
        Intent intent = new Intent(this, QuestionsActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("age", age);
            intent.putExtra("sendMeACopy", sendMeACopy);
            intent.putExtra("sendMeFuture", sendMeFuture);
            intent.putExtra("isAthleteActive", isAthleteActive);
        startActivity(intent);
    }

}
