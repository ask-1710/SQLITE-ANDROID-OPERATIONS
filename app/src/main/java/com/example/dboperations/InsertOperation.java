package com.example.dboperations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InsertOperation extends AppCompatActivity {
    private DBManager dbManager;
    private EditText name_field, address_field, phone_field, email_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        setContentView(R.layout.activity_insert_operation);


        dbManager = new DBManager(this);
        dbManager.open();

        name_field = findViewById(R.id.name_field);
        address_field = findViewById(R.id.address_field);
        phone_field = findViewById(R.id.phone_field);
        email_field = findViewById(R.id.email_field);

    }

    public void insertDetails(View view) {
        String name_input = name_field.getText().toString();
        String address_input = address_field.getText().toString();
        String phone_input = phone_field.getText().toString();
        String email_input = email_field.getText().toString();

        dbManager.insert(name_input, address_input, phone_input, email_input);
        dbManager.close();

        Intent intent = new Intent(InsertOperation.this, MainActivity.class);
        startActivity(intent);
    }
}