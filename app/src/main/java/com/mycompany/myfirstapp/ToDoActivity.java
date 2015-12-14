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

import java.sql.SQLOutput;

import static com.mycompany.myfirstapp.R.*;

public class ToDoActivity extends AppCompatActivity{
    String str, str2, str3, str4;

    static String feeling;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.want_to_do);

    }

    public void goToVideo (View view) {

        if (MainActivity.feeling.equals("sad"))
            goToUrl("https://www.youtube.com/watch?v=bDoEYULinMU");
        else if (MainActivity.feeling.equals("happy"))
            goToUrl("https://www.youtube.com/watch?v=Ld1Z-MQqKi0");
        else if (MainActivity.feeling.equals("angry"))
            goToUrl("https://www.youtube.com/watch?v=JCQAPC07GaQ");
        else
            goToUrl("https://www.youtube.com/watch?v=OQL1gochKLk");


    }

    public void goToMusic (View view) {
        if (MainActivity.feeling.equals("sad"))
            goToUrl("https://www.youtube.com/watch?v=Ld1Z-MQqKi0");
        else if (MainActivity.feeling.equals("happy"))
            goToUrl("https://www.youtube.com/watch?v=Ld1Z-MQqKi0");
        else if (MainActivity.feeling.equals("angry"))
            goToUrl("https://www.youtube.com/watch?v=YZwLOomhcsI");
        else
            goToUrl ( "https://www.youtube.com/watch?v=1iKL9_SrHr0");
    }

    public void goToLandscape (View view) {
        if (MainActivity.feeling.equals("sad"))
            goToUrl("https://www.youtube.com/watch?v=yBjsAXDsBB4&list=PLaI__EI4O-YRXqKmyuoV-QQsM7QhyTaSs");
        else if (MainActivity.feeling.equals("happy"))
            goToUrl("https://www.youtube.com/watch?v=F_3XPE0_oe8");
        else if (MainActivity.feeling.equals("angry"))
            goToUrl("https://www.youtube.com/watch?v=yBjsAXDsBB4&list=PLaI__EI4O-YRXqKmyuoV-QQsM7QhyTaSs");
        else
            goToUrl ("https://www.youtube.com/watch?v=UxIXH2LzihE");
    }

    public void goToGame (View view) {
        if (MainActivity.feeling.equals("sad"))
            goToUrl("https://www.youtube.com/watch?v=teejWI9D9HA&index=6&list=PLaI__EI4O-YRXqKmyuoV-QQsM7QhyTaSs");
        else if (MainActivity.feeling.equals("happy"))
            goToUrl("https://www.youtube.com/watch?v=pfz4lVZfcBc");
        else if (MainActivity.feeling.equals("angry"))
            goToUrl("https://www.youtube.com/watch?v=4Zooh30RXGM");
        else
            goToUrl ( "https://play.google.com/store/apps/details?id=com.otherworld.Sisters/");

    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}