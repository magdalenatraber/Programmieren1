package HelloWorld;

import java.util.Arrays;

public class Fizzbuzz {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 100; i++) {
            if (arr[i] % 5 == 0 & arr[i] % 7 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(arr[i] % 5 == 0) {
                System.out.println("Fizz");

            }
            else if(arr[i] % 7 == 0) {
                System.out.println( "Buzz");
            }
            else {
                    System.out.println(i+1);
                }
        }



    }

    public static int fizzbuzz(int arr[]){
                int bla = 0;
                return bla;
            }
}


