package Übung.LV8;

public class SalesSmartphone {
    public static void main(String[] args) {
        int[][] arr = {{1, 50}, {2, 40}, {1, 60}, {1, 20}, {2, 30}, {3, 50}, {4, 30}, {1, 10},{7,100}};
summeGegendiagonale.printMatrix(arr);
        System.out.println();
summeGegendiagonale.printMatrix(smartphoneSales(arr));
    }
    public static int[][] smartphoneSales (int[][] matrix) {
       int counter = 0;
        for (int[] ints : matrix) {
            if (counter <= ints[0])
                counter = ints[0];
        }
        int[][] sales = new int[counter][2];
        for (int col = 0; col < matrix.length; col++) {
            for (int[] ints : matrix) {
                if (ints[0] == col + 1) {
                    sales[col][0] = col + 1;
                    sales[col][1] += ints[1];

                }
            }
        }
              /*  sales [col][0] = matrix[col][0];
                sales [col][1] = matrix[col][1];
                for (int col2 = col + 1; col2 < matrix.length; col2++) {
                if (matrix[col][0] == matrix [col2][0] ){
                    sales [col][1] += matrix[col2][1];
                }

            }
            } */

            return sales;
        }
    }
