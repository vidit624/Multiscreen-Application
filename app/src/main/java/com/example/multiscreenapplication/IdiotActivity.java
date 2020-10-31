package com.example.multiscreenapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IdiotActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idiot);

        TextView textView1 = (TextView) findViewById(R.id.idiot2);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "OK now you are qualified as an idiot! LOL", Toast.LENGTH_LONG).show();
                Intent i = new Intent(IdiotActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}