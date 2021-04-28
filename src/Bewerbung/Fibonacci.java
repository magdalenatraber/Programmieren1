package Bewerbung;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(0,1);

    }

    public static void fibonacci(int a, int b) {
        if (a > 100) {
            System.out.print(a + " , " + b + " , ");
        }
        else if (a <= 0) {
            System.out.print(a + " , " + b + " , ");
            fibonacci(a + b,b + a + b);
        }
        else {
            System.out.print(a + " , " + b + " , ");
            fibonacci(a + b, b + a + b );

        }


    }
}
