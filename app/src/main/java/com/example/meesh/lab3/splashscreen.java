package com.example.meesh.lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent i= new Intent(splashscreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }


        },5*1000);

    }

}
