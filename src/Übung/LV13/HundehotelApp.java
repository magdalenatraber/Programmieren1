package Übung.LV13;

import java.util.Arrays;

public class HundehotelApp {
    public static void main(String[] args) {
        Hund a = new Hund();
        Hund b = new Hund();
        Hund c = new Hund();
        a.name = "Strizzi";
        a.allergien = new String[] {"Nüsse", "Wurst"};
        b.name = "Strolchi";
        b.allergien = new String[]{"Sulfate", "Karotten"};
        c.name = "Hector";
        c.allergien = new String[]{"Weizen", "Gummi"};
        String[] besucherhunde = {"Strizzi", "Strolchi", "Hector"};
        String[] essenMo = {"Karotten", "Nüsse"};
        System.out.println("allergisch = " + Arrays.toString(a.hundeAllergie(besucherhunde,essenMo)));

    }
}
