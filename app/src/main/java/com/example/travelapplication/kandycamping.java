package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kandycamping extends AppCompatActivity {

    private Button camping1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kandycamping);

        camping1 = (Button) findViewById(R.id.camp1);
        camping1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCamp();
            }
        });
    }
    public void openCamp(){
        Intent intent = new Intent(this, kandycampone.class);
        startActivity(intent);
    }

}