package Block2;

public class Zinsesrechnung {
    public static void main(String[] args) {
    double result = calcInterests(1000, 1.5, 10);
        System.out.println("result = " + result);
    }
    public static double calcInterests  (double startCapital, double rates, int years){
        for (int i = 1; i <= years; i++) {
            double calc = startCapital * (1 + rates / 100.0);

            System.out.println("End of " + i + " year: " + startCapital + " ->" + calc);
        startCapital = calc;
        }

        return startCapital;
    }
}
