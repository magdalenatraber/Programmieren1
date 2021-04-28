package Übung.LV13;

public class Hund {
    String name;
    String [] allergien;

    public String[] hundeAllergie(String[] hunde, String[] zutaten){
        String[] allergieHunde = new String[hunde.length];
Hund hund = new Hund();
        for (int i = 0; i < hunde.length; i++) {
if(hunde[i].equals(name)){
    hund = null;
    for (int j = 0; j < zutaten.length; j++) {
        if(zutaten[j].equals(hund.allergien)){
            allergieHunde[i] = hunde[i];
        }
    }

    }
            return allergieHunde;

        }
        return allergieHunde;

    }


}
