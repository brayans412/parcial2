package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View v) {
        // Intent para volver a MainActivity
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }

    public void software(View view){
        Intent c = new Intent(this,Vista.class);
        Bundle p = new Bundle();

        c.putExtras(p);
        startActivity(c);
    }

    public void empresas(View view){
        Intent c = new Intent(this,Vista.class);
        Bundle p = new Bundle();

        c.putExtras(p);
        startActivity(c);
    }

    public void negocios(View view){
        Intent c = new Intent(this,Vista.class);
        Bundle p = new Bundle();

        c.putExtras(p);
        startActivity(c);
    }

    public void gastronomia(View view){
        Intent c = new Intent(this,Vista.class);
        Bundle p = new Bundle();

        c.putExtras(p);
        startActivity(c);
    }

}