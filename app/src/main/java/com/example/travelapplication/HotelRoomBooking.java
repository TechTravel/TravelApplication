package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class HotelRoomBooking extends AppCompatActivity {
    private static final String TAG="HotelRoomBooking";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    EditText name;
    EditText email;
    EditText phone;
    EditText date;
    Spinner s1;
    Spinner s2;
    Spinner s3;



    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_room_booking);

        mDisplayDate=(TextView)findViewById(R.id.mDisplayDate);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal =Calendar.getInstance();
                int year= cal.get(Calendar.YEAR);
                int month= cal.get(Calendar.MONTH);
                int day= cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(
                   HotelRoomBooking.this,
                   android.R.style.Theme_Holo_Dialog_MinWidth,
                   mDateSetListener,
                   year, month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                Log.d(TAG, "onDateSet: mm/dd/yy: " +month+"/"+dayOfMonth+"/"+year);
                String date=month+"/"+dayOfMonth+"/"+year;
                mDisplayDate.setText(date);
            }
        };

         button=findViewById(R.id.confirm);
        name=findViewById(R.id.editText2);
        date=findViewById(R.id.mDisplayDate);
        s1=findViewById(R.id.spinner1);
        s2=findViewById(R.id.spinner2);
        s3=findViewById(R.id.spinner3);
         email=findViewById(R.id.editText6);
        phone=findViewById(R.id.editText7);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";



                        String Name = name.getText().toString().trim();
                        String Date = date.getText().toString().trim();
                        String Room = s1.toString().trim();
                        String Guest = s2.toString().trim();
                        String Night = s3.toString().trim();
                        String textEmail = email.getText().toString().trim();
                        String textcontact = phone.getText().toString().trim();
                        boolean isValid=true;
                        if(Name.isEmpty()){
                            name.setError("Enter the NAME");
                            name.requestFocus();
                            isValid=false;
                        }
                        if(textEmail.isEmpty()){
                            email.setError("Enter the EmailAddress");
                            email.requestFocus();
                            isValid=false;

                        }else if(!textEmail.matches(emailPattern)) {
                            email.setError("Invalid  EmailAddress");
                            email.requestFocus();
                            isValid=false;
                        }
                        if(textcontact.isEmpty()){
                            phone.setError("Enter the Contact number");
                            phone.requestFocus();
                            isValid=false;
                        }
                        if(Date.isEmpty()){
                            date.setError("Enter the Date");
                            date.requestFocus();
                            isValid=false;

                        }
                        if(isValid){
                            Intent intent = new Intent(HotelRoomBooking.this, aa.class);
                            intent.putExtra("NAME", Name);
                            intent.putExtra("EMAIL", textEmail);
                            intent.putExtra("PHONE", textcontact);
                            intent.putExtra("DATE", Date);
                            intent.putExtra("ROOM", Room);
                            intent.putExtra("GUEST", Guest);
                            intent.putExtra("NIGHT", Night);
                            startActivity(intent);
                            Toast.makeText(HotelRoomBooking.this, "Booking Details Are  Inserted", Toast.LENGTH_LONG).show();

                        }

                    }


                }

        );


    }






}
