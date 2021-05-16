package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray ={"Tu dia sera genial", "Tranquilo todo estara bien", "Sigue participando"};


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia la imagen
        Ball = findViewById(R.id.btn);
        //referencia de texto
        respuesta = findViewById(R.id.respuestvista);
        //Proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "consulta tu suerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v){
        // creación de metodo switch
        switch (v.getId()){
            case R.id.btn:
                int rand=new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);

                break;
        }
    }


}