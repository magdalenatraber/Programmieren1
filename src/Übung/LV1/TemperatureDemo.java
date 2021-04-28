package Übung.LV1;

public class TemperatureDemo {
    public static void main(String[] args) {
        double currentTemperatureCelsius = -1;
        System.out.println("celsiusToFahrenheit(currentTemperatureCelsius) = " + celsiusToFahrenheit(currentTemperatureCelsius));
        System.out.println("fahrenheitToCelsius(30.2) = " + fahrenheitToCelsius(30.2));
    }
    public static double celsiusToFahrenheit(double celsius){
      return celsius * 1.8 + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) /1.8;
    } 
}
