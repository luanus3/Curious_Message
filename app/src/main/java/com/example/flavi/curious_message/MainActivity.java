package com.example.flavi.curious_message;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                finish();
                Intent activity_menu = new Intent();
                activity_menu.setClass(MainActivity.this, menu.class);
                startActivity(activity_menu);
            }
    }, 6000);

        //public void startactivity_menu(View view) {
        //Intent activity_menu = new Intent(this, menu.class);
        //startActivity(activity_menu);
    }
}