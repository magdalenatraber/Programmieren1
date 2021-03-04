public class BruttoNetto {
    public static void main(String[] args) {
        float netPrize = 1000;
        int tax = 20;
        int maxTax = 50;
        
        double calculatedTax = netPrize * tax / 100;
        System.out.println("calculatedTax = " + calculatedTax);
        // 200
        boolean maxTaxExceeded = calculatedTax >= maxTax;
        System.out.println("maxTaxExceeded = " + maxTaxExceeded);
        
        double grossPrize = netPrize + calculatedTax;
        System.out.println("grossPrize = " + grossPrize);
                
        int n, MWST, b;

        n = 100;
        MWST = 20;
        b = n + n * MWST / 100;
        System.out.println("Brutto = Netto + MWST =" + b);
        


    }
}
