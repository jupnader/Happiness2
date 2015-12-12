package com.mycompany.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String str, str2, str3, str4, feeling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.FeelText);
        TextView pontos = (TextView) findViewById(R.id.pointScore);
        TextView sensate = (TextView) findViewById(R.id.textsensation);
        Intent intent = getIntent();
        str = intent.getStringExtra("happy");
        str2 = intent.getStringExtra("angry");
        str3 = intent.getStringExtra("sleepy");
        str4 = intent.getStringExtra("sad");

        if (str == null)
            if (str2 == null)
                if (str3 == null)
                    feeling = str4;
                else
                    feeling = str3;
            else
                feeling = str2;
        else
            feeling = str;

        System.out.println(feeling);

        textView1.setText("Você está se sentindo "+feeling+", então: ");

        if(feeling.equals("sad")) {
            sensate.setText("Jogue na Mega!");
            pontos.setText("Score = " + MyActivity.score);
        }

        else if (feeling.equals("happy")) {
            sensate.setText("You've achieved HAPPINESS!\nYou've earned 150 points!\nJust Keep Smiling");
            MyActivity.score += 150;
            pontos.setText("Score = "+ MyActivity.score);

        }
        else if (feeling.equals("sleepy")){
            sensate.setText("veja este video");
            pontos.setText("Score = " + MyActivity.score);
        }
        else{
            sensate.setText("sorria e ria sempre!");
            pontos.setText("Score = " + MyActivity.score);
    }



    }




}
