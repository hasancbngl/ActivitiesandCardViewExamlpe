 package com.cobanogluhasan.multipleactivitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

 public class MainActivity extends AppCompatActivity {

    public void toSecond(View view) {

        Intent intent = new Intent(getApplicationContext(), secondActivity.class);
        intent.putExtra("namee","hasann");

//  implementation 'com.intuit.sdp:sdp-android:1.0.6' bu cihazlar için
        startActivity(intent);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
