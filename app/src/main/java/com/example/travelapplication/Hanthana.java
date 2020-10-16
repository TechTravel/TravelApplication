package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Hanthana extends AppCompatActivity {

    Button b , b1 , b2, b3, b4, b5  ;
    ImageView img;
    Button booking1 , feedbacks ;


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

        booking1 = (Button) findViewById(R.id.bookbtn1);
        booking1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openBookings();
            }
        });

        feedbacks = (Button) findViewById(R.id.feedback);
        feedbacks.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openFeedbacks();
            }
        });



    }

    public void openBookings(){
        Intent intent = new Intent(Hanthana.this, HotelRoomBooking.class);
        startActivity(intent);
    }

    public void openFeedbacks(){
        Intent intent = new Intent(Hanthana.this, HomeActivity.class);
        startActivity(intent);
    }




}