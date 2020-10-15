package com.example.travelapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class badullamountains extends AppCompatActivity {

    private Button badullaone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badullamountains);

        badullaone = (Button) findViewById(R.id.mountain2);
        badullaone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openBadullam();
            }
        });
    }


    public void openBadullam(){
        Intent intent = new Intent(this, badullamountainone.class);
        startActivity(intent);
    }
}