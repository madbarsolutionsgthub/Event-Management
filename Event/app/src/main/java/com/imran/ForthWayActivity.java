package com.imran;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForthWayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth_way);
    }



    public void chooseAction(View view){
        Button btn = (Button)view;
        String btnText = btn.getText().toString();
        Toast.makeText(getApplicationContext(), "Msg: You Click (Forth Way) "+btnText , Toast.LENGTH_SHORT).show();

    }
}
