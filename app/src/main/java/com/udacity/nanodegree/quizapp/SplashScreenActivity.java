package com.udacity.nanodegree.quizapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                goToWelcomeActivity();
            }
        }, 3000);
    }

    private void goToWelcomeActivity(){
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
        finish();
    }

}
