package com.example.travelapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thingstodo extends AppCompatActivity {

    private Button todo1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thingstodo);

        todo1 = (Button) findViewById(R.id.btn1);
        todo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openThings1();
            }
        });
    }

    public void openThings1(){
        Intent intent = new Intent(this, ToDoOne.class);
        startActivity(intent);
    }
}