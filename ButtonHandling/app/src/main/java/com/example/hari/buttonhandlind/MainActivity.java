package com.example.hari.buttonhandlind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * In an activity, you can get a reference to an inflated widget by calling the following Activity method:
         *  public View findViewById(int id)
         * This method accepts a resource ID of a widget and returns a View object.
         */
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);

        /**
         *  The
         * object that you create to respond to an event is called a listener. A listener is an object that implements
         * a listener interface for that event.
         * The Android SDK comes with listener interfaces for various events, so you do not have to write your
         * own. In this case, the event you want to listen for is a button “click,” so your listener will implement
         * the View.OnClickListener interface.
         */

        button1.setOnClickListener(
                /* Anonymous Inner Class */
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Toast.makeText( getApplicationContext() , "You Pressed Button 1" , Toast.LENGTH_SHORT).show();
                    }
                }
        );

        button2.setOnClickListener(
                /*Anonymous Inner Class*/
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Toast.makeText( getApplicationContext() , "You Pressed Button 2" , Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
