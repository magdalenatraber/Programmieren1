package Übung.LV13;

public class Rezept {
    int anzahlPersonen;
    String[] zutatenName;
    double[][] zutaten;

    public boolean allergisch(String zutat) {
        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].equals(zutat)) {
                return true;
            }
        }
        return false;
    }

    public boolean laktoseFrei() {
        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].equals("Milch") || zutatenName[i].equals("Käse")) {
                zutaten[i][0] = 0;
                zutaten[i][1] = 0;
                return true;
            }
        }

        return false;
    }

    public double kostet() {
        double kosten = 0;
        for (int i = 0; i < zutatenName.length; i++) {
            kosten += zutaten[i][1];

        }
        return kosten;
    }

    public double kostetProPerson() {
        return kostet() / anzahlPersonen;
    }

    public void aenderePersonen(int anzahl) {
if (anzahl > 0){
        for (int i = 0; i < zutatenName.length; i++) {
            zutaten[i][0] = zutaten[i][0] / anzahlPersonen * anzahl;
            zutaten[i][1] = zutaten[i][1] / anzahlPersonen * anzahl;
        }
        anzahlPersonen = anzahl;
    }

}
}