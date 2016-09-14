package com.example.nico.nicotaxi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends MainActivity{

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAct = (Button) findViewById(R.id.btnAct);
        getScreen();
        btnAct.setOnClickListener(this);
    }*/

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAct2:
                Intent intent = new Intent(this, ActivityThree.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
