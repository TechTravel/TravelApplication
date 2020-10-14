package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mathale extends AppCompatActivity {

    private Button mount3 ;
    private Button water3 ;
    private Button camp3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathale);

        mount3 = (Button) findViewById(R.id.mathalemount);
        mount3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMount3();
            }
        });

        water3 = (Button) findViewById(R.id.mathalewater);
        water3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openWaterfalllist3();
            }
        });

        camp3 = (Button) findViewById(R.id.mathalecamp);
        camp3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCamping3();
            }
        });
    }

    public void openMount3(){
        Intent intent = new Intent(mathale.this, mathalemountains.class);
        startActivity(intent);
    }

    public void openWaterfalllist3(){
        Intent intent = new Intent(mathale.this, mathalewaterfalls.class);
        startActivity(intent);
    }

    public void openCamping3(){
        Intent intent = new Intent(mathale.this, mathalecamping.class);
        startActivity(intent);
    }

}