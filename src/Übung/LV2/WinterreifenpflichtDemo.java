package Übung.LV2;

public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
isWinterreifenPflicht(7,true); //true
isWinterreifenPflicht(3,false); //true
isWinterreifenPflicht(11,false);//false
isWinterreifenPflicht(12, true);//false
        isWinterreifenPflicht(7,false);

    }

    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn){
        if((temperatur < 10 && rutschigeFahrbahn) == true || temperatur < 4) {
            System.out.println("Bitte Winterreifen verwenden");
            return true;
        }
        /*else
            if (temperatur < 4)
                return true; */

        System.out.println("Winterreifen sind nicht erforderlich");
        return false;
    }
}
