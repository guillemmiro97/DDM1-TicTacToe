package com.example.tictactoe.Model;

import android.widget.ImageView;

public class Casilla {
    private int id;
    private boolean isEmpty;
    private int player;
    private final ImageView imageView;
    private int rowNumber;
    private int colNumber;


    public Casilla(int id, ImageView imageView, int rowNumber, int colNumber) {
        this.id = id;
        this.isEmpty = true;
        this.player = 0;
        this.imageView = imageView;
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getPlayer() {
        return player;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColNumber() {
        return colNumber;
    }

    public void fill() {
        isEmpty = false;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
