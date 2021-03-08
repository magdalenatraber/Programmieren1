public class DistanceDemo {


    public static void main(String[] args) {
        int kilometerValue = 12;
        double miles = kilometerToMiles(kilometerValue);


        System.out.println(kilometerValue + " Kilometer sind " + miles + " Meilen.");

        int mileValue = 12;
        double kilometer = milesToKilometer(mileValue);


        System.out.println(mileValue + "Meilen sind " + kilometer + " Kilometer.");

    }

    public static double kilometerToMiles(int kilometer) {

        double result = kilometer * 0.621;
        return result;
    }
    public static double milesToKilometer (int miles2) {

        double result2 = miles2 * 1.60934;
        return result2;
}
}