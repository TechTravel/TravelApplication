package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class aa extends AppCompatActivity {
    ImageButton back;
    Button edit;
    Button delete;
    Button addpay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa);

        back = (ImageButton)findViewById(R.id.arrow2);
        edit=findViewById(R.id.editbooking);
        delete=findViewById(R.id.delete);
        addpay=findViewById(R.id.payment);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aa.this, aa.class);
                startActivity(intent);
            }
        });

        addpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aa.this, AddPaymentDetails.class);
                startActivity(intent);
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aa.this, HotelRoomBooking.class);
                startActivity(intent);
                Toast.makeText(aa.this, "Edit!!", Toast.LENGTH_SHORT).show();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aa.this, HotelRoomBooking.class);
                startActivity(intent);
                Toast.makeText(aa.this, "Deleted Successfully!!", Toast.LENGTH_SHORT).show();
            }
        });





    }
}
