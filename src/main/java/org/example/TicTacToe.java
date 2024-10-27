package org.example;

import java.util.Scanner;

public class TicTacToe {
    // 0 = empty, 1 = player 1 (X), -1 = player 2 (O)
    static int[][] board = new int[3][3];
    static Scanner sc = new Scanner(System.in);
    static int currentPlayer = 1;
    static int winner = 0;

    public static void main(String[] args) {
        while (winner == 0) {
            printBoard();
            System.out.println("Player " + (currentPlayer == 1 ? "1 (X)" : "2 (O)") + ", input your move (row and column):");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Validate input
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != 0) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            board[row][col] = currentPlayer; // Make the move

            // Check for a winner
            checkWinner();

            // Switch players
            currentPlayer = -currentPlayer; // Toggle between 1 and -1
        }

        printBoard();
        System.out.println("The game has ended and the Winner is Player " + (winner == 1 ? "1 (X)" : "2 (O)"));
    }

    private static void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char symbol;
                if (board[i][j] == 1) {
                    symbol = 'X';
                } else if (board[i][j] == -1) {
                    symbol = 'O';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    private static void checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (Math.abs(board[i][0] + board[i][1] + board[i][2]) == 3) {
                winner = board[i][0]; // Winner is either 1 or -1
            }
            if (Math.abs(board[0][i] + board[1][i] + board[2][i]) == 3) {
                winner = board[0][i]; // Winner is either 1 or -1
            }
        }
        // Check diagonals
        if (Math.abs(board[0][0] + board[1][1] + board[2][2]) == 3) {
            winner = board[1][1];
        }
        if (Math.abs(board[0][2] + board[1][1] + board[2][0]) == 3) {
            winner = board[1][1];
        }
    }
}
