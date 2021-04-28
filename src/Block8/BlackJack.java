package Block8;
// Blackjack game - so the goal is to have the highest number
// but not higher than 21
// So write a method blackjackWinner who gets a 2 dim array as a parameter
// every row stands for one game: [17, 21, 23, 14]
// you should calculate for every game who is the winner
// return value: an array which counts how often every player has won:
// in the first game player 2 would have won -> this means the counter of the
// returning array should be like that [0, 1, 0, 0]
// assume: every row has the same length and we do not know how many rows
// if it is a draw -> nobody gets a poin for winning

/*
public static int[] blackjackWinner (int[][] games) {
        int[] winners = new int[games[0].length];
        // array by default initialized with zero ?
        for (int i = 0; i < games.length; i++) {
        int points = -1;
        int draw = 0;
        int counter = 0;
        for (int j = 0; j < games[i].length; j++) {
        if (games[i][j] == points) {
        draw = games[i][j];
        }
        if (games[i][j] > points) {
        if (games[i][j] <= 21) {
        points = games[i][j];
        counter = j;
        }
        }
        }

        if (points != draw) {
        winners[counter]++;
        }
        }

        return winners;

        }
*/
import java.util.Arrays;

public class BlackJack {
    public static void main(String[] args) {
        int[][] results = {{21, 21, 22, 4}, {25, 15, 19, 3}, {17, 21, 23, 14}};
        System.out.println(Arrays.toString(blackJackWinner(results)));

    }

    public static int [] blackJackWinner(int[][] matrix){
       int [] winner = new int [4];
       int keep;
       int win;
       int draw;
        for (int row = 0; row < matrix.length; row++) {
            keep = 0;
            win = 0;
            draw = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] > 21) {
                    continue;
                }
                if (matrix[row][col] <= 21 && matrix[row][col] > keep) {
                    keep = matrix[row][col];
                    win = col;
                }
                if (matrix[row][col] == keep) {
                    draw += 1;
                }
                if (col == matrix[row].length - 1) {
                    winner[win] += 1;
                }
                }
            }

return winner;



    }
}
