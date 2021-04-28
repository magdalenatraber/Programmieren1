package Übung.LV8;

public class summeGegendiagonale {
    public static void main(String[] args) {
        int[][] arr = {{2,4,6,7},{3,4,5,8}, {4,4,6,7},{15,9,5,8}};
        printMatrix(arr);
        System.out.println("Summe der Gegendiagonale = " + sumConterDiagonale(arr));
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumConterDiagonale(int[][] twodim) {
       int sum = 0;
        for (int row = 0; row < twodim.length ; row++) {
            for (int col = 0; col < twodim[row].length; col++) {
                if (row + col == twodim.length - 1){
                   sum += twodim[row][col];
                    System.out.println("sum =" + sum);
                }
            }

        }
return sum;
    }
}
