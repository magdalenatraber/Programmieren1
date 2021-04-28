package Übung.LV8;

public class smallestNumber {
    public static void main(String[] args) {
        int [] arr = {4, 7, 3, -9, 6, 0, -7};
        smallestNumber(arr);
        System.out.println("index of smallest number = " +smallestNumber(arr));
    }

    public static int smallestNumber(int [] ar) {
        int keep = ar[0];
        int counter = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < keep )
                keep = ar[i];
            counter = i;

        }
return counter;
    }
}
