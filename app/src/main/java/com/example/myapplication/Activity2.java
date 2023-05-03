package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    CheckBox pizza,icecream, Coffee;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        pizza = findViewById(R.id.pizza);
        icecream = findViewById(R.id.icecream);
        Coffee = findViewById(R.id.Coffee);
        order = findViewById(R.id.order);
         order.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 StringBuilder result = new StringBuilder();
                 result.append("the order include :");

                 if(pizza.isChecked()){
                     result.append("\n pizza got selected");
                 }
                 if(icecream.isChecked()){
                     result.append("\n iceream got selected");
                 }
                 if(Coffee.isChecked()){
                     result.append("\n coffee got selected");
                 }
                 Toast.makeText(Activity2.this,result.toString(), Toast.LENGTH_SHORT).show();
             }
         });
    }
}