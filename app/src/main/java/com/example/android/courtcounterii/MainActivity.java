package com.example.android.courtcounterii;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int killCountA = 0;
    int killCountB = 0;
    int towerCountA = 0;
    int towerCountB = 0;
    int teamLvlA = 0;
    int teamLvlB = 0;
    int xpTeamA = 0;
    int xpTeamB = 0;


    /**
     * These methods are called/activated for Team A when one of the point buttons are clicked.
     */
    public void plus1KillA(View v) {
        killCountA = killCountA + 1;
        displayForTeamA(killCountA);

    }


    public void plus1TowerA(View v) {
        towerCountA = towerCountA + 1;
        if (towerCountA >= 7) {
            displayTeamATowers(7);
        } else displayTeamATowers(towerCountA);
    }

    /**
     * These methods are called/activated to calculate Team A's xp and team level.
     * Only team level is displayed.
     *
     */


    /**
     * These methods are called/activated for Team B when one of the point buttons are clicked.
     */

    public void plus1KillB(View v) {
        killCountB = killCountB + 1;
        displayForTeamB(killCountB);
    }

    public void plus1TowerB(View v) {
        towerCountB = towerCountB + 1;
        displayForTeamB(towerCountB);
    }

    /**
     * Reset button
     * @param v
     */

    public void resetGame(View v) {
        killCountA = 0;
        killCountB = 0;
        teamLvlA = 0;
        teamLvlB = 0;
        xpTeamA = 0;
        xpTeamB = 0;
        displayForTeamA(killCountA);
        displayForTeamB(killCountB);
        displayTeamALvl(teamLvlA);
        displayTeamBLvl(teamLvlB);
        displayTeamATowers (towerCountA);
        displayTeamBTowers (towerCountB);
    }

    /**
     * This method displays the given score, team level, and towers, respectively, on the screen for Team A.
     * @param scorea
     */

    public void displayForTeamA(int scorea) {
        TextView scoreaView = (TextView) findViewById(R.id.killCountA);
        scoreaView.setText(String.valueOf(scorea));
    }

    public void displayTeamALvl(int scorea) {
        TextView scoreaView = (TextView) findViewById(R.id.teamLvlA);
        scoreaView.setText(String.valueOf(scorea));
    }

    public void displayTeamATowers(int scorea) {
        TextView scoreaView = (TextView) findViewById(R.id.towerCountA);
        scoreaView.setText(String.valueOf(scorea));
    }

    /**
     * This method displays the given score, team level, and towers, respectively, on the screen for Team B.
     * @param scoreb
     */

    public void displayForTeamB(int scoreb) {
        TextView scorebView = (TextView) findViewById(R.id.killCountB);
        scorebView.setText(String.valueOf(scoreb));
    }

    public void displayTeamBLvl(int scoreb) {
        TextView scorebView = (TextView) findViewById(R.id.teamLvlB);
        scorebView.setText(String.valueOf(scoreb));
    }

    public void displayTeamBTowers(int scoreb) {
        TextView scorebView = (TextView) findViewById(R.id.towerCountB);
        scorebView.setText(String.valueOf(scoreb));
    }
}

