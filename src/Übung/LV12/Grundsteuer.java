package Übung.LV12;

import java.util.Arrays;

public class Grundsteuer {
    public static void main(String[] args) {
        int[][] grundsteuer = {{1, 30, 40}, {2, 50, 100}, {3, 71, 58}};
        int[] kunden = {0, 4, 0};
        grundsteuerZuordnen(grundsteuer,kunden);
        System.out.println("Arrays.toString(grundsteuerZuordnen(grundsteuer,kunden) = " + Arrays.toString(grundsteuerZuordnen(grundsteuer,kunden)));
    }

    public static double grundsteuerBerechnen(int[][] arr, int position) {
        double grundsteuer = 0;
            if (arr[position][0] == 1) {
                grundsteuer = arr[position][1] * arr[position][2] * 3.20;
                return grundsteuer;
            } else if (arr[position][0] == 2) {
                grundsteuer = arr[position][1] * arr[position][2] * 2.10;
                return grundsteuer;
            } else if (arr[position][0] == 3) {
                grundsteuer = arr[position][1] * arr[position][2] * 0.90;
                return grundsteuer;
            }
    return grundsteuer;
        }


    public static double[] grundsteuerZuordnen(int[][] arr, int[] kunden) {
        double[] zuordnen = new double[25];

            for (int j = 0; j < zuordnen.length; j++) {
                for (int i = 0; i < kunden.length; i++) {
                if (kunden[i] == j){
                    zuordnen[j] = zuordnen[j] + grundsteuerBerechnen(arr,i);
                }
                else
                    if(kunden[i] != j)
                        zuordnen[j] = zuordnen[j];

            }
        }
        return zuordnen;
    }
}
