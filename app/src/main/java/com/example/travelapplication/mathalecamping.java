package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mathalecamping extends AppCompatActivity {

    private Button btnone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathalecamping);

        btnone = (Button) findViewById(R.id.camp1);
        btnone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMaone();
            }
        });
    }

    public void openMaone(){
        Intent intent = new Intent(this, Mathalecampone.class);
        startActivity(intent);
    }
}