package Übung.LV8;

import java.util.Arrays;

public class GlücklicherVerlierer {
    public static void main(String[] args) {
        String[] loser1 = {"Kurt", "Alex", "Max", "Caro"};
        String[] loser2 = {"Max", "Alex", "Karo"};
        System.out.println("Arrays.toString(luckyLosers(loser1, loser2) = " + Arrays.toString(luckyLosers(loser1, loser2)));

    }
    public static String[] luckyLosers (String[] x, String[] y){
        String[] lucky = new String[x.length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if(x[i] == y[j])
                    lucky[i] = x[i];
            }

        }
        return lucky;
    }
}
