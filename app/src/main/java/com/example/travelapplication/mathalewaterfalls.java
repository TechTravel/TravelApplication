package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mathalewaterfalls extends AppCompatActivity {

    private Button waterfall1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathalewaterfalls);

        waterfall1 = (Button) findViewById(R.id.mountain2);
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