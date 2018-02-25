package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    String correctAnswer1 = getString(R.string.question_1_answer_2);
    String correctAnswer2 = getString(R.string.question_2_answer_4);
    String correctAnswer3 = getString(R.string.question_3_answer_1);
    String correctAnswer4 = getString(R.string.question_4_answer_2);
    String correctAnswer5 = getString(R.string.question_5_answer_3);
    String correctAnswer6 = getString(R.string.question_6_answer_2);

    int pointsPerHit = 60;
    // TODO: numberOfHits and pointsEarned must be sent do email body. Trying to figure out. :D
    int numberOfHits = 99; // not used
    int pointsEarned = 99; // not used

    String textHit = getString(R.string.hit);
    String feelingNotSeen = getString(R.string.feeling_not_seen);
    String feelingBad = getString(R.string.feeling_bad);
    String feelingCool = getString(R.string.feeling_cool);
    String feelingCrazy = getString(R.string.feeling_crazy);
    String feelingAwesome = getString(R.string.feeling_awesome);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        // Grab data from QuestionActivity by Intent
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
        int pointsEarned = userData.getInt("pointsEarned");

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
    }

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

        TextView userAnswerTextView1 = findViewById(R.id.user_answer_1);
        userAnswerTextView1.setText(userAnswer1);
        TextView correctAnswerTextView1 = findViewById(R.id.correct_answer_1);
        correctAnswerTextView1.setText(correctAnswer1);

        TextView userAnswerTextView2 = findViewById(R.id.user_answer_2);
        userAnswerTextView2.setText(userAnswer2);
        TextView correctAnswerTextView2 = findViewById(R.id.correct_answer_2);
        correctAnswerTextView2.setText(correctAnswer2);

        TextView userAnswerTextView3 = findViewById(R.id.user_answer_3);
        userAnswerTextView3.setText(userAnswer3);
        TextView correctAnswerTextView3 = findViewById(R.id.correct_answer_3);
        correctAnswerTextView3.setText(correctAnswer3);

        TextView userAnswerTextView4 = findViewById(R.id.user_answer_4);
        userAnswerTextView4.setText(userAnswer4);
        TextView correctAnswerTextView4 = findViewById(R.id.correct_answer_4);
        correctAnswerTextView4.setText(correctAnswer4);

        TextView userAnswerTextView5 = findViewById(R.id.user_answer_5);
        userAnswerTextView5.setText(userAnswer5);
        TextView correctAnswerTextView5 = findViewById(R.id.correct_answer_5);
        correctAnswerTextView5.setText(correctAnswer5);

        TextView userAnswerTextView6 = findViewById(R.id.user_answer_6);
        userAnswerTextView6.setText(userAnswer6);
        TextView correctAnswerTextView6 = findViewById(R.id.correct_answer_6);
        correctAnswerTextView6.setText(correctAnswer6);

        if(userAnswer1.equals(correctAnswer1)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;

            ImageView img1 = findViewById(R.id.img_answer_1);
            img1.setImageResource(R.drawable.question_hit);

            TextView textAnswerTextView1 = findViewById(R.id.summary_bottom_layout_text_1);
            textAnswerTextView1.setText(textHit);
            textAnswerTextView1.setTextColor(ContextCompat.getColor(this, R.color.correctAnswer));
        }
        if(userAnswer2.equals(correctAnswer2)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;

            ImageView img2 = findViewById(R.id.img_answer_2);
            img2.setImageResource(R.drawable.question_hit);

            TextView textAnswerTextView2 = findViewById(R.id.summary_bottom_layout_text_2);
            textAnswerTextView2.setText(textHit);
            textAnswerTextView2.setTextColor(ContextCompat.getColor(this, R.color.correctAnswer));
        }
        if(userAnswer3.equals(correctAnswer3)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;

            ImageView img3 = findViewById(R.id.img_answer_3);
            img3.setImageResource(R.drawable.question_hit);

            TextView textAnswerTextView3 = findViewById(R.id.summary_bottom_layout_text_3);
            textAnswerTextView3.setText(textHit);
            textAnswerTextView3.setTextColor(ContextCompat.getColor(this, R.color.correctAnswer));
        }
        if(userAnswer4.equals(correctAnswer4)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;

            ImageView img4 = findViewById(R.id.img_answer_4);
            img4.setImageResource(R.drawable.question_hit);

            TextView textAnswerTextView4 = findViewById(R.id.summary_bottom_layout_text_4);
            textAnswerTextView4.setText(textHit);
            textAnswerTextView4.setTextColor(ContextCompat.getColor(this, R.color.correctAnswer));
        }
        if(userAnswer5.equals(correctAnswer5)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;

            ImageView img5 = findViewById(R.id.img_answer_5);
            img5.setImageResource(R.drawable.question_hit);

            TextView textAnswerTextView5 = findViewById(R.id.summary_bottom_layout_text_5);
            textAnswerTextView5.setText(textHit);
            textAnswerTextView5.setTextColor(ContextCompat.getColor(this, R.color.correctAnswer));
        }
        if(userAnswer6.equals(correctAnswer6)){
            numberOfHits++;
            pointsEarned = numberOfHits * pointsPerHit;

            TextView textAnswerTextView6 = findViewById(R.id.summary_bottom_layout_text_6);
            textAnswerTextView6.setText(textHit);
            textAnswerTextView6.setTextColor(ContextCompat.getColor(this, R.color.correctAnswer));

            ImageView img6 = findViewById(R.id.img_answer_6);
            img6.setImageResource(R.drawable.question_hit);
        }

        // Testing number of hits and points earned.
        Log.v("SummaryActivity", "numberOfHits: " + numberOfHits);// ok!
        Log.v("SummaryActivity", "numberOfHits: " + pointsEarned); // ok!

        TextView pointsTextView = findViewById(R.id.points_earned);
        pointsTextView.setText(String.valueOf(pointsEarned));

        TextView hitsTextView = findViewById(R.id.number_of_hit_questions);
        hitsTextView.setText(String.valueOf(numberOfHits));

        if(numberOfHits < 1) {
            ImageView imgFeeling = findViewById(R.id.img_feeling);
            imgFeeling.setImageResource(R.drawable.feeling_not_seen);

            TextView textFelling = findViewById(R.id.text_feeling);
            textFelling.setText(feelingNotSeen);

        }else if(numberOfHits <= 2){
            ImageView imgFeeling = findViewById(R.id.img_feeling);
            imgFeeling.setImageResource(R.drawable.feeling_crazy);

            TextView textFelling = findViewById(R.id.text_feeling);
            textFelling.setText(feelingCrazy);

        }else if(numberOfHits <=4){
            ImageView imgFeeling = findViewById(R.id.img_feeling);
            imgFeeling.setImageResource(R.drawable.feeling_bad);

            TextView textFelling = findViewById(R.id.text_feeling);
            textFelling.setText(feelingBad);

        }else if(numberOfHits == 5){
            ImageView imgFeeling = findViewById(R.id.img_feeling);
            imgFeeling.setImageResource(R.drawable.feeling_cool);

            TextView textFelling = findViewById(R.id.text_feeling);
            textFelling.setText(feelingCool);
        }else{
            ImageView imgFeeling = findViewById(R.id.img_feeling);
            imgFeeling.setImageResource(R.drawable.feeling_perfect);

            TextView textFelling = findViewById(R.id.text_feeling);
            textFelling.setText(feelingAwesome);
        }
    }

    public void sendQuizByEmail(View view){

        String sendMeACopy;
        String sendMeFuture;

        Bundle userData = getIntent().getExtras();
        String name = userData.getString("name");
        String email = userData.getString("email");
        int age = userData.getInt("age");
        boolean receiveCopy = userData.getBoolean("sendMeACopy");
            if(receiveCopy){
                    sendMeACopy = "YES";
                }else{
                    sendMeACopy = "NO";
            }
        boolean sendFuture = userData.getBoolean("sendMeFuture");
            if(sendFuture){
                sendMeFuture = "YES";
            }else{
                sendMeFuture = "NO";
            }
        String isAthleteActive = userData.getString("isAthleteActive");
        String userAnswer1 = userData.getString("userAnswer1");
        String userAnswer2 = userData.getString("userAnswer2");
        String userAnswer3 = userData.getString("userAnswer3");
        String userAnswer4 = userData.getString("userAnswer4");
        String userAnswer5 = userData.getString("userAnswer5");
        String userAnswer6 = userData.getString("userAnswer6");

        String userSummary = addDataToEmailSummary(name,
                                            email,
                                            age,
                                            numberOfHits,
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
                                            userAnswer6,
                                            sendMeACopy,
                                            sendMeFuture,
                                            isAthleteActive);

        // sending summary to the email body
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        // only email apps should handle this
        intent.setData(Uri.parse("mailto:" + email));
        // sending the subject os the email + name
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.quiz_summary_email_subject) + name);
        // Add data to userSummary object.
        intent.putExtra(Intent.EXTRA_TEXT, userSummary);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    private String addDataToEmailSummary(String name,
                                    String email,
                                    int age,
                                    int hits,
                                    int pointsEarned,
                                    String userAnswer1,
                                    String userAnswer2,
                                    String userAnswer3,
                                    String userAnswer4,
                                    String userAnswer5,
                                    String userAnswer6,
                                    String correctAnswer1,
                                    String correctAnswer2,
                                    String correctAnswer3,
                                    String correctAnswer4,
                                    String correctAnswer5,
                                    String correctAnswer6,
                                    String sendMeACopy,
                                    String sendMeFuture,
                                    String isAthleteActive){

        String userSummaryData = getString(R.string.my_quiz_athletics_result);

        // User data
        userSummaryData += "\n\n " + getString(R.string.name) + name;
        userSummaryData += "\n " + getString(R.string.email) + email;
        userSummaryData += "\n " + getString(R.string.age) + age;

        // Points
        userSummaryData += "\n\n " + getString(R.string.number_of_hits) + hits;
        userSummaryData += "\n " + getString(R.string.points_earned) + pointsEarned;

        // Questions and answers
        userSummaryData += "\n\n " + getString(R.string.question_1_body);
        userSummaryData += "\n " + getString(R.string.your_answer);
        userSummaryData += "\n " + userAnswer1;
        userSummaryData += "\n " + getString(R.string.correct_answer);
        userSummaryData += "\n " + correctAnswer1;

        userSummaryData += "\n\n " + getString(R.string.question_2_body);
        userSummaryData += "\n " + getString(R.string.your_answer);
        userSummaryData += "\n " + userAnswer2;
        userSummaryData += "\n " + getString(R.string.correct_answer);
        userSummaryData += "\n " + correctAnswer2;

        userSummaryData += "\n\n " + getString(R.string.question_3_body);
        userSummaryData += "\n " + getString(R.string.your_answer);
        userSummaryData += "\n " + userAnswer3;
        userSummaryData += "\n " + getString(R.string.correct_answer);
        userSummaryData += "\n " + correctAnswer3;

        userSummaryData += "\n\n " + getString(R.string.question_4_body);
        userSummaryData += "\n " + getString(R.string.your_answer);
        userSummaryData += "\n " + userAnswer4;
        userSummaryData += "\n " + getString(R.string.correct_answer);
        userSummaryData += "\n " + correctAnswer4;

        userSummaryData += "\n\n " + getString(R.string.question_5_body);
        userSummaryData += "\n " + getString(R.string.your_answer);
        userSummaryData += "\n " + userAnswer5;
        userSummaryData += "\n " + getString(R.string.correct_answer);
        userSummaryData += "\n " + correctAnswer5;

        userSummaryData += "\n\n " + getString(R.string.question_6_body);
        userSummaryData += "\n " + getString(R.string.your_answer);
        userSummaryData += "\n " + userAnswer6;
        userSummaryData += "\n " + getString(R.string.correct_answer);
        userSummaryData += "\n " + correctAnswer6;

        userSummaryData += "\n\n " + getString(R.string.i_wish_a_copy);
        userSummaryData += "\n " + sendMeACopy;

        userSummaryData += "\n\n " + getString(R.string.wish_more_future_quiz);
        userSummaryData += "\n " + sendMeFuture;

        userSummaryData += "\n\n " + getString(R.string.am_i_active_athlete);
        userSummaryData += "\n " + isAthleteActive;

        return userSummaryData;
    }

}


