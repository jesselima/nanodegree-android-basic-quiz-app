package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
    }

    public void sendQuizByEmail(View view){

        Bundle userData = getIntent().getExtras();
            if (userData == null) {
                return;
            }

        String name = userData.getString("name");
        String email = userData.getString("email");
        String age = userData.getString("age");

        /* Testing */
        Log.v("sendQuizByEmail()", "Name: " + name);
        Log.v("sendQuizByEmail()", "Email: " + email);
        Log.v("sendQuizByEmail()", "Age: " + age);

        int numberOfHits = 4;
        int pointsEarned = 40;

        String a1 = getString(R.string.hit);
        String a2 = getString(R.string.missed);

        String userSummary = addDataToSummary(name, email, age, numberOfHits, pointsEarned, a1, a2);

        // sending summary to the email body
         Intent intent = new Intent(Intent.ACTION_SENDTO);
        // only email apps should handle this
        intent.setData(Uri.parse("mailto:" + email));
        // sending the subject os the email + client name
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.quiz_summary_email_subject) + name);
        // Add data to userSummary object.
        intent.putExtra(Intent.EXTRA_TEXT, userSummary);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
   }

    private String addDataToSummary(String name,
                                    String email,
                                    String age,
                                    int numberOfHits,
                                    int pointsEarned,
                                    String a1,
                                    String a2){

        String userSummaryData = getString(R.string.my_quiz_athletics_result);
        // User data
        userSummaryData += "\n\n " + getString(R.string.name) + name;
        userSummaryData += "\n " + getString(R.string.email) + email;
        userSummaryData += "\n " + getString(R.string.age) + age;
        // Points
        userSummaryData += "\n\n " + getString(R.string.number_of_hits) + numberOfHits;
        userSummaryData += "\n " + getString(R.string.points_earned) + pointsEarned;
        // Questions and answers
        userSummaryData += "\n\n " + getString(R.string.question_1_body) + a1;
        userSummaryData += "\n\n " + getString(R.string.question_2_body) + a2;

        return userSummaryData;
    }

}
