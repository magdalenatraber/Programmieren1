package Übung.LV3;

import java.util.Arrays;

public class ArrayOrdnenApp {
    public static void main(String[] args) {
        int[] arr = {5, 7,8, 9, 2, 1, 0};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        arrangeOrder(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
    public static void arrangeOrder(int[] number){
                for(int i = 0; i < number.length - 1;i++){
                        if (number[i] > number[i + 1]) {
                            int space = number[i];
                            number[i] = number[i + 1];
                            number[i + 1] = space;
                            i=-1;
                        }
                    }
                }
            }
            

