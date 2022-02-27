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
                if (!gameWon) {
                    if (casilla11.isEmpty()) {

                        setDrawableCasilla(player[0], casilla11);

                        casilla11.fill();
                        casilla11.setPlayer(player[0]);

                        if (!checkGameWonByPlayer(player[0])) {
                            player[0] = setPlayer(player[0], tvPlayer);
                            casillasOcupadas++;
                            checkGameEnd(tvPlayer);
                        }

                    } else {
                        Toast.makeText(getApplicationContext(), R.string.cell_full, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), R.string.game_already_won, Toast.LENGTH_SHORT).show();
                }
            }
        });


        r1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Casilla casilla12 = tablero.getCasillaById(2);
                if(casilla12.isEmpty()) {

                    setDrawableCasilla(player[0],casilla12);

                    casilla12.fill();
                    casilla12.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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

                    setDrawableCasilla(player[0],casilla13);

                    casilla13.fill();
                    casilla13.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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

                    setDrawableCasilla(player[0],casilla21);
                    casilla21.fill();
                    casilla21.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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

                    setDrawableCasilla(player[0],casilla22);
                    casilla22.fill();
                    casilla22.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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

                    setDrawableCasilla(player[0],casilla23);
                    casilla23.fill();
                    casilla23.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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

                    setDrawableCasilla(player[0],casilla31);
                    casilla31.fill();
                    casilla31.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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

                    setDrawableCasilla(player[0],casilla32);
                    casilla32.fill();
                    casilla32.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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

                    setDrawableCasilla(player[0],casilla33);
                    casilla33.fill();
                    casilla33.setPlayer(player[0]);

                    if (!checkGameWonByPlayer(player[0])){
                        player[0] = setPlayer(player[0],tvPlayer);
                        casillasOcupadas++;
                        checkGameEnd(tvPlayer);
                    }
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
            gameWon = true;
            if (player == 1){
                Toast.makeText(getApplicationContext(),R.string.player1_win,Toast.LENGTH_SHORT).show();
            } else if(player == 2){
                Toast.makeText(getApplicationContext(),R.string.player2_win,Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        return false;
    }

    private void setDrawableCasilla(int player, Casilla c){
        if (player == 1){
            c.getImageView().setImageResource(R.drawable.dot);
        } else if (player == 2){
            c.getImageView().setImageResource(R.drawable.cross);
        }
    }

}