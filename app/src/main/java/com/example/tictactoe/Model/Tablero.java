package com.example.tictactoe.Model;

import android.widget.ImageView;

import java.util.ArrayList;

public class Tablero {
    ArrayList<Casilla> tablero;

    public Tablero(ImageView r1c1, ImageView r1c2, ImageView r1c3, ImageView r2c1, ImageView r2c2, ImageView r2c3,
                   ImageView r3c1, ImageView r3c2, ImageView r3c3) {
        tablero.add(new Casilla(1, r1c1));
        tablero.add(new Casilla(2, r1c2));
        tablero.add(new Casilla(3, r1c3));
        tablero.add(new Casilla(4, r2c1));
        tablero.add(new Casilla(5, r2c2));
        tablero.add(new Casilla(6, r2c3));
        tablero.add(new Casilla(7, r3c1));
        tablero.add(new Casilla(8, r3c2));
        tablero.add(new Casilla(9, r3c3));
    }

    public Casilla getCasillaById(int id) {
        return tablero.get(id+1);
    }
}
