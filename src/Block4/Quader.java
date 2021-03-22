package Block4;

public class Quader {
    double laenge;
    double breite;
    double hoehe;
    public double calcVolumen(){
        return laenge * breite * hoehe;
    }
    public double calcOberfleache(){
        return laenge * breite * 2 + hoehe * breite * 2 + hoehe * laenge * 2;
    }
}
