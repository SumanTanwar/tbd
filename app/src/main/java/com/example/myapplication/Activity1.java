package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    CheckBox ch1, ch2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        ch1 =findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        bt1 = findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked()){
                    Toast.makeText(Activity1.this, "you are male", Toast.LENGTH_SHORT).show();
                }
                if(ch2.isChecked()){
                    Toast.makeText(Activity1.this, "you are female", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}