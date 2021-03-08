public class TemperarureDemo {
    public static void main(String[] args) {

        double temperatureCesliusCampus = 11.8;
        double temperatureCelsiusKapfenberg = 4.8;

        double fahrenheitCampus = celsiusToFahrenheit(temperatureCesliusCampus);
        double fahrenheitKapfenberg = celsiusToFahrenheit(temperatureCelsiusKapfenberg);
        System.out.println("fahrenheitKapfenberg = " + fahrenheitKapfenberg);
        System.out.println("fahrenheitCampus = " + fahrenheitCampus);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double result = celsius * 1.8 + 32;
        return result;
    }

    public static double fahrenheitTocelsius(double fahrenheit) {
        double result = (fahrenheit - 32) / 1.8;
        return result;
    }
}