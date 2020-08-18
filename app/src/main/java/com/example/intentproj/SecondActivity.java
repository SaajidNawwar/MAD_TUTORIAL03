package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity<message> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    Intent i = getIntent();
    String message = i.getStringExtra(FirstActivity.EXTRA_MESSAGE);

    TextView textView = findViewById(R.id.editTextTextPersonName);
    textView.setText(message);

    TextView textView2 = findViewById(R.id.editTextTextPersonName2);
    textView.setText(message);

}