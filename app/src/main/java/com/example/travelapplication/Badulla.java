package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Badulla extends AppCompatActivity {

    private Button mount2 ;
    private Button water2 ;
    private Button camp2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badulla);


        mount2 = (Button) findViewById(R.id.mathalemount);
        mount2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMount();
            }
        });

        water2 = (Button) findViewById(R.id.mathalewater);
        water2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openWaterfalllist();
            }
        });

        camp2 = (Button) findViewById(R.id.mathalecamp);
        camp2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCamping();
            }
        });
    }

    public void openMount(){
        Intent intent = new Intent(Badulla.this, badullamountains.class);
        startActivity(intent);
    }

    public void openWaterfalllist(){
        Intent intent = new Intent(Badulla.this, badullawaterfalls.class);
        startActivity(intent);
    }

    public void openCamping(){
        Intent intent = new Intent(Badulla.this, badullacampings.class);
        startActivity(intent);
    }

}