package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class upload extends AppCompatActivity {

    EditText txtdest, txtdur, txtTmode, txtAcco, txtbudg, txtdescrip;
    Button btnSave, btnBack, btnShow, btnUpdate, btnDelete, btnImage;

    Itinerary itn;

    private void clearControls() {
        txtdest.setText("");
        txtdur.setText("");
        txtTmode.setText("");
        txtAcco.setText("");
        txtbudg.setText("");
        txtdescrip.setText("");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        txtdest = findViewById(R.id.Etdestination);
        txtdur = findViewById(R.id.Etduration);
        txtTmode = findViewById(R.id.EtTmode);
        txtAcco = findViewById(R.id.EtAccodetails);
        txtbudg = findViewById(R.id.Etbudget);
        txtdescrip = findViewById(R.id.Etdescrip);

        btnSave = findViewById(R.id.b3save);
        btnShow = findViewById(R.id.b6view);
        btnUpdate = findViewById(R.id.b5update);
        btnDelete = findViewById(R.id.b4del);
        btnBack = findViewById(R.id.Btnvback);
        btnImage = findViewById(R.id.b2uimage);

        //itn=new Itinerary();

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(upload.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(upload.this,upload_image.class);
                startActivity(intent);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {
                    if (TextUtils.isEmpty(txtdest.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter a destination", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtdur.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter the duration", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtTmode.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter the transportation mode", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtAcco.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter the accommodation", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtbudg.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter the Budget", Toast.LENGTH_SHORT).show();

                    else if (TextUtils.isEmpty(txtdescrip.getText().toString()))
                        Toast.makeText(getApplicationContext(), "Please enter the budget", Toast.LENGTH_SHORT).show();


                    else {
                        itn.setTitle(txtdest.getText().toString().trim());
                        itn.setDestination(txtdur.getText().toString().trim());
                        itn.setType(txtTmode.getText().toString().trim());
                        itn.setDuration(Integer.parseInt(txtAcco.getText().toString().trim()));
                        itn.setTransport(txtbudg.getText().toString().trim());
                        itn.setDescription(txtdescrip.getText().toString().trim());




                        Toast.makeText(getApplicationContext(), "Data Saved Successfully", Toast.LENGTH_SHORT).show();
                        clearControls();
                    }


                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Invalid Budget value or duration", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
