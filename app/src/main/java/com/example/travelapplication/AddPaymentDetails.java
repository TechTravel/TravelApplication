package com.example.travelapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddPaymentDetails extends AppCompatActivity  {
    Button makePay;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad);

        makePay=findViewById(R.id.makepayment3);
        back=findViewById(R.id.arrow);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPaymentDetails.this, aa.class);
                startActivity(intent);
            }
        });

        makePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddPaymentDetails.this, MyPaymentDetails.class);
                startActivity(intent);
                Toast.makeText(AddPaymentDetails.this, "Payment added", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
