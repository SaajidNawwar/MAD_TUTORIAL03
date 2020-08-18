package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Navigate(View v){
        Intent i = new Intent(this,FirstActivity.class);
        startActivity(i);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this,"You just clicked OK button",duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0,0);
    }
}