package com.example.travelapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Batadobalena extends AppCompatActivity {

    Button b , b1 , b2, b3, b4, b5  ;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batadobalena);

        b = (Button)findViewById(R.id.next);
        b1 = (Button)findViewById(R.id.next2);
        b2 = (Button)findViewById(R.id.next3);
        b3 = (Button)findViewById(R.id.next4);
        b4 = (Button)findViewById(R.id.next5);


        img = (ImageView)findViewById(R.id.dog1);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.bataone);
            }
        });


        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.batatwo);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.batathree);
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.batafour);
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.batafive);
            }
        });

    }
}