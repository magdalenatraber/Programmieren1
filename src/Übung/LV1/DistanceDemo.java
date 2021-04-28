package Übung.LV1;

public class DistanceDemo {
    public static void main(String[] args) {
        int kilometerValue;
        System.out.println("kilometerToMiles(1) = " + kilometerToMiles(1));
        System.out.println("kilometerToMiles(2.53) = " + kilometerToMiles(2.5));
        System.out.println("kilometerToMiles(10.64) = " + kilometerToMiles(10));
        System.out.println("milesToKilometer() = " + milesToKilometer(0.621371));
        System.out.println("milesToKilometer(1.242742) = " + milesToKilometer(1.242742));

    }

    public static double kilometerToMiles(double kilometer) {
        return kilometer * 0.621371;
    }

    public static double milesToKilometer(double miles) {
        return miles/ 0.621371;
    }
}
