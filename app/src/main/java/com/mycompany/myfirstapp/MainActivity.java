package com.mycompany.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*TextView textView1 = (TextView) findViewById(R.id.FeelText);
        TextView sensate = (TextView) findViewById(R.id.textsensation);
        Intent intent = getIntent();
        str = intent.getStringExtra("location");
        textView1.setText("Você está se sentindo "+str+", então: ");

        if(str.equals("sad"))
            sensate.setText("jogue na Mega!");
        else if (str.equals("happy"))
            sensate.setText("doe dinheiro");
        else
            sensate.setText("sorria e ria sempre!");*/



    }




}
