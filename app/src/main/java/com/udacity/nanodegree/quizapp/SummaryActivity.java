package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    String correctAnswer1 = "4 events";
    String correctAnswer2 = "Javier Sotomayor";
    String correctAnswer3 = "IAAF";
    String correctAnswer4 = "Dick Fosbury";
    String correctAnswer5 = "Carl Lewis";
    String correctAnswer6 = "4 events";


    int pointsPerHit = 60;
    int pointsEarned = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        // Gran data from QuestionActivity by Intent
        Bundle userData = getIntent().getExtras();

        String name = userData.getString("name");
        String email = userData.getString("email");
        int age = userData.getInt("age");
        boolean sendMeACopy = userData.getBoolean("sendMeACopy");
        boolean sendMeFuture = userData.getBoolean("sendMeFuture");
        String isAthleteActive = userData.getString("isAthleteActive");
        String userAnswer1 = userData.getString("userAnswer1");
        String userAnswer2 = userData.getString("userAnswer2");
        String userAnswer3 = userData.getString("userAnswer3");
        String userAnswer4 = userData.getString("userAnswer4");
        String userAnswer5 = userData.getString("userAnswer5");
        String userAnswer6 = userData.getString("userAnswer6");
        int numberOfHits = userData.getInt("numberOfHits");
        //displayNumberOfHits(numberOfHits);
        int pointsEarned = userData.getInt("pointsEarned");
        //displayPointsEarned(pointsEarned);

        calculateAnswers(numberOfHits,
                            pointsEarned,
                            correctAnswer1,
                            correctAnswer2,
                            correctAnswer3,
                            correctAnswer4,
                            correctAnswer5,
                            correctAnswer6,
                            userAnswer1,
                            userAnswer2,
                            userAnswer3,
                            userAnswer4,
                            userAnswer5,
                            userAnswer6);


        // Text for hit or missed questions
//        String a1 = getString(R.string.hit);
//        String a2 = getString(R.string.missed);
//
        Log.v("SummaryActivity", "Name: " + name);
        Log.v("SummaryActivity", "Email: " + email);
        Log.v("SummaryActivity", "Age: " + age);
        Log.v("SummaryActivity", "sendMeACopy: " + sendMeACopy);
        Log.v("SummaryActivity", "sendMeFuture: " + sendMeFuture);
        Log.v("SummaryActivity", "isAthleteActive: " + isAthleteActive);
        Log.v("SummaryActivity", "Answer Question 1: " + userAnswer1);
        Log.v("SummaryActivity", "Answer Question 2: " + userAnswer2);
        Log.v("SummaryActivity", "Answer Question 3: " + userAnswer3);
        Log.v("SummaryActivity", "Answer Question 4: " + userAnswer4);
        Log.v("SummaryActivity", "Answer Question 5: " + userAnswer5);
        Log.v("SummaryActivity", "Answer Question 6: " + userAnswer6);
        Log.v("SummaryActivity", "numberOfHits: " + numberOfHits);
        Log.v("SummaryActivity", "pointsEarned: " + pointsEarned);
//        Log.v("SummaryActivity", "Hit message: " + a1);
//        Log.v("SummaryActivity", "Missed message: " + a2);

        // updateSummaryDashboard();
    }


//    private void displayNumberOfHits(int numberOfHits){
//        TextView hitsTextView = findViewById(R.id.number_of_hit_questions);
//        hitsTextView.setText(String.valueOf(numberOfHits));
//    }
//    private void displayPointsEarned(int pointsEarned){
//        TextView pointsTextView = findViewById(R.id.points_earned);
//        pointsTextView.setText(String.valueOf(pointsEarned));
//    }

    public void calculateAnswers(int numberOfHits,
                                    int pointsEarned,
                                    String correctAnswer1,
                                    String correctAnswer2,
                                    String correctAnswer3,
                                    String correctAnswer4,
                                    String correctAnswer5,
                                    String correctAnswer6,
                                    String userAnswer1,
                                    String userAnswer2,
                                    String userAnswer3,
                                    String userAnswer4,
                                    String userAnswer5,
                                    String userAnswer6){


        if(userAnswer1.equals(correctAnswer1)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;
        }
        if(userAnswer2.equals(correctAnswer2)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;
        }
        if(userAnswer3.equals(correctAnswer3)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;
        }
        if(userAnswer4.equals(correctAnswer4)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;
        }
        if(userAnswer5.equals(correctAnswer5)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;
        }
        if(userAnswer6.equals(correctAnswer6)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;
        }

        TextView pointsTextView = findViewById(R.id.points_earned);
        pointsTextView.setText(String.valueOf(pointsEarned));

        TextView hitsTextView = findViewById(R.id.number_of_hit_questions);
        hitsTextView.setText(String.valueOf(numberOfHits));


    }



//    public void sendQuizByEmail(View view){
//
//        String userSummary = addDataToSummary(name, email, age, numberOfHits, pointsEarned, a1, a2, userAnswer1, userAnswer2, userAnswer3, userAnswer4, userAnswer5, userAnswer6, sendMeACopy, sendMeFuture, isAthleteActive);
//
//        // sending summary to the email body
//         Intent intent = new Intent(Intent.ACTION_SENDTO);
//        // only email apps should handle this
//        intent.setData(Uri.parse("mailto:" + email));
//        // sending the subject os the email + client name
//        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.quiz_summary_email_subject) + name);
//        // Add data to userSummary object.
//        intent.putExtra(Intent.EXTRA_TEXT, userSummary);
//
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//   }
//
//    private String addDataToSummary(String name,
//                                    String email,
//                                    int age,
//                                    int numberOfHits,
//                                    int pointsEarned,
//                                    String a1,
//                                    String a2,
//                                    String userAnswer1,
//                                    String userAnswer2,
//                                    String userAnswer3,
//                                    String userAnswer4,
//                                    String userAnswer5,
//                                    String userAnswer6,
//                                    boolean sendMeACopy,
//                                    boolean sendMeFuture,
//                                    String isAthleteActive){
//
//        String userSummaryData = getString(R.string.my_quiz_athletics_result);
//        // User data
//        userSummaryData += "\n\n " + getString(R.string.name) + name;
//        userSummaryData += "\n " + getString(R.string.email) + email;
//        userSummaryData += "\n " + getString(R.string.age) + age;
//        // Points
//        userSummaryData += "\n\n " + getString(R.string.number_of_hits) + numberOfHits;
//        userSummaryData += "\n " + getString(R.string.points_earned) + pointsEarned;
//
//        // Questions and answers
//        userSummaryData += "\n\n " + getString(R.string.question_1_body);
//        userSummaryData += "\n " + userAnswer1;
//        userSummaryData += "\n\n " + getString(R.string.question_2_body);
//        userSummaryData += "\n " + userAnswer2;
//        userSummaryData += "\n\n " + getString(R.string.question_3_body);
//        userSummaryData += "\n " + userAnswer3;
//        userSummaryData += "\n\n " + getString(R.string.question_4_body);
//        userSummaryData += "\n " + userAnswer4;
//        userSummaryData += "\n\n " + getString(R.string.question_5_body);
//        userSummaryData += "\n " + userAnswer5;
//        userSummaryData += "\n\n " + getString(R.string.question_6_body);
//        userSummaryData += "\n " + userAnswer6;
//        //if (sendMeACopy)
//        //userSummaryData += "\n\n " + getString(R.string.question_6_body);
//        userSummaryData += "\n\n " + a1;
//        userSummaryData += "\n\n " + a2;
//        userSummaryData += "\n\n " + sendMeACopy;
//        userSummaryData += "\n\n " + sendMeFuture;
//        userSummaryData += "\n\n " + isAthleteActive;
//
//        return userSummaryData;
//    }

}
