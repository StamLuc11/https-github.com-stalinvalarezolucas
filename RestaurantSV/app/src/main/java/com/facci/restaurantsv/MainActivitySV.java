package com.facci.restaurantsv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivitySV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sv);
    }
    public void click1(View v){
         Toast.makeText(MainActivitySV.this,"Pizzas",Toast.LENGTH_SHORT).show();

    }
    public void click2(View v){
        Toast.makeText(MainActivitySV.this,"Tacos",Toast.LENGTH_SHORT).show();

    }
    public void click3(View v){
        Toast.makeText(MainActivitySV.this,"Papipollo",Toast.LENGTH_SHORT).show();

    }
    public void click4(View v){
        Toast.makeText(MainActivitySV.this,"Sushi",Toast.LENGTH_SHORT).show();

    }
    public void click5(View v){
        Toast.makeText(MainActivitySV.this,"Pescado frito",Toast.LENGTH_SHORT).show();

    }
    public void click6(View v){

        Toast.makeText(MainActivitySV.this,"Enrrollado",Toast.LENGTH_SHORT).show();
    }
    public void click7(View v){

        Toast.makeText(MainActivitySV.this,"Apanado",Toast.LENGTH_SHORT).show();
    }

}
