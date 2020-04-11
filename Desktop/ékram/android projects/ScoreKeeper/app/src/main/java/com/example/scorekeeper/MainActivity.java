package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    int barcelonaScore = 0;
    int realMadridScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void display_score_barcelona(int barcelonaScore) {
        TextView barcelonaScoreView = (TextView) findViewById(R.id.bar);
        barcelonaScoreView.setText(String.valueOf(barcelonaScore));
    }
    public void add_Gol_barcelona(View v){
        barcelonaScore= barcelonaScore + 1;
        display_score_barcelona(barcelonaScore);
    }

    public void display_score_realMadrid(int realMadridScore) {
        TextView realMadridScoreView = (TextView) findViewById(R.id.rel);
        realMadridScoreView.setText(String.valueOf(realMadridScore));
    }
    public void add_Gol_realMadrid(View v){
        realMadridScore = realMadridScore + 1;
        display_score_realMadrid(realMadridScore);

    }
    public void reset(View v){
        barcelonaScore = 0;
        realMadridScore = 0;
        display_score_realMadrid(realMadridScore);
        display_score_barcelona(barcelonaScore);
    }
}

