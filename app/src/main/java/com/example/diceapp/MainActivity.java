package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    Button button;
    Random rah = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = findViewById(R.id.dice);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ra = rah.nextInt(6)+1;

                if(ra == 4){
                    imageview.setImageResource(R.drawable.dice4);
                }
                if(ra == 6){
                    imageview.setImageResource(R.drawable.dice6);
                }
                if(ra == 8){
                    imageview.setImageResource(R.drawable.dice8);
                }
                if(ra == 10){
                    imageview.setImageResource(R.drawable.dice10);
                }
                if(ra == 12){
                    imageview.setImageResource(R.drawable.dice12);

                    if(ra == 20){
                        imageview.setImageResource(R.drawable.dice20);
                    }    }
            }

        });

    }
}