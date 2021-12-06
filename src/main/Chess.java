package main;

import Pieces.*;

import java.util.Scanner;

public class Chess {
    Scanner sc = new Scanner(System.in);
    int gameType = 0;
    int xPosInput;//xPos in which the piece is on board
    int yPosInput;//yPos i which the piece is on board
    int xPosMove;//xPos where you want to move piece
    int yPosMove;//yPos where you want to move piece
    Piece[][] board = new Piece[8][8];//board declaration

    private Chess() {
//        while(gameType != 1 || gameType != 2) {
//            System.out.println("PvP [1] or PvAI [2]: ");
//            gameType = sc.nextInt();
//            if(gameType != 1 || gameType != 2)
//                System.out.println("INCORRECT INPUT");
//        }
        buildBoard();
        printBoard();
//        switch (gameType){
//            case 1:// PvP
//                break;
//            case 2:// PvAI
//                break;
//        }



    }


    private void startGame(){

    }

    //will check to see if game is won
    private boolean checkGame(){
        return false;
    }

    private void buildBoard() {
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Empty(j, i, 0, '-');
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            board[1][i] = new Pawn(i, 1, 1, 'P');//creates black pawns
            board[6][i] = new Pawn(i, 6, 1, 'p');//creates white pawns
        }

        board[0][0] = new Rook(0, 0, 10, 'R');
        board[0][1] = new Knight(1, 0, 8, 'H');
        board[0][2] = new Bishop(2, 0, 6, 'B');
        board[0][3] = new Queen(3, 0, 25, 'Q');
        board[0][4] = new King(4, 0, Integer.MAX_VALUE, 'K');
        board[0][5] = new Bishop(5, 0, 6, 'B');
        board[0][6] = new Knight(6, 0, 8, 'H');
        board[0][7] = new Rook(7, 0, 10, 'R');

        board[7][0] = new Rook(0, 7, 10, 'r');
        board[7][1] = new Knight(1, 7, 8, 'h');
        board[7][2] = new Bishop(2, 7, 6, 'b');
        board[7][3] = new Queen(3, 7, 25, 'q');
        board[7][4] = new King(4, 7, Integer.MAX_VALUE, 'k');
        board[7][5] = new Bishop(5, 7, 6, 'b');
        board[7][6] = new Knight(6, 7, 8, 'h');
        board[7][7] = new Rook(7, 7, 10, 'r');
    }

    private void printBoard(){
        System.out.println("y/x 0   1   2   3   4   5   6   7");
        for(int i = 0; i < board.length; i++){
            System.out.print(i + " | ");
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j].getType() + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Chess();
    }
}
