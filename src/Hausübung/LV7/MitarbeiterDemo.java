package Hausübung.LV7;

public class MitarbeiterDemo {
    public static void main(String[] args) {
        Mitarbeiter hans = new Mitarbeiter();
        hans.vorname = "Hans";
        hans.nachname = "Müller";
        hans.mitarbeiternummer  = 8;
        hans.gehalt = 1600.45;
        hans.alter = 28;

        System.out.println("hans.monatsAbrechung(hans.gehalt) = " + hans.monatsAbrechung(hans.gehalt));
        System.out.println("hans.jahresAbrechnung(hans.gehalt) = " + hans.jahresAbrechnung(hans.gehalt));

    }
}
