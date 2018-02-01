package com.example.meesh.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edt = (EditText)findViewById(R.id.et1);
        Button loginbtn = (Button) findViewById(R.id.btn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,second.class);
                String uname = edt.getText().toString();
                i.putExtra("my msg", uname);  //data store kar raha
                startActivity(i);

            }
        });
    }
}
