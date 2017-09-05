package com.example.aashitapatwari.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MAINACTIVITY extends AppCompatActivity {
    Button b;
    Button threeClick;
    EditText textField;
    ImageView dog2, dog3, dog4, dog5, dog1, dog6, dog7, dog8, dog9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
        textField = (EditText)findViewById(R.id.editText);
        dog2 = (ImageView)findViewById(R.id.dog2);
        dog3 = (ImageView)findViewById(R.id.dog3);
        dog4 = (ImageView)findViewById(R.id.dog4);
        dog5 = (ImageView)findViewById(R.id.dog5);
        dog1 = (ImageView)findViewById(R.id.dog1);
        dog6 = (ImageView)findViewById(R.id.dog6);
        dog7 = (ImageView)findViewById(R.id.dog7);
        dog8 = (ImageView)findViewById(R.id.dog8);
        dog9 = (ImageView)findViewById(R.id.dog9);

        b = (Button)findViewById(R.id.button); //Define your button here
        b.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                count ++;
                if (count==10) {
                    String input = textField.getText().toString();
                    Toast.makeText(getApplicationContext(),"40 more clicks until "+ input + " dies", Toast.LENGTH_SHORT).show();
                    dog2.setVisibility(View.VISIBLE);
                }
                if (count==20) {
                    String input = textField.getText().toString();
                    Toast.makeText(getApplicationContext(), "30 more clicks until " + input + " dies",Toast.LENGTH_SHORT).show();
                    dog3.setVisibility(View.VISIBLE);
                }
                if (count==30) {
                    String input = textField.getText().toString();
                    Toast.makeText(getApplicationContext(), "20 more clicks until " + input + " dies",Toast.LENGTH_SHORT).show();
                    dog4.setVisibility(View.VISIBLE);
                }
                if (count==40) {
                    String input = textField.getText().toString();
                    Toast.makeText(getApplicationContext(), "10 more clicks until " + input + " dies",Toast.LENGTH_SHORT).show();
                    dog5.setVisibility(View.VISIBLE);
                }
                if (count==50) {
                    String input = textField.getText().toString();
                    Toast.makeText(getApplicationContext(), input + " is dead!!!",Toast.LENGTH_SHORT).show();
                    dog1.setVisibility(View.VISIBLE);
                    dog6.setVisibility(View.VISIBLE);
                    dog7.setVisibility(View.VISIBLE);
                    dog8.setVisibility(View.VISIBLE);
                    dog9.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
