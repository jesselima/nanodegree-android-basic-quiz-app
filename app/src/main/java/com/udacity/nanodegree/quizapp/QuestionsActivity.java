package com.udacity.nanodegree.quizapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuestionsActivity extends AppCompatActivity {

    View card1,card2, card3, card4, card5, card6;
    Button btn1, btn2, btn3, btn4, btn5, btnViewQuestionSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        card1 = findViewById(R.id.card_question_1);
        card2 = findViewById(R.id.card_question_2);
        card3 = findViewById(R.id.card_question_3);
        card4 = findViewById(R.id.card_question_4);
        card5 = findViewById(R.id.card_question_5);
        card6 = findViewById(R.id.card_question_6);

        btn1 = findViewById(R.id.hideCard1show2);
        btn2 = findViewById(R.id.hideCard2show3);
        btn3 = findViewById(R.id.hideCard3show4);
        btn4 = findViewById(R.id.hideCard4show5);
        btn5 = findViewById(R.id.hideCard5show6);

        btnViewQuestionSummary = findViewById(R.id.btn_view_summary);

    }

    public void viewSummary(View view){

        // Grab user answer from question 1
        RadioGroup question1 = findViewById(R.id.radio_group_question_1);
        String userAnswer1 = ((RadioButton) findViewById(question1.getCheckedRadioButtonId())).getText().toString();

        // Grab user answer from question 2
        RadioGroup question2 = findViewById(R.id.radio_group_question_2);
        String userAnswer2 = ((RadioButton) findViewById(question2.getCheckedRadioButtonId())).getText().toString();

        // Grab user answer from question 3
        RadioGroup question3 = findViewById(R.id.radio_group_question_3);
        String userAnswer3 = ((RadioButton) findViewById(question3.getCheckedRadioButtonId())).getText().toString();

        // Grab user answer from question 4
        RadioGroup question4 = findViewById(R.id.radio_group_question_4);
        String userAnswer4 = ((RadioButton) findViewById(question4.getCheckedRadioButtonId())).getText().toString();

        // Grab user answer from question 5
        RadioGroup question5 = findViewById(R.id.radio_group_question_5);
        String userAnswer5 = ((RadioButton) findViewById(question5.getCheckedRadioButtonId())).getText().toString();

        // Grab user answer from question 6
        RadioGroup question6 = findViewById(R.id.radio_group_question_6);
        String userAnswer6 = ((RadioButton) findViewById(question6.getCheckedRadioButtonId())).getText().toString();


        // Grab user form data from WelcomeActivity
        Bundle userData = getIntent().getExtras();
        if (userData == null) {
            return;
        }
        String name = userData.getString("name");
        String email = userData.getString("email");
        int age = userData.getInt("age");
        boolean sendMeACopy = userData.getBoolean("sendMeACopy");
        boolean sendMeFuture = userData.getBoolean("sendMeFuture");
        String isAthleteActive = userData.getString("isAthleteActive");

        //int points = userData.getInt("points");

        // Testing user form that comes from WelcomeActivity...
        Log.v("Questions-Activity", "Name: " + name);
        Log.v("QuestionsActivity", "Email: " + email);
        Log.v("QuestionsActivity", "Age: " + age);
        Log.v("QuestionsActivity", "sendMeACopy: " + sendMeACopy);
        Log.v("QuestionsActivity", "sendMeFuture: " + sendMeFuture);
        Log.v("QuestionsActivity", "isAthleteActive: " + isAthleteActive);
        Log.v("QuestionsActivity", "Answer Question 1: " + userAnswer1);
        Log.v("QuestionsActivity", "Answer Question 2: " + userAnswer2);
        Log.v("QuestionsActivity", "Answer Question 3: " + userAnswer3);
        Log.v("QuestionsActivity", "Answer Question 4: " + userAnswer4);
        Log.v("QuestionsActivity", "Answer Question 5: " + userAnswer5);
        Log.v("QuestionsActivity", "Answer Question 6: " + userAnswer6);
//        Log.v("QuestionsActivity", "numberOfHits: " + numberOfHits);
//        Log.v("QuestionsActivity", "pointsEarned: " + pointsEarned);


        Intent intent = new Intent(this, SummaryActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("age", age);
            intent.putExtra("sendMeACopy", sendMeACopy);
            intent.putExtra("sendMeFuture", sendMeFuture);
            intent.putExtra("isAthleteActive", isAthleteActive);

            intent.putExtra("userAnswer1", userAnswer1);
            intent.putExtra("userAnswer2", userAnswer2);
            intent.putExtra("userAnswer3", userAnswer3);
            intent.putExtra("userAnswer4", userAnswer4);
            intent.putExtra("userAnswer5", userAnswer5);
            intent.putExtra("userAnswer6", userAnswer6);

        startActivity(intent);
    }

    // ######## HIDE AND SHOW CARDS METHODS #########

    public void hideCard1show2(View view){
        //card1.setVisibility(View.GONE);
        card1.postDelayed(new Runnable() {
            public void run() {
                card1.setVisibility(View.GONE);
            }
        }, 500);
        card2.postDelayed(new Runnable() {
            public void run() {
                card2.setVisibility(View.VISIBLE);
            }
        }, 500);
        //card2.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.GONE);
        btn2.setVisibility(View.VISIBLE);
    }

    public void hideCard2show3(View view){
        card2.postDelayed(new Runnable() {
            public void run() {
                card2.setVisibility(View.GONE);
            }
        }, 500);
        card3.postDelayed(new Runnable() {
            public void run() {
                card3.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn2.setVisibility(View.GONE);
        btn3.setVisibility(View.VISIBLE);
    }

    public void hideCard3show4(View view){
        card3.postDelayed(new Runnable() {
            public void run() {
                card3.setVisibility(View.GONE);
            }
        }, 500);
        card4.postDelayed(new Runnable() {
            public void run() {
                card4.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn3.setVisibility(View.GONE);
        btn4.setVisibility(View.VISIBLE);
    }

    public void hideCard4show5(View view){
        card4.postDelayed(new Runnable() {
            public void run() {
                card4.setVisibility(View.GONE);
            }
        }, 500);
        card5.postDelayed(new Runnable() {
            public void run() {
                card5.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn4.setVisibility(View.GONE);
        btn5.setVisibility(View.VISIBLE);
    }

    public void hideCard5show6(View view){
        card5.postDelayed(new Runnable() {
            public void run() {
                card5.setVisibility(View.GONE);
            }
        }, 500);
        card6.postDelayed(new Runnable() {
            public void run() {
                card6.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn5.setVisibility(View.GONE);
        btnViewQuestionSummary.setVisibility(View.VISIBLE);
    }

}
