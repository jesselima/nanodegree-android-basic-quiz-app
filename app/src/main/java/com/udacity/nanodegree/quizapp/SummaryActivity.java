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

        String name = "Jesse";
        String someText = "Some Text Body...";
        String email = "mail@jesselima.com.br";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + email)); // only email apps should handle this

        // sending the subject os the email + client name
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.quiz_summary_email_subject) + name);
        // sending summary to the email body
        intent.putExtra(Intent.EXTRA_TEXT, someText);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

}
