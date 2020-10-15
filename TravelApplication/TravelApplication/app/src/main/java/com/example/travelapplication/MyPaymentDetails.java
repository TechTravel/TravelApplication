package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyPaymentDetails extends AppCompatActivity {
    ImageButton back1;
    Button booked;
    Button delete1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_payment_details);
         back1=findViewById(R.id.arrow4);
        booked=findViewById(R.id.confirm);
        delete1=findViewById(R.id.delete);
        booked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPaymentDetails.this, MyPaymentDetails.class);
                startActivity(intent);
                Toast.makeText(MyPaymentDetails.this, "Booked", Toast.LENGTH_SHORT).show();
            }
        });
        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPaymentDetails.this, AddPaymentDetails.class);
                startActivity(intent);
                Toast.makeText(MyPaymentDetails.this, "Deleted", Toast.LENGTH_SHORT).show();
            }
        });
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPaymentDetails.this, AddPaymentDetails.class);
                startActivity(intent);
            }
        });


    }
}