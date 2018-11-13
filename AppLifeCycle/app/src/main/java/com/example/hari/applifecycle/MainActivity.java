package com.example.hari.applifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private Toast myToast = null;
    private static final String TAG = "Hari";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG , "onCreate");
//        myToast = Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT);

//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onCreate" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onCreate" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onStart" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onStart" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onResume" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onResume" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onPause" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onPause" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onStop" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onStop" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onRestart" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onRestart" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onDestroy" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onDestroy" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onSaveInstanceState" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onSaveInstanceState" , Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
//        Toast.makeText(getApplicationContext() , null , Toast.LENGTH_SHORT).show();
//        myToast.cancel();
//        myToast = Toast.makeText(getApplicationContext() , "onRestoreInstanceState" , Toast.LENGTH_SHORT);
//        myToast.show();
        Toast.makeText(getApplicationContext() , "onRestoreInstanceState" , Toast.LENGTH_SHORT).show();
    }



}

