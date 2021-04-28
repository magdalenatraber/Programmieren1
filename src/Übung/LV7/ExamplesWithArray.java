package Übung.LV7;

import java.util.Arrays;

public class ExamplesWithArray { public static void main(String[] args) {


    int[] arr = {
            98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
            51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
            12, 29, 2, 17, 8, 0,-(52), -(1)};

    System.out.println("arr.length = " + arr.length);

    System.out.println("findSmallestNumber(arr) = " + findSmallestNumber(arr));
    System.out.println("average(arr) = " + average(arr));
    System.out.println("averageValue(arr) = " + averageValue(arr));
    System.out.println(Arrays.toString(arr));
    replace(arr,0,69);
    replace(arr,51,13);
    replace(arr,4,13);
    System.out.println(Arrays.toString(arr));
    extend(arr,5);
}

    // TODO 1: Write a method, finding and returning the smallest number
    public static int findSmallestNumber(int[] arr){
        int keep = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < keep) {
                keep = arr[i];
            }
        }
        return keep;
    }

    // TODO 2: Write a method, finding and returning the biggest number
    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
    // TODO 4: Write a method, calculating and returning the average over all numbers
    public static double average(int[] arr){
        double sum = 0.00;

        for (int i = 0; i < arr.length; i++){
                sum += arr[i];
            }
        return sum / arr.length;
    }

    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)

    // TODO 6: Write a method, to calculate the average over all values (think about datatype)
    public static double averageValue(int[] arr){
    double average =0.00;
    int totNumbers = arr.length;

        for (int i = 0; i < arr.length; i++) {
         if (arr[i] > 0)
            average += arr[i];
        else
        if (arr[i] == 0)
            totNumbers -= 1;
        else
        if (arr[i] < 0) {
            arr[i] = arr[i] * -1;
            average = average + arr[i];
        }
    }
        return average/ totNumbers;
    }
    // TODO 7: Write a method, which replaces one number by a new new number => public static void replace(int searchNumber, int newNumber)
    public static void replace(int[] arr, int searchNumber, int newNumber){
        for (int i = 0; i < arr.length; i++) {
            if (searchNumber == arr[i]){
                arr[i] = newNumber;
            }
            
        }
    
    }
    // TODO 8 (complicated): Write a method which extends an array by one number. You need to create a new array with a length + 1 and copy existing values to array and add the new number at end
public static void extend(int[] arr, int newNumber){
    int[] arrNew = new int[arr.length + 1];
    for (int i = 0; i < arr.length + 2; i++) {
        if (i < arr.length) {
            arrNew[i] = arr[i];
        }
        else
            if (i == arr.length)
                arrNew[i] = newNumber;
            }
        System.out.println(" arrNew = " + Arrays.toString(arrNew));




}



}
