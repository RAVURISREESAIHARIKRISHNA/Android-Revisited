package com.example.hari.textviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    Declaring a TextView Object
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Accessing TextView by ID
//        R is a Tool Chain created by Android Studio
        myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("From MainActivity.java");
    }
}
