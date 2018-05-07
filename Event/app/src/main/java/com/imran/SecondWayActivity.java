package com.imran;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SecondWayActivity extends Activity implements OnClickListener{

    Button btnOne, btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_way);

        btnOne = (Button)findViewById(R.id.firstEventBtn);
        btnTwo = (Button)findViewById(R.id.secondEventBtn);

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button btn = (Button)v;
        String btnText = btn.getText().toString();
        Toast.makeText(getApplicationContext(), "Msg: You Click (Second Way) "+btnText , Toast.LENGTH_SHORT).show();
    }
}
