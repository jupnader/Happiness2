package com.mycompany.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import static com.mycompany.myfirstapp.R.*;

public class ToDoActivity extends AppCompatActivity{
    String str, str2, str3, str4, feeling;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.want_to_do);
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
    }

    public void goToVideo (View view) {

        /*if (feeling.equals("sad")) {*/

            goToUrl("https://www.youtube.com/watch?v=Ld1Z-MQqKi0");
    }

    public void goToMusic (View view) {
        goToUrl ( "https://www.youtube.com/watch?v=1iKL9_SrHr0");
    }

    public void goToLandscape (View view) {
        goToUrl ( "https://www.youtube.com/watch?v=UxIXH2LzihE");
    }

    public void goToGame (View view) {
        goToUrl ( "https://play.google.com/store/apps/details?id=com.otherworld.Sisters/");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}