package com.example.nour.pointscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //Displays score of team A
    public void displyScoreTeamA (int score){
        TextView scoreTextView = findViewById(R.id.score_team_A);
        scoreTextView.setText(String.valueOf(score));

    }

    //Increase score of team A by 3 points
    public void addThreePointsForTeamA(View view) {
            scoreTeamA = scoreTeamA + 3;
        displyScoreTeamA(scoreTeamA);
    }

    //Increase score of team A by 2 points
    public void addTwoPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displyScoreTeamA(scoreTeamA);
    }

    //Increase score of team A by 1 point
    public void addOnePointForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displyScoreTeamA(scoreTeamA);
    }

    //Displays score of team B
    public void displayScoreTeamB (int score){
        TextView scoreTextView = findViewById(R.id.score_team_B);
        scoreTextView.setText(String.valueOf(score));
    }

    //Increase score of team B by 3 points
    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB(scoreTeamB);
    }
    //Increase score of team B by 2 points

    public void addTwoPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
    }

    //Increase score of team B by 1 point
    public void addOnePointForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }
    //Reset scores for both team A and team B to zero
    public void resetScoresToZero(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displyScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

}

