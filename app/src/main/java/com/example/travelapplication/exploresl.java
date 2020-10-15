package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class exploresl extends AppCompatActivity {

    private Button sl1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploresl);

        sl1 = (Button) findViewById(R.id.btn1);
        sl1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSL1();
            }
        });
    }

    public void openSL1(){
        Intent intent = new Intent(this, Batadobalena.class);
        startActivity(intent);
    }

}