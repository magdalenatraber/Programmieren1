package Übung.LV7;

public class Mitarbeiter {
    String vorname;
    String nachname;
    int mitarbeiternummer;
    double gehalt;
    int alter;

    public double monatsAbrechung(double gehalt){
       double gehaltsabrechnung = gehalt * 0.8;
        System.out.println(gehaltsabrechnung);
        if (gehaltsabrechnung * 12 < 10_000){
            gehaltsabrechnung = gehaltsabrechnung * 0.9;
        }
else
        if (gehaltsabrechnung * 12 < 20_000 && gehaltsabrechnung * 12 > 10_000 ){
            gehaltsabrechnung = gehaltsabrechnung * 0.8;
        }
        else
        if (gehaltsabrechnung * 12 < 30_000 && gehaltsabrechnung * 12 > 20_000 ){
            gehaltsabrechnung = gehaltsabrechnung * 0.68;
        }
        else
        if (gehaltsabrechnung * 12 < 50_000 && gehaltsabrechnung * 12 > 30_000 ){
            gehaltsabrechnung = gehaltsabrechnung * 0.55;
        }
        else
        if (gehaltsabrechnung * 12 > 50_000){
            gehaltsabrechnung = gehaltsabrechnung * 0.40;
        }

        return gehaltsabrechnung;

    }
    public double jahresAbrechnung(double gehaltsabrechnung){
        return monatsAbrechung(gehaltsabrechnung) * 12;
    }

}