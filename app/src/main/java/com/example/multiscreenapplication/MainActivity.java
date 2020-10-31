package com.example.multiscreenapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.idiot1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n == 0)Toast.makeText(v.getContext(), "You have been entertained one more time!!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, IdiotActivity.class);
                startActivity(i);
            }
        });
    }

}