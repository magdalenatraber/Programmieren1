package Übung.LV3;

import java.util.Arrays;

public class FlatArray {
    public static void main(String[] args) {
int[][] arr = {{0,1,9},{6,6,5}};
printMatrix(arr);
        System.out.println("Arrays.toString(getFlatArray(arr)) = " + Arrays.toString(getFlatArray(arr)));
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
            public static int[] getFlatArray(int[][] numbers){
            int[] flatArrray = new int[numbers[0].length*numbers.length];
            int counter = 0;
                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 0; j < numbers[i].length; j++) {
flatArrray[counter]=numbers[i][j];
        counter++;
                    }

                }

                for (int i = 0; i < flatArrray.length-1; i++) {
                    for (int j = 1+i; j < flatArrray.length; j++) {
                        if(flatArrray[i] == flatArrray[j])
                            flatArrray[j] = -1;

                    }

                }


                return flatArrray;
            }
        }
    