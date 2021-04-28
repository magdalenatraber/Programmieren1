package Übung.LV2;

public class NotenDemo {
    public static void main(String[] args) {
        System.out.println("getNotentext(95) = " + getNotentext(95));
        System.out.println("getNotentext(78) = " + getNotentext(78));
        System.out.println("getNotentext(60) = " + getNotentext(60));
        System.out.println("getNotentext(30) = " + getNotentext(30));

    }

    public static String getNotentext(int punkte){
        if (punkte >= 90)
            return "Sehr Gut";
        else
        if (punkte >= 78 && punkte <= 89)
            return "Gut";
        else
        if (punkte >= 65 && punkte <= 77)
            return "Befriedigend";
        else
        if (punkte >= 51 && punkte <= 64)
            return "Genügend";
        else
        if (punkte <= 50)
            return "Ungenügend";
        return "Error";
    }
}
