package com.imran;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdWayActivity extends Activity {
    Button btnOne, btnTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_way);

        btnOne = (Button)findViewById(R.id.firstEventBtn);
        btnTwo = (Button)findViewById(R.id.secondEventBtn);

        btnOne.setOnClickListener(new ActionHandler());
        btnTwo.setOnClickListener(new ActionHandler());
    }


    private class ActionHandler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Button btn = (Button)view;
            String btnText = btn.getText().toString();
            Toast.makeText(getApplicationContext(), "Msg: You Click (Third Way) "+btnText , Toast.LENGTH_SHORT).show();

        }
    }
}
