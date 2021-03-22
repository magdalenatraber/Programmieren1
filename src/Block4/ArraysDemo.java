package Block4;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {4, 52, 82, 95, 78, 76, 20, 2, 4};
        printArray(numbers);
        System.out.println();
        System.out.println("containsNumber(numbers, 2) = " + containsNumber(numbers, 2));
        System.out.println("containsNumber(numbers, 3) = " + containsNumber(numbers, 3));
        System.out.println("Sum = " + calculateSum(numbers));
        System.out.println(Arrays.toString(reverse(numbers)));
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");

        }
    }

    public static boolean containsNumber(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (n == numbers[i]) {
                return true;
            }

        }
        return false;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static int[] reverse (int[] numbers){
        int[] result = new int[numbers.length];
       
        for (int i = 0; i < numbers.length; i++) {
            int newIndex = numbers.length - 1 - i;
            result[newIndex] = numbers[i];
        }
        return result;
    }
}