package Übung.LV3;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            if (i % 35 == 0)
                System.out.print("FizzBuzz , ");
            else
            if (i % 3 == 0)
                System.out.print("Fizz , ");
            else if (i % 5 == 0)
                System.out.print("Buzz , ");
            else
                System.out.print(i+ " , ");
            System.out.println();

            System.out.println("fizzbuzz(5) = " + fizzbuzz(5));
            System.out.println("fizzbuzz(3) = " + fizzbuzz(3));
            System.out.println("fizzbuzz(35) = " + fizzbuzz(35));
            System.out.println("fizzbuzz(7) = " + fizzbuzz(7));

            System.out.println("Arrays.toString(fizzbuzzToArray()) = " + Arrays.toString(fizzbuzzToArray()));

        }
    }
    public static String fizzbuzz(int zahl){
        if (zahl % 35 == 0)
            return "FizzBuzz";
        else
        if (zahl % 3 == 0)
            return "Fizz";
        else if (zahl % 5 == 0)
            return "Buzz";
        else
            return " " +zahl +"";
    }
    public static String[] fizzbuzzToArray() {
        String[] fizzbuzz = new String[101];
        for (int i = 1; i < fizzbuzz.length; i++) {
            if (i % 35 == 0)
                fizzbuzz[i] = "Fizzbuzz";
            else if (i % 3 == 0)
                fizzbuzz[i] = "Fizz";
            else if (i % 5 == 0)
                fizzbuzz[i] = "Buzz";
            else
                fizzbuzz[i] = ""+ i + "";

        }
        return fizzbuzz;
    }

}
