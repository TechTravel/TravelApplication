package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kandywaterfalls extends AppCompatActivity {

    private Button waterfall1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kandywaterfalls);

        waterfall1 = (Button) findViewById(R.id.waterfall1);
        waterfall1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openWater();
            }
        });
    }

    public void openWater(){
        Intent intent = new Intent(this, Waterfallone.class);
        startActivity(intent);
    }
}