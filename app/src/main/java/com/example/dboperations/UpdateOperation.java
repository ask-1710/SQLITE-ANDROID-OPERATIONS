package com.example.dboperations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateOperation extends AppCompatActivity {
    DBManager dbManager;
    EditText id_field, name_field, address_field, phone_field, email_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_operation);


        dbManager = new DBManager(this);
        dbManager.open();

        id_field = findViewById(R.id.update_id);
        name_field = findViewById(R.id.update_name);
        address_field = findViewById(R.id.udpate_address);
        phone_field = findViewById(R.id.update_phone);
        email_field = findViewById(R.id.update_email);
    }


    public void updateDetails(View view) {
        long _id = Long.parseLong(id_field.getText().toString());
        String name_input = name_field.getText().toString();
        String address_input = address_field.getText().toString();
        String phone_input = phone_field.getText().toString();
        String email_input = email_field.getText().toString();

        dbManager.update(_id, name_input, address_input, phone_input, email_input);
        dbManager.close();

        Intent intent = new Intent(UpdateOperation.this, MainActivity.class);
        startActivity(intent);
    }

}