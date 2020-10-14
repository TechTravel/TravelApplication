package com.example.travelapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Spinner spinner ;
    ArrayAdapter<CharSequence> adapter ;

    SearchView s1 ;

    private Button thingstodo ;
    private Button maps ;
    private Button srilanka ;

    private Button maliga ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource( this, R.array.names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){

                Toast.makeText(getBaseContext(),  parent.getItemAtPosition(position) + " selected", Toast.LENGTH_LONG).show();


                if (parent.getItemAtPosition(position).equals("Select a District")){

                }

                else if (parent.getItemAtPosition(position).equals("Kandy")){
                    Intent intent = new Intent( MainActivity.this, kandydistrict.class );
                    startActivity(intent);
                }

               else if (parent.getItemAtPosition(position).equals("Mathale")){
                    Intent intent = new Intent( MainActivity.this, mathale.class );
                    startActivity(intent);
                }

               else if (parent.getItemAtPosition(position).equals("Badulla")){
                    Intent intent = new Intent( MainActivity.this, Badulla.class );
                    startActivity(intent);
                }

               s1 = (SearchView) findViewById(R.id.searchone) ;

               if(s1.equals("hanthana")){
                   Intent intent = new Intent( MainActivity.this, Hanthana.class );
                   startActivity(intent);
               }

                thingstodo = (Button) findViewById(R.id.todo);
                thingstodo.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        openTodo();
                    }
                });

                maps = (Button) findViewById(R.id.map);
                maps.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                          openMap();
                    }
                });

                srilanka = (Button) findViewById(R.id.sl);
                srilanka.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        openExplore();
                    }
                });


                maliga = (Button) findViewById(R.id.maliga1);
                maliga.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        openMaliga();
                    }
                });


            }

            public void openTodo(){
                Intent intent = new Intent(MainActivity.this, thingstodo.class);
                startActivity(intent);
            }

            public void openMap(){
                Intent intent = new Intent(MainActivity.this, map.class);
                startActivity(intent);
            }

            public void openExplore(){
                Intent intent = new Intent(MainActivity.this, exploresl.class);
                startActivity(intent);
            }

            public void openMaliga(){
                Intent intent = new Intent(MainActivity.this, DaladaMaligawa.class);
                startActivity(intent);
            }



            @Override
            public  void onNothingSelected(AdapterView<?> parent){

            }
        });



    }



}