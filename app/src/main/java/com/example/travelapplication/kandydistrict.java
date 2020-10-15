package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class kandydistrict extends AppCompatActivity {

    private Button mount ;
    private Button water ;
    private Button camp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kandydistrict);

        mount = (Button) findViewById(R.id.mathalemount);
        mount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMount();
            }
        });

        water = (Button) findViewById(R.id.mathalewater);
        water.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openWaterfalllist();
            }
        });

        camp = (Button) findViewById(R.id.mathalecamp);
        camp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCamping();
            }
        });
    }

    public void openMount(){
        Intent intent = new Intent(this, kandymountains.class);
        startActivity(intent);
    }

    public void openWaterfalllist(){
        Intent intent = new Intent(kandydistrict.this, kandywaterfalls.class);
        startActivity(intent);
    }

    public void openCamping(){
        Intent intent = new Intent(this, kandycamping.class);
        startActivity(intent);
    }
}