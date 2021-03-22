package Block3;

import java.io.OptionalDataException;
import java.util.Arrays;

public class Example1WithArray {
    public static void main(String[] args) {


        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 112, 58, 2, 2};

        System.out.println("arr.length = " + arr.length);


        System.out.println("The Smallest Number = " + findSmallestNumber(arr));


        System.out.println("Biggest Number = " + findBiggestNumber(arr));
        

        System.out.println("Sum = " + findSum(arr));


        System.out.println("average = " + findAverage(arr));
        System.out.println("Duplikate = " + Arrays.toString(findDuplicatedNumbers(arr)));
        System.out.println("Tripletts = " + Arrays.toString( findTriplettNumbers(arr)));
        }

public static int findSmallestNumber (int[] arr){
    int holdSmallestNumber = arr[0];
    for (int i = 0; i <= arr.length -1; i++) {

        if( holdSmallestNumber >= arr[i])
        {
            holdSmallestNumber = arr[i];
        }

    }
    return holdSmallestNumber;
}
    public static int findBiggestNumber (int[] arr) {
        int holdBiggestNumber = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {

            if (holdBiggestNumber <= arr[i]) {
                holdBiggestNumber = arr[i];
            }

        }
        return holdBiggestNumber;
    }
    public static int findSum (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static float findAverage (int[] arr) {

         float average = findSum(arr) / arr.length;
        return average;
    }

        // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)
        public static int [] findDuplicatedNumbers (int[] arr) {
            int counter = 0;
            for (int i = 0; i < arr.length - 1; i++) { // Anzahl der Duplikate


                for (int j = 1 + i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        counter++;
                        j = arr.length; // Abbruchkondition
                    }
                }
            }
            int[] duplikat = new int[counter];
            counter = 0;
            for (int i = 0; i < arr.length - 1; i++) { // Die Duplikate speichern


                for (int j = 1 + i; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        duplikat[counter] = arr[i];
                        counter++;
                        j = arr.length; // Abbruchkondition
                    }
                }
            }
            return duplikat;
        }
            public static int [] findTriplettNumbers (int[] arr ) {
                int counter = 0;
                for (int i = 0; i < arr.length - 1; i++) { // Anzahl der Duplikate


                    for (int j = 1 + i; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            counter++;
                            j = arr.length; // Abbruchkondition
                        }
                    }
                }
                int[] duplikat = new int[counter];
                counter = 0;
                for (int i = 0; i < arr.length - 1; i++) { // Die Duplikate speichern


                    for (int j = 1 + i; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            duplikat[counter] = arr[i];
                            counter++;
                            j = arr.length; // Abbruchkondition
                        }
                    }
                }


                counter = 0;
                for (int i = 0; i < duplikat.length - 1; i++) { // Anzahl der Duplikate


                    for (int j = 1 + i; j < duplikat.length; j++) {
                        if (duplikat[i] == duplikat[j]) {
                            counter++;
                            j = duplikat.length; // Abbruchkondition
                        }
                    }
                }
                int[] triplett = new int[counter];
                counter = 0;
                for (int i = 0; i < duplikat.length  - 1; i++) { // Die Duplikate speichern


                    for (int j = 1 + i; j < duplikat.length; j++) {
                        if (duplikat[i] == duplikat[j]) {
                            triplett[counter] = duplikat[i];
                            counter++;
                            j = duplikat.length; // Abbruchkondition
                        }
                    }
                }

       return triplett;
    }

}


