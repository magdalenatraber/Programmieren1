package Block1;

public class BruttoNetto {
    public static void main(String[] args) {
        float netPrize = 249;
        int tax = -1;
        int maxTax = 50;
        int tax_class = 1;
        if (tax_class == 1) {
            tax = 20;
        } else if (tax_class == 2) {
            tax = 16;
        } else if (tax_class == 3) {
            tax = 8;
        } else {
            tax = 0;
            System.out.println("Steuerklasse unbekannt");
        }
        int schulnote = 4;
        int language = 2;
        if (schulnote == 1 && language == 1) {
            System.out.println("Sehr gut");
        } else if (schulnote == 2 && language == 1) {
            System.out.println("Gut");
        } else if (schulnote == 3 && language == 1) {
            System.out.println("Befriedigend");
        } else if (schulnote == 4 && language == 1) {
            System.out.println("Genügend");
        } else if (schulnote == 5 && language == 1) {
            System.out.println("Nicht Genügend");
        } else if (schulnote == 1 && language == 2) {
            System.out.println("A");
        } else if (schulnote == 2 && language == 2) {
            System.out.println("B");
        } else if (schulnote == 3 && language == 2) {
            System.out.println("C");
        } else if (schulnote == 4 && language == 2) {
            System.out.println("D");
        } else if (schulnote == 5 && language == 2) {
            System.out.println("F");
        } else {
            System.out.println("Falsche Note");
        }


        double calculatedTax = netPrize * tax / 100;
        System.out.println("calculatedTax = " + calculatedTax);
        // 200
        boolean maxTaxExceeded = calculatedTax >= maxTax;
        System.out.println("maxTaxExceeded = " + maxTaxExceeded);
        if (maxTaxExceeded == true) {
            System.out.println("Der maximale Steuerbetrag wurde erreicht; " + calculatedTax + " >= " + maxTax);
        } else {
            System.out.println("Der maximale Steuerbetrag wurde nicht erreicht. Folgender Betrag ist noch verfügbar:" + (maxTax - calculatedTax));
        }

        double grossPrize = netPrize + calculatedTax;
        System.out.println("grossPrize = " + grossPrize);

        int n, MWST, b;

        n = 100;
        MWST = 20;
        b = n + n * MWST / 100;
        System.out.println("Brutto = Netto + MWST =" + b);
        if (maxTaxExceeded == false) {
            System.out.println("juhu");
        }
        if (!maxTaxExceeded) {
            System.out.println("Juhu");
        }


        switch (tax_class) {
            case 1:
                tax = 20;
                break;
            case 2:
                tax = 16;
                break;
            case 3:
                tax = 8;
                break;
            default:
                tax = 0;
                System.out.println("Steuerklasse unbekannt");
        }
        printNameToGrade(1);
        printNameToGrade(2);
        printNameToGrade(3);
        printNameToGrade(4);

    }
public static void printNameToGrade(int grade){
        int language = 1;
            if (grade == 1 && language == 1) {
                System.out.println("Sehr gut");
            }
            else if (grade == 2 && language == 1) {
                System.out.println("Gut");
            }  else if (grade == 3 && language == 1) {
                System.out.println("Befriedigend");
            }  else if (grade == 4 && language == 1) {
                System.out.println("Genügend");
            }  else if (grade == 5 && language == 1) {
                System.out.println("Nicht Genügend");
            }
            else if (grade == 1 && language == 2) {
                System.out.println("A");
            }
            else if (grade == 2 && language == 2) {
                System.out.println("B");
            }  else if (grade == 3 && language == 2) {
                System.out.println("C");
            }  else if (grade == 4 && language == 2) {
                System.out.println("D");
            }  else if (grade == 5 && language == 2) {
                System.out.println("F");
            }
            else {
                System.out.println("Falsche Note");
            }

        }


    }

