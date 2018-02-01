package com.example.meesh.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extra = getIntent().getExtras(); //wahan se jo put yahan par get
        if(extra != null){//check k null tou nai hai
            String uname = extra.getString("my msg");
            Toast.makeText(second.this, "Welcome  " +
                    "" + uname, Toast.LENGTH_LONG).show(); // jo wahan par username hai wo show
        }
    }
}
