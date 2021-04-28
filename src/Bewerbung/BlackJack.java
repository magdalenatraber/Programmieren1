package Bewerbung;

import java.util.Arrays;

// Blackjack game - so the goal is to have the highest number
// but not higher than 21
// So write a method blackjackWinner who gets a 2 dim array as a parameter
// every row stands for one game: [17, 21, 23, 14]
// you should calculate for every game who is the winner
// return value: an array which counts how often every player has won:
// in the first game player 2 would have won -> this means the counter of the
// returning array should be like that [0, 1, 0, 0]
// assume: every row has the same length and we do not know how many rows
// if it is a draw -> nobody gets a point for winning

public class BlackJack {
    public static void main(String[] args) {
        int[][] results = {{17, 21, 23, 14}, {21, 23, 19, 21} , {25, 15, 19, 13}, {17, 21, 23, 14}, {24, 25, 22, 23}};
        System.out.println("Winners = " + Arrays.toString(blackJackWinner(results)));
    }

    public static int[] blackJackWinner(int[][] matrix) {
        int[] winner = new int[4];

        for (int row = 0; row < matrix.length; row++) {
           int keep = 0;
           int win = 0;
           int draw = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > 21)
                    continue;
                if (matrix[row][col] <= 21 && matrix[row][col] > keep) {
                    keep = matrix[row][col];
                    win = col;
                }
                else
                if (matrix[row][col] == keep)
                    draw += 1;

                if (col == matrix[row].length - 1 && draw == 0)
                    winner[win] += 1;
            }
        }
        return winner;
    }
}
