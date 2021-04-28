package Übung.LV4;

public class NarzisstischeZahlen {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {

        }
    }

    public static boolean narcissticNumbers(int number) {
    double sum = 0;
            while (number > 0) {
                int i = number % 10;
                sum = sum + Math.pow(i, 3);
                number = number / 10;
            }
                if (number == sum)
                    System.out.println(sum);
                return true;
            }

        }

