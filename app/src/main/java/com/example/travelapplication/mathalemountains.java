package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mathalemountains extends AppCompatActivity {

    private Button mathaleone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathalemountains);


        mathaleone = (Button) findViewById(R.id.mountain2);
        mathaleone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMaonemathale();
            }
        });
    }

    public void openMaonemathale(){
        Intent intent = new Intent(this, mathalemountainone.class);
        startActivity(intent);
    }
}