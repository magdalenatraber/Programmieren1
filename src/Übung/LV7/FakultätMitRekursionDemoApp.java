package Übung.LV7;

public class FakultätMitRekursionDemoApp {
    public static void main(String[] args) {
        System.out.println("fakt(1) = " + fakt(1));
        System.out.println("fakt(5) = " + fakt(5));
        System.out.println("fakt(2) = " + fakt(2));
        System.out.println("fakt(0) = " + fakt(0));
        System.out.println("fakt(7) = " + fakt(7));
    }

    public static long fakt(long fakultät) {

        if (fakultät < 1) return 1;

        else if (fakultät <= 1)
            return fakultät;
        else
            return fakultät * fakt(fakultät - 1); // Bsp. 7 * 6 * 5 ....


    }
}

