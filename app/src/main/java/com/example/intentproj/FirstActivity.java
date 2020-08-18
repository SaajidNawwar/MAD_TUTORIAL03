package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void jump(View v){
            Intent i = new Intent(this,SecondActivity.class);
            startActivity(i);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,"You just clicked OK button",duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);

        TextView textView = findViewById(R.id.editTextTextPersonName);
        textView.setText(message);

        TextView textView2 = findViewById(R.id.editTextTextPersonName2);
        textView.setText(message);
    }


}