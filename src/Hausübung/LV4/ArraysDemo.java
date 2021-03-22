package Hausübung.LV4;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] numbers = {4, 54, 78, 40, 90};
        printArray(numbers);
        System.out.println("containsNumber(numbers, 4) = " + containsNumber(numbers, 4));
        System.out.println("containsNumber(numbers, 2) = " + containsNumber(numbers, 2));
        System.out.println("calculateSum(numbers) = " + calculateSum(numbers));
        System.out.println(" reverse(numbers) = " + Arrays.toString(reverse(numbers)));
    }
    public static void printArray(int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }
    public static boolean containsNumber(int[] numbers, int n){
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] == n){
                return true;
            }

            }
        return false;
    }
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }
    public static int[] reverse(int[] numbers) {
int[] reverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers [numbers.length - i - 1];
        }
        return reverse;
    }

}
