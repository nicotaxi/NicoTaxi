package com.example.nico.nicotaxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nico on 07/09/2016.
 */
public class FifthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void onClick(View view) {
        Intent intent = new Intent(FifthActivity.this, FifthActivity.class);
        startActivity(intent);
    }
}