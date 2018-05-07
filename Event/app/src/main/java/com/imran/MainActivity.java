package com.imran;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne  = (Button) findViewById(R.id.firstEventBtn);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Msg: You Click "+btnOne.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        btnTwo  = (Button) findViewById(R.id.secondEventBtn);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Msg: You Click "+btnTwo.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }





}
