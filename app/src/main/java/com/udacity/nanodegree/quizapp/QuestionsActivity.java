package com.udacity.nanodegree.quizapp;

// TODO: Fix activity refresh when orientation changes to landscape
// TODO: UPDATE VALUE OF PROGRESS BAR WHEN CLICK NEXT BUTTON

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class QuestionsActivity extends AppCompatActivity {

    View card1,card2, card3, card4, card5, card6, cardComment, cardFinish;
    Button btn1hideCard1show2, btn2hideCard2show3, btn3hideCard3show4, btn4hideCard4show5, btn5hideCard5show6, btn6hideCard6showComment, btn7hideCardCommentShowFinish, btnViewQuestionSummary;

    private ProgressBar progressBar;
    private int progressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        progressBar = findViewById(R.id.progressBar);

        // Reference to cards IDs
        card1 = findViewById(R.id.card_question_1);
        card2 = findViewById(R.id.card_question_2);
        card3 = findViewById(R.id.card_question_3);
        card4 = findViewById(R.id.card_question_4);
        card5 = findViewById(R.id.card_question_5);
        card6 = findViewById(R.id.card_question_6);
        cardComment = findViewById(R.id.card_comment);
        cardFinish = findViewById(R.id.card_finish);
        // Reference to buttons IDs
        btn1hideCard1show2 = findViewById(R.id.btn_hide_card_1_show_2);
        btn2hideCard2show3 = findViewById(R.id.btn_hide_card_2_show_3);
        btn3hideCard3show4 = findViewById(R.id.btn_hide_card_3_show_4);
        btn4hideCard4show5 = findViewById(R.id.btn_hide_card_4_show_5);
        btn5hideCard5show6 = findViewById(R.id.btn_hide_card_5_show_6);
        btn6hideCard6showComment = findViewById(R.id.hide_card_6_show_comment);
        btn7hideCardCommentShowFinish = findViewById(R.id.btn_hide_comment_show_finish);
        btnViewQuestionSummary = findViewById(R.id.btn_view_summary);
    }

    // ######## HIDE AND SHOW CARDS METHODS #########

    public void btn1hideCard1show2(View view){
        card1.postDelayed(new Runnable() {
            public void run() {
                card1.setVisibility(View.GONE);
            }
        }, 300);
        btn1hideCard1show2.postDelayed(new Runnable() {
            public void run() {
                btn1hideCard1show2.setVisibility(View.GONE);
            }
        }, 300);


        card2.postDelayed(new Runnable() {
            public void run() {
                card2.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn2hideCard2show3.postDelayed(new Runnable() {
            public void run() {
                btn2hideCard2show3.setVisibility(View.VISIBLE);
            }
        }, 800);

        progressStatus += 10;
        progressBar.setProgress(progressStatus);
    }

    public void btn2hideCard2show3(View view){
        card2.postDelayed(new Runnable() {
            public void run() {
                card2.setVisibility(View.GONE);
            }
        }, 300);
        btn2hideCard2show3.postDelayed(new Runnable() {
            public void run() {
                btn2hideCard2show3.setVisibility(View.GONE);
            }
        }, 300);

        card3.postDelayed(new Runnable() {
            public void run() {
                card3.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn3hideCard3show4.postDelayed(new Runnable() {
            public void run() {
                btn3hideCard3show4.setVisibility(View.VISIBLE);
            }
        }, 800);

        progressStatus += 10;
        progressBar.setProgress(progressStatus);
    }

    public void btn3hideCard3show4(View view){
        card3.postDelayed(new Runnable() {
            public void run() {
                card3.setVisibility(View.GONE);
            }
        }, 300);
        btn3hideCard3show4.postDelayed(new Runnable() {
            public void run() {
                btn3hideCard3show4.setVisibility(View.GONE);
            }
        }, 300);

        card4.postDelayed(new Runnable() {
            public void run() {
                card4.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn4hideCard4show5.postDelayed(new Runnable() {
            public void run() {
                btn4hideCard4show5.setVisibility(View.VISIBLE);
            }
        }, 800);

        progressStatus += 10;
        progressBar.setProgress(progressStatus);
    }

    public void btn4hideCard4show5(View view){
        card4.postDelayed(new Runnable() {
            public void run() {
                card4.setVisibility(View.GONE);
            }
        }, 500);
        btn4hideCard4show5.postDelayed(new Runnable() {
            public void run() {
                btn4hideCard4show5.setVisibility(View.GONE);
            }
        }, 300);
        card5.postDelayed(new Runnable() {
            public void run() {
                card5.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn5hideCard5show6.postDelayed(new Runnable() {
            public void run() {
                btn5hideCard5show6.setVisibility(View.VISIBLE);
            }
        }, 800);

        progressStatus += 10;
        progressBar.setProgress(progressStatus);
    }

    public void btn5hideCard5show6(View view){
        card5.postDelayed(new Runnable() {
            public void run() {
                card5.setVisibility(View.GONE);
            }
        }, 300);
        btn5hideCard5show6.postDelayed(new Runnable() {
            public void run() {
                btn5hideCard5show6.setVisibility(View.GONE);
            }
        }, 300);

        card6.postDelayed(new Runnable() {
            public void run() {
                card6.setVisibility(View.VISIBLE);
            }
        }, 500);
        btn6hideCard6showComment.postDelayed(new Runnable() {
            public void run() {
                btn6hideCard6showComment.setVisibility(View.VISIBLE);
            }
        }, 800);

        progressStatus += 10;
        progressBar.setProgress(progressStatus);
    }

    public void btn6hideCard6showComment(View view){
        card6.postDelayed(new Runnable() {
            public void run() {
                card6.setVisibility(View.GONE);
            }
        }, 300);
        btn6hideCard6showComment.postDelayed(new Runnable() {
            public void run() {
                btn6hideCard6showComment.setVisibility(View.GONE);
            }
        }, 300);

        cardComment.postDelayed(new Runnable() {
            public void run() {
                cardComment.setVisibility(View.VISIBLE);
            }
        }, 500);

        btn7hideCardCommentShowFinish.postDelayed(new Runnable() {
            public void run() {
                btn7hideCardCommentShowFinish.setVisibility(View.VISIBLE);
            }
        }, 800);

        progressStatus += 10;
        progressBar.setProgress(progressStatus);
    }

    public void btn7hideCardCommentShowFinish(View view){
        cardComment.postDelayed(new Runnable() {
            public void run() {
                cardComment.setVisibility(View.GONE);
            }
        }, 300);

        btn7hideCardCommentShowFinish.postDelayed(new Runnable() {
            public void run() {
                btn7hideCardCommentShowFinish.setVisibility(View.GONE);
            }
        }, 300);

        cardFinish.postDelayed(new Runnable() {
            public void run() {
                cardFinish.setVisibility(View.VISIBLE);
            }
        }, 500);

        btnViewQuestionSummary.postDelayed(new Runnable() {
            public void run() {
                btnViewQuestionSummary.setVisibility(View.VISIBLE);
            }
        }, 800);


        progressStatus += 10;
        progressBar.setProgress(progressStatus);
    }

    public void ViewSummary(View view){

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
        String userAnswer6 = ((RadioButton) findViewById(question6.getCheckedRadioButtonId())).getText().toString(); // Grab user answer from question

        // Grab user answer from comment feedback input
        EditText editTextComment = findViewById(R.id.comment);
        String commentText = editTextComment.getText().toString();


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

        // Creates a Intent Object put all answers and start SummaryActivity
        Intent intent = new Intent(this, SummaryActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("email", email);
        intent.putExtra("age", age);
        intent.putExtra("sendMeACopy", sendMeACopy);
        intent.putExtra("sendMeFuture", sendMeFuture);
        intent.putExtra("isAthleteActive", isAthleteActive);
        // Quiz answers:
        intent.putExtra("userAnswer1", userAnswer1);
        intent.putExtra("userAnswer2", userAnswer2);
        intent.putExtra("userAnswer3", userAnswer3);
        intent.putExtra("userAnswer4", userAnswer4);
        intent.putExtra("userAnswer5", userAnswer5);
        intent.putExtra("userAnswer6", userAnswer6);
        intent.putExtra("commentText", commentText);

        // Testing on Logcat
        Log.v("QuestionsActivity", "name: " + name);
        Log.v("QuestionsActivity", "email: " + email);
        Log.v("QuestionsActivity", "age: " + age);
        Log.v("QuestionsActivity", "sendMeACopy: " + sendMeACopy);
        Log.v("QuestionsActivity", "sendMeFuture: " + sendMeFuture);
        Log.v("QuestionsActivity", "isAthleteActive: " + isAthleteActive);

        Log.v("QuestionsActivity", "userAnswer1: " + userAnswer1);
        Log.v("QuestionsActivity", "userAnswer2: " + userAnswer2);
        Log.v("QuestionsActivity", "userAnswer3: " + userAnswer3);
        Log.v("QuestionsActivity", "userAnswer4: " + userAnswer4);
        Log.v("QuestionsActivity", "userAnswer5: " + userAnswer5);
        Log.v("QuestionsActivity", "userAnswer6: " + userAnswer6);
        Log.v("QuestionsActivity", "commentText: " + commentText);

        startActivity(intent);
    }
}
