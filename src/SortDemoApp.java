import java.util.Arrays;

public class SortDemoApp {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3};


        System.out.println(Arrays.toString(arr));
        arrangeOrder(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
    public static void arrangeOrder(int[] number) {

            System.out.println("length = " + number.length);
            boolean hasChanged = true;
            while (hasChanged) {
                hasChanged = false;


                for (int i = 0; i < number.length - 1; i++) {
                    if (number[i] > number[i + 1]) {
                        int space = number[i];
                        number[i] = number[i + 1];
                        number[i + 1] = space;

                    }

                }
            }

        }


    }