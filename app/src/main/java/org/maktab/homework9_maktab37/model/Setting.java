package org.maktab.homework9_maktab37.model;

import java.io.Serializable;

public class Setting implements Serializable {
    private String player1 = "Player1";
    private String player2 = "Player2";
    private int player1_score = 0;
    private int player2_score = 0;

    public int getPlayer1_score() {
        return player1_score;
    }

    public void setPlayer1_score(int player1_score) {
        this.player1_score = player1_score;
    }

    public int getPlayer2_score() {
        return player2_score;
    }

    public void setPlayer2_score(int player2_score) {
        this.player2_score = player2_score;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
}
