package Übung.LV8;

import java.util.Arrays;

public class Mittelwerte {
    public static void main(String[] args) {
        float[][] arr = {{2 ,4 ,6,7},{3,4,5,8}, {4,4,6,7},{15,9,5,8}};
        System.out.println("  = " + Arrays.toString(average(arr)));
    }
    public static float [] average(float[][] matrix){
        float [] averageArray = new float[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            float sum = 0.00F;
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
            averageArray[row] = sum / matrix.length;
        }
        return averageArray;
    }
}
