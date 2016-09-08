package com.example.nico.nicotaxi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityThree extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Button btnAct = (Button) findViewById(R.id.btnAct);
        btnAct.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAct:
                Intent intent = new Intent(this, ActivityFour.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
