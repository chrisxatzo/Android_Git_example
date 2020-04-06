package com.example.androidgit_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVw_kostas = findViewById(R.id.txtVw_kostas);
        txtVw_kostas.setText("Kostas");

        TextView txtVw_chris = findViewById(R.id.txtVw_chris);
        txtVw_chris.setText("Chris");
    }
}
