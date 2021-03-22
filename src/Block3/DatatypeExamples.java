package Block3;

public class DatatypeExamples {

    public static void main(String[] args) {
        System.out.println("Einige Beispiele zu Datentypen");

        int laenge;
        int breite;
        int ergebnis;
        int ergebnis1;
        int ergebnis2;
        int ergebnis3;
        int ergebnis4;
        int ergebnis5;


        laenge = 5;
        breite = 7;

        ergebnis = laenge * breite;

        System.out.println("Die Fläche lautet: " + ergebnis + "cm²");
        
        int a, b,c;
        a = 4;
        b = 5;

        
        ergebnis1 = a + b;
        System.out.println("a + b = 4 + 5 =" + ergebnis1);

        a = 11;
        b = 3;
        ergebnis2 = a - b;
        System.out.println("a - b = 11 - 3 =" + ergebnis2);

        a = 3;
        b = 5;
        ergebnis3 = a * b;
        System.out.println("a * b = 3 * 5 =" + ergebnis3);
        a = 7;
        b = 3;
        ergebnis4 = a / b;
        System.out.println("a / b = 7 /3 =" + ergebnis4);
        a = 1;
        b = 2;

        ergebnis5 = a % b;
        System.out.println("a % b = 1 % 2 = " + ergebnis5);
        // float x, y, result2; => kein modulo
        double x = 5, y = 3;
        System.out.println("x + y  = " + x + " + " + y + " = " + (x + y));
        System.out.println("x - y  = " + x + " - " + y + " = " + (x - y));
        System.out.println("x * y  = " + x + " * " + y + " = " + (x * y));
        System.out.println("x / y  = " + x + " / " + y + " = " + (x / y));
    }
}
