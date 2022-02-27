package com.example.tictactoe.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tictactoe.Model.Casilla;
import com.example.tictactoe.Model.Tablero;
import com.example.tictactoe.R;

public class MainActivity extends AppCompatActivity {
    final int[] player = {1};
    private int casillasOcupadas = 0;
    Tablero tablero;
    TextView tvPlayer;
    boolean gameWon = false;

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

        tablero = new Tablero(r1c1, r1c2, r1c3, r2c1, r2c2, r2c3, r3c1, r3c2, r3c3);

        tvPlayer = findViewById(R.id.playerMessage);
        tvPlayer.setText(R.string.player_1);

        //TODO: Refactor del código para poner toda la logica en una función, pasando la casilla.

        r1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla11 = tablero.getCasillaById(1);
                if(casilla11.isEmpty()) {

                    if (player[0] == 1){
                        casilla11.getImageView().setImageResource(R.drawable.dot);
                        casilla11.fill();
                        casilla11.setPlayer(player[0]);
                        /*if (tablero.checkGameWon(player[0])) {
                            Toast.makeText(getApplicationContext(),R.string.player1_win,Toast.LENGTH_SHORT).show();
                        }*/
                    } else if (player[0] == 2){
                        casilla11.getImageView().setImageResource(R.drawable.cross);
                        casilla11.fill();
                        casilla11.setPlayer(player[0]);
                        /*if (tablero.checkGameWon(player[0])) {
                            Toast.makeText(getApplicationContext(),R.string.player2_win,Toast.LENGTH_SHORT).show();
                        }*/
                    }
                    checkGameWonByPlayer(player[0]);


                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });


        r1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla12 = tablero.getCasillaById(2);
                if(casilla12.isEmpty()) {

                    if (player[0] == 1){
                        casilla12.getImageView().setImageResource(R.drawable.dot);
                        casilla12.fill();
                        casilla12.setPlayer(player[0]);
                        /*if (tablero.checkGameWon(player[0])) {
                            tvPlayer.setText(R.string.game_ended);
                            Toast.makeText(getApplicationContext(),R.string.player1_win,Toast.LENGTH_SHORT).show();
                        }*/
                    } else if (player[0] == 2){
                        casilla12.getImageView().setImageResource(R.drawable.cross);
                        casilla12.fill();
                        casilla12.setPlayer(player[0]);
                        /*if (tablero.checkGameWon(player[0])) {
                            tvPlayer.setText(R.string.game_ended);
                            Toast.makeText(getApplicationContext(),R.string.player2_win,Toast.LENGTH_SHORT).show();
                        }*/
                    }
                    checkGameWonByPlayer(player[0]);

                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });

        r1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla13 = tablero.getCasillaById(3);
                if(casilla13.isEmpty()) {

                    if (player[0] == 1){
                        casilla13.getImageView().setImageResource(R.drawable.dot);
                        casilla13.fill();
                        casilla13.setPlayer(player[0]);
                        /*if (tablero.checkGameWon(player[0])) {
                            Toast.makeText(getApplicationContext(),R.string.player1_win,Toast.LENGTH_SHORT).show();
                        }*/
                    } else if (player[0] == 2){
                        casilla13.getImageView().setImageResource(R.drawable.cross);
                        casilla13.fill();
                        casilla13.setPlayer(player[0]);
                        /*if (tablero.checkGameWon(player[0])) {
                            Toast.makeText(getApplicationContext(),R.string.player2_win,Toast.LENGTH_SHORT).show();
                        }*/
                    }
                    checkGameWonByPlayer(player[0]);

                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });

        r2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla21 = tablero.getCasillaById(4);
                if(casilla21.isEmpty()) {

                    if (player[0] == 1){
                        casilla21.getImageView().setImageResource(R.drawable.dot);
                        casilla21.fill();
                        casilla21.setPlayer(player[0]);
                    } else if (player[0] == 2){
                        casilla21.getImageView().setImageResource(R.drawable.cross);
                        casilla21.fill();
                    }
                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });

        r2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla22 = tablero.getCasillaById(5);
                if(casilla22.isEmpty()) {
                    if (player[0] == 1){
                        casilla22.getImageView().setImageResource(R.drawable.dot);
                        casilla22.fill();
                        casilla22.setPlayer(player[0]);
                    } else if (player[0] == 2){
                        casilla22.getImageView().setImageResource(R.drawable.cross);
                        casilla22.fill();
                    }
                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });

        r2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla23 = tablero.getCasillaById(6);
                if(casilla23.isEmpty()) {

                    if (player[0] == 1){
                        casilla23.getImageView().setImageResource(R.drawable.dot);
                        casilla23.fill();
                        casilla23.setPlayer(player[0]);
                    } else if (player[0] == 2){
                        casilla23.getImageView().setImageResource(R.drawable.cross);
                        casilla23.fill();
                    }
                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });

        r3c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla31 = tablero.getCasillaById(7);
                if(casilla31.isEmpty()) {

                    if (player[0] == 1){
                        casilla31.getImageView().setImageResource(R.drawable.dot);
                        casilla31.fill();
                        casilla31.setPlayer(player[0]);
                    } else if (player[0] == 2){
                        casilla31.getImageView().setImageResource(R.drawable.cross);
                        casilla31.fill();
                    }
                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });

        r3c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla32 = tablero.getCasillaById(8);
                if(casilla32.isEmpty()) {

                    if (player[0] == 1){
                        casilla32.getImageView().setImageResource(R.drawable.dot);
                        casilla32.fill();
                        casilla32.setPlayer(player[0]);
                    } else if (player[0] == 2){
                        casilla32.getImageView().setImageResource(R.drawable.cross);
                        casilla32.fill();
                    }
                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });

        r3c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla33 = tablero.getCasillaById(9);
                if(casilla33.isEmpty()) {

                    if (player[0] == 1){
                        casilla33.getImageView().setImageResource(R.drawable.dot);
                        casilla33.fill();
                        casilla33.setPlayer(player[0]);
                    } else if (player[0] == 2){
                        casilla33.getImageView().setImageResource(R.drawable.cross);
                        casilla33.fill();
                    }
                    player[0] = setPlayer(player[0],tvPlayer);
                    casillasOcupadas++;
                    checkGameEnd(tvPlayer);
                } else {
                    Toast.makeText(getApplicationContext(),R.string.cell_full,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private int setPlayer(int player,TextView tvPlayer ){
        if (player == 1){
            tvPlayer.setText(R.string.player_2);
            player++;
        } else if (player == 2){
            tvPlayer.setText(R.string.player_1);
            player--;
        }
        return player;
    }

    private void checkGameEnd(TextView tvPlayer) {
        if(casillasOcupadas == 9) {
            tvPlayer.setText(R.string.game_ended);
        }
    }

    private boolean checkGameWonByPlayer(int player){
        if (tablero.checkGameWon(player)) {
            tvPlayer.setText(R.string.game_ended);
            if (player == 1){
                Toast.makeText(getApplicationContext(),R.string.player1_win,Toast.LENGTH_SHORT).show();
            } else if(player == 2){
                Toast.makeText(getApplicationContext(),R.string.player2_win,Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        return false;
    }

}