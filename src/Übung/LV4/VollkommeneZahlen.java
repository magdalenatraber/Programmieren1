package Übung.LV4;

public class VollkommeneZahlen {
    public static void main(String[] args) {

        for (int number = 1; number <= 100_000; number++) {
            int sum = 0;
            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0)
                    sum += i;
            }
            if (sum == number) {
                System.out.println("Vollkommene Zahl = " + number);
            }
        }
    }
}