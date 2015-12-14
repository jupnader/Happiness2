package com.mycompany.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

import static com.mycompany.myfirstapp.R.*;

public class MainActivity extends AppCompatActivity {
    String str, str2, str3, str4, feeling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        final ImageButton sug = (ImageButton) findViewById(id.SuggestionButton);


        TextView textView1 = (TextView) findViewById(id.FeelText);
        TextView pontos = (TextView) findViewById(id.pointScore);
        TextView sensate = (TextView) findViewById(id.textsensation);
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

        textView1.setText("Você está se sentindo " + feeling + ", então: ");

        if (feeling.equals("sad")) {
            sensate.setText("Don't worry, things will be fine!");
            pontos.setText("Score = " + MyActivity.score);
            sug.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(), ToDoActivity.class);
                    i.putExtra("sad", sug.getContentDescription());
                    startActivity(i);

                }
            });
        }
            else if (feeling.equals("happy"))

            {
                sensate.setText("You've achieved HAPPINESS!\nEnjoy while you can!");
                MyActivity.score += 150;
                pontos.setText("Score = " + MyActivity.score);
                sug.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), ToDoActivity.class);
                        i.putExtra("happy", sug.getContentDescription());
                        startActivity(i);

                    }
                });

            } else if (feeling.equals("sleepy"))

            {
                sensate.setText("Try to exercise and listen a shaking soound!");
                pontos.setText("Score = " + MyActivity.score);
                sug.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), ToDoActivity.class);
                        i.putExtra("sleepy", sug.getContentDescription());
                        startActivity(i);

                    }
                });

            } else

            {
                sensate.setText("Mas não se irrite!");
                pontos.setText("Score = " + MyActivity.score);
                sug.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(), ToDoActivity.class);
                        i.putExtra("angry", sug.getContentDescription());
                        startActivity(i);

                    }
                });
            }



        }


    }

