package Hausübung.LV4;

public class CurrencyExchange {
    public static void main(String[] args) {
        System.out.println(" exchangeCurrency(\"HUF\", 2€) = " + exchangeCurrency("HUF", 2) + " HUF");
        System.out.println("exchangeCurrency(\"CAD\", 1€) = " + exchangeCurrency("CAD", 1) + " CAD");
        System.out.println("exchangeCurrency(\"SEK\", 1€) = " + exchangeCurrency("SEK", 1) + " SEK");
        System.out.println("exchangeCurrency(\"USD\", 1€) = " + exchangeCurrency("USD", 1) + " USD");
    }

    public static double exchangeCurrency(String currencyID, double value) {
        if (currencyID.equals("HUF")){
            value = value * 328.61;
            return value;
        }
        else
        if (currencyID.equals("SEK")){
            value = value * 10.76;
            return value;
        }
        else
        if (currencyID.equals("USD")){
            value = value * 1.12;
            return value;
        }
        else
        if (currencyID.equals("CAD")){
            value = value * 1.47;
            return value;
        }

return  value;
    }
}
