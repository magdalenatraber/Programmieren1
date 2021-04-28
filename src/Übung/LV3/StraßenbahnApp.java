package Übung.LV3;

public class StraßenbahnApp {
    public static void main(String[] args) {
        System.out.println("dauer(6) = " + dauer(6) +"min");
        System.out.println("dauer(3) = " + dauer(3) +"min");
        System.out.println("dauer(4) = " + dauer(4) +"min");
        System.out.println("baustelle(4,10) = " + baustelle(4,10));
    }
    public static int dauer(int station){
        if (station == 1)
            return 20;
        else
        if (station == 2)
            return 16;
        else
            if (station == 3)
            return 15;
        else
            if (station == 4)
                return 10;
            else
            if (station == 5)
                return 3;
            else
            if (station == 6)
                System.out.println("Bitte hier aussteigen!");
                return 0;
    }

    public static int baustelle(int station, int dauer) {
int baust = dauer(station) + dauer;
return baust;
    }
}
