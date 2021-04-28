package Block6;

public class ArrayDemo {
    public static void main(String[] args) {


        int[] arr1 = {45, 65, 30};
        int[] arr2 = {44, 55, 71};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + arr2[i] + " , ");

        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] * arr2[i] + " , ");

        }
    }
}
