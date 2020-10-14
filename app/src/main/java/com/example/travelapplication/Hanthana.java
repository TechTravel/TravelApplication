package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Hanthana extends AppCompatActivity {

  //  private ImageView view1 ;

    Button b , b1 , b2, b3, b4, b5  ;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanthana);

        b = (Button)findViewById(R.id.next);
        b1 = (Button)findViewById(R.id.next2);
        b2 = (Button)findViewById(R.id.next3);
        b3 = (Button)findViewById(R.id.next4);
        b4 = (Button)findViewById(R.id.next5);


        img = (ImageView)findViewById(R.id.dog1);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.btnimgone);
            }
        });


        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.btnimageoneone);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.btnthreeimage);
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.btnfourimage);
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                img.setImageResource(R.mipmap.btnfiveimage);
            }
        });

    }

}