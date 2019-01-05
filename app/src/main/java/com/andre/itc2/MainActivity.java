package com.andre.itc2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addHome, addAway, minHome, minAway, reset;
    TextView homeScore, awayScore;
    Integer home, away;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addHome = findViewById(R.id.btn_add_home);
        addAway = findViewById(R.id.btn_add_away);
        minHome = findViewById(R.id.btn_min_home);
        minAway = findViewById(R.id.btn_min_away);
        reset = findViewById(R.id.btn_reset);

        homeScore = findViewById(R.id.tv_home);
        awayScore = findViewById(R.id.tv_away);

        home = 0;
        away = 0;

        addHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home++;
                homeScore.setText(home.toString());
            }
        });
        addAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                away++;
                awayScore.setText(away.toString());
            }
        });
        minHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (home != 0)
                    home--;

                homeScore.setText(home.toString());
            }
        });
        minAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (away != 0)
                    away--;

                awayScore.setText(away.toString());
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home = 0;
                away = 0;
                homeScore.setText(home.toString());
                awayScore.setText(away.toString());
            }
        });
    }
}
