package com.example.tictactoe.Model;

import android.widget.ImageView;

public class Casilla {
    private int id;
    private boolean isEmpty;
    private int player;
    private final ImageView imageView;

    public Casilla(int id, ImageView imageView) {
        this.id = id;
        this.isEmpty = true;
        this.imageView = imageView;
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

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
