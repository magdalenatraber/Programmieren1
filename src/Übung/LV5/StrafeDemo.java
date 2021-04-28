package Übung.LV5;

public class StrafeDemo {
    public static void main(String[] args) {


        Strafe claus = new Strafe();
        claus.vorname = "Claus";
        claus.nachname = "Mayer";
        claus.kennzeichen = "425kw";
        claus.strafnummer = "12458";
        claus.strafe = 0;
        claus.anzahl = 0;

       claus.schnellfahren(0);
       claus.verbandspaket();
       claus.alcohol(0.7);
       claus.sonstiges(0);
        System.out.println(claus.vorname + " " + claus.nachname + " |Kennzeichen: " + claus.kennzeichen + " |Strafnummer: " + claus.strafnummer +
                " |Strafe = " +claus.strafe + " €" + " |Anzahl der Strafen: " + claus.anzahl);
        claus.getStrafe();
        System.out.println();
        Strafe kurt = new Strafe();
        kurt.vorname = "Kurt";
        kurt.nachname = "Gillhofer";
        kurt.kennzeichen = "478zu";
        kurt.strafnummer = "078232";
        kurt.strafe = 0;
        kurt.anzahl = 0;

        System.out.println(kurt.vorname + " " + kurt.nachname + " |Kennzeichen: " + kurt.kennzeichen + " |Strafnummer: " + kurt.strafnummer +
                " |Strafe = " +kurt.strafe + " €" + " |Anzahl der Strafen: " + kurt.anzahl);
        kurt.getStrafe();
    }
}