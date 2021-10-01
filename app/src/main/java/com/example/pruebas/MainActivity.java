package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button explosion = findViewById(R.id.button);
        explosion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = android.widget.Toast.makeText(getApplicationContext(), "BUUUUUUUUM", Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}