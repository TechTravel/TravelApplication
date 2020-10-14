package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kandymountains extends AppCompatActivity {

    private Button mount1 ;
    private Button mount2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kandymountains);

        mount1 = (Button) findViewById(R.id.mount1);
        mount1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMount();
            }
        });

        mount2 = (Button) findViewById(R.id.mountain2);
        mount2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMount2();
            }
        });
    }

    public void openMount(){
        Intent intent = new Intent(this, Hanthana.class);
        startActivity(intent);
    }

    public void openMount2(){
        Intent intent = new Intent(this, Hanthana.class);
        startActivity(intent);
    }
}