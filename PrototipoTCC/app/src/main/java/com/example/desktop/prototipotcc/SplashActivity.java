package com.example.desktop.prototipotcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Intent intent = new Intent(this, LoginActivity.class);
        Thread thread = new Thread(){
          public void run(){
              try{
                  sleep(2000);
              }
              catch(InterruptedException e){
                  e.printStackTrace();
              }
              finally {
                  startActivity(intent);
                  finish();
              }
          }
        }; thread.start();
    }
}
