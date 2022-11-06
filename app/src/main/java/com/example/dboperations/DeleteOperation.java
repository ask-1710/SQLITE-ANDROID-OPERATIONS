package com.example.dboperations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DeleteOperation extends AppCompatActivity {
    protected EditText id_field;
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_operation);

        dbManager = new DBManager(this);
        dbManager.open();

        id_field = findViewById(R.id.delete_id);
    }

    public void deleteDetails(View view) {
        long _id = Long.parseLong(id_field.getText().toString());
        dbManager.delete(_id);
        dbManager.close();

        Intent intent = new Intent(DeleteOperation.this, MainActivity.class);
        startActivity(intent);
    }
}