package com.example.android.baseballgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int baseTeamA = 0;
    int baseTeamB = 0;

    public void homeRunTeamA(View view) {
        scoreTeamA++;
        if(baseTeamA > 0){
            scoreTeamA++;
            baseTeamA = 0;
            String message = "Base : Home";
            displayBaseTeamA(message);
        }
        displayForTeamA(scoreTeamA);
    }

    public void whichBaseTeamA(View view) {
        if (baseTeamA < 3) {
            Toast t4 = Toast.makeText(this, "SAFE!", Toast.LENGTH_SHORT);
            t4.show();
            baseTeamA++;
            String message = "Base : " + baseTeamA;
            displayBaseTeamA(message);
        } else {
            Toast b = Toast.makeText(this, "SAFE!", Toast.LENGTH_SHORT);
            b.show();
            baseTeamA = 0;
            String message = "Base : Home";
            scoreTeamA++;
            displayForTeamA(scoreTeamA);
            displayBaseTeamA(message);
        }
    }

    public void outTeamA(View view) {
        Toast a = Toast.makeText(this, "OUT!!", Toast.LENGTH_SHORT);
        a.show();
        baseTeamA = 0;
        String message = "Base : Home";
        displayBaseTeamA(message);
    }


    public void homeRunTeamB(View view) {
        scoreTeamB++;
        if(baseTeamB > 0){
            scoreTeamB++;
            baseTeamB = 0;
            String message = "Base : Home";
            displayBaseTeamB(message);
        }
        displayForTeamB(scoreTeamB);
    }

    public void whichBaseTeamB(View view) {
        if (baseTeamB < 3) {
            Toast t4 = Toast.makeText(this, "SAFE!", Toast.LENGTH_SHORT);
            t4.show();
            baseTeamB++;
            String message = "Base : " + baseTeamB;
            displayBaseTeamB(message);
        } else {
            Toast b = Toast.makeText(this, "SAFE!", Toast.LENGTH_SHORT);
            b.show();
            baseTeamB = 0;
            String message = "Base : Home";
            scoreTeamB++;
            displayForTeamB(scoreTeamB);
            displayBaseTeamB(message);
        }
    }

    public void outTeamB(View view) {
        Toast a = Toast.makeText(this, "OUT!!", Toast.LENGTH_SHORT);
        a.show();
        baseTeamB = 0;
        String message = "Base : Home";
        displayBaseTeamB(message);
    }

    public void matchResult(View view) {

        CharSequence c1 = "Red Sox Won by " + (scoreTeamA - scoreTeamB) + " Runs";
        CharSequence c2 = "Yankees Won by " + (scoreTeamB - scoreTeamA) + " Runs";

        Toast t1 = Toast.makeText(this, c1, Toast.LENGTH_LONG);
        Toast t2 = Toast.makeText(this, c2, Toast.LENGTH_LONG);
        Toast t3 = Toast.makeText(this, "DRAW", Toast.LENGTH_LONG);
        if (scoreTeamA > scoreTeamB) {
            t1.show();
        } else if (scoreTeamB > scoreTeamA) {
            t2.show();
        } else {
            t3.show();
        }
        scoreTeamA = 0;
        scoreTeamB = 0;
        baseTeamA = 0;
        baseTeamB = 0;
        String message = "Base : Home";
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayBaseTeamA(message);
        displayBaseTeamB(message);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBaseTeamA(String message) {
        TextView baseTextView = findViewById(R.id.team_a_base);
        baseTextView.setText(message);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBaseTeamB(String message) {
        TextView baseTextView = findViewById(R.id.team_b_base);
        baseTextView.setText(message);
    }
}