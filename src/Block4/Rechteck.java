package Block4;

public class Rechteck {
    double laenge;
    double breite;
    public double calcFlaeche(){
        return laenge * breite;
    }
    public double calcDiagonale(){
        return Math.sqrt(Math.pow(laenge, 2) + Math.pow(breite, 2));
    }

}
