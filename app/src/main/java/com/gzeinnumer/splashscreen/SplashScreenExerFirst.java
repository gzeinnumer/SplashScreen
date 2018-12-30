package com.gzeinnumer.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenExerFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exer_splashscreen_second);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(getApplicationContext(), SplashScreenExerSecond.class);
                    startActivity(intent);
                    SplashScreenExerFirst.this.finish();
                }
            }
        };
        timer.start();
    }
}
