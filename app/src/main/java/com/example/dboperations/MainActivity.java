package com.example.dboperations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    DBManager dbManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startInsertActivity(View view) {
        Intent intent = new Intent(MainActivity.this, InsertOperation.class);
        startActivity(intent);
    }

    public void startDisplayActivity(View view) {
        Intent intent = new Intent(MainActivity.this, DisplayOperation.class);
        startActivity(intent);
    }

    public void startUpdateActivity(View view) {
        Intent intent = new Intent(MainActivity.this, UpdateOperation.class);
        startActivity(intent);
    }

    public void startDeleteActivity(View view) {
        Intent intent = new Intent(MainActivity.this, DeleteOperation.class);
        startActivity(intent);
    }
}
