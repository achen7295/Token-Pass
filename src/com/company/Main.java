package com.company;

public class Main {

    public static void main(String[] args) {
        TokenPass game1 = new TokenPass(7);

        while (game1.gameOver()<0) {
            game1.printBoard();
            game1.distributeCurrentPlayerTokens();
            game1.nextPlayer();
        }
        game1.printBoard();
        System.out.println("Player " + game1.gameOver() + " wins!");
    }
}
