package Übung.LV1;

public class ZinsDemo {
    public static void main(String[] args) {


        double kontostand = 1000;
        double zinsen = 2.25;
        System.out.println("zinsberechnung(kontostand,zinsen) = " + zinsberechnung(kontostand,zinsen));
    }

    public static double zinsberechnung(double kontostand, double zinsen){
        return zinsen * kontostand / 100;
    }
}