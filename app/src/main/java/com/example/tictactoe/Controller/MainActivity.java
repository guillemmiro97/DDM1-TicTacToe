package com.example.tictactoe.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tictactoe.Model.Casilla;
import com.example.tictactoe.Model.Tablero;
import com.example.tictactoe.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView r1c1 = findViewById(R.id.r1c1);
        ImageView r1c2 = findViewById(R.id.r1c2);
        ImageView r1c3 = findViewById(R.id.r1c3);
        ImageView r2c1 = findViewById(R.id.r2c1);
        ImageView r2c2 = findViewById(R.id.r2c2);
        ImageView r2c3 = findViewById(R.id.r2c3);
        ImageView r3c1 = findViewById(R.id.r3c1);
        ImageView r3c2 = findViewById(R.id.r3c2);
        ImageView r3c3 = findViewById(R.id.r3c3);

        Tablero tablero = new Tablero(r1c1, r1c2, r1c3, r2c1, r2c2, r2c3, r3c1, r3c2, r3c3);

        TextView tvPlayer = findViewById(R.id.playerMessage);

        tvPlayer.setText(R.string.player_1);

        //TODO: como sabemos que player está jugando y le metemos el dibujo

        r1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla11 = tablero.getCasillaById(1);
                if(casilla11.isEmpty()) {
                    //Podemos rellenarla por el player
                }
            }
        });

        r1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla12 = tablero.getCasillaById(2);
            }
        });

        r1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla13 = tablero.getCasillaById(3);
            }
        });

        r2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla21 = tablero.getCasillaById(4);
            }
        });

        r2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla22 = tablero.getCasillaById(5);
            }
        });

        r2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla23 = tablero.getCasillaById(6);
            }
        });

        r3c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla31 = tablero.getCasillaById(7);
            }
        });

        r3c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla32 = tablero.getCasillaById(8);
            }
        });

        r3c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla33 = tablero.getCasillaById(9);
            }
        });



    }
}