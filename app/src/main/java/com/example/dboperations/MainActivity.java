package com.example.dboperations;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class MainActivity extends AppCompatActivity {

    Button insertButton, displayButton;
    DBManager dbManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertButton = findViewById(R.id.insert_button);
        displayButton = findViewById(R.id.display_button);

    }

    public void startInsertActivity(View view) {
        Intent intent = new Intent(MainActivity.this, InsertOperation.class);
        startActivity(intent);
    }

    public void startDisplayActivity(View view) {
        Intent intent = new Intent(MainActivity.this, DisplayOperation.class);
        startActivity(intent);
    }
}
