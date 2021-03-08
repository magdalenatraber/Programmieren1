package HelloWorld;

public class Prüfsumme {
    public static void main(String[] args) {
        System.out.println("calcDigitSum( val: 541) = " + calcDigitSum( 541));
    }
    public static int calcDigitSum (int val){
        int ziffernsumme = 0;
        while ( val > 0) {
            ziffernsumme = ziffernsumme + (val % 10);
            val = val / 10;
        }
        return ziffernsumme;
    }

}
