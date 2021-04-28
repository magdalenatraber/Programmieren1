package Übung.LV2;

public class TurmDemo {
    public static void main(String[] args) {
        int zahl = 58;
        System.out.println("zahl = " + zahl);
        turmrechnen(zahl);
    }
     public static void turmrechnen(int zahl){
        for (int i = 2; i <10; i++) {
            System.out.print(zahl +"*" + i + "= ");
            zahl = zahl * i;
            System.out.print(zahl);
            System.out.println();
        }
        for (int i = 2; i < 10 ; i++) {
            System.out.print(zahl +"/" + i + "= ");
            zahl = zahl / i;
            System.out.print(zahl);
            System.out.println();
        }
    }
}
