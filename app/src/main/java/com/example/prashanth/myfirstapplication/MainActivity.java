package com.example.prashanth.myfirstapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

import static android.R.attr.name;
import static android.R.id.message;

public class MainActivity extends AppCompatActivity {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView)findViewById(R.id.textView);
        final EditText e = (EditText) findViewById(R.id.editText);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date=new Date();
                Calendar cal=Calendar.getInstance();
                cal.setTime(date);
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                String name=e.getText().toString();

                if(hour>=6 && hour<12)
                    msg="Good Morning";
                if(hour>=12 && hour<17)
                    msg="Good Afternoon";
                if(hour >=17 && hour <21)
                    msg ="Good Evening";
                if(hour>=21 && hour<=23)
                    msg="Good Night";

                String message=msg+" "+name;
                t.setText(message);

            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }
}
