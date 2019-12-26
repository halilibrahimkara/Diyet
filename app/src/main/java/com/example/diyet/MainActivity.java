package com.example.diyet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button hesap;
    EditText boy;
    EditText kilo;
    float bmi;

    Button zayif;
    Button ideal;
    Button kilolu;
    Button obez;
    Button oyun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hesap=findViewById(R.id.hesap);
        boy=findViewById(R.id.boy);
        kilo=findViewById(R.id.kilo);

        zayif=findViewById(R.id.zayif);
        ideal=findViewById(R.id.ideal);
        kilolu=findViewById(R.id.kilolu);
        obez=findViewById(R.id.obez);
        oyun=findViewById(R.id.oyun);

        hesap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float b=Float.parseFloat(boy.getText().toString());
                float k=Float.parseFloat(kilo.getText().toString());
                bmi=k / ((b / 100) * (b / 100));
                Toast.makeText(MainActivity.this, Float.toString(bmi) , Toast.LENGTH_SHORT).show();
            }
        });


        zayif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , ZActivity.class));
            }
        });

        ideal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , IActivity.class));
            }
        });

        kilolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , KActivity.class));
            }
        });

        obez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , OActivity.class));
            }
        });

        oyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , OyunActivity.class));
            }
        });
    }
}
