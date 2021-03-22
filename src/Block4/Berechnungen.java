package Block4;

public class Berechnungen {
    public static void main(String[] args) {
        Rechteck blau = new Rechteck();
                blau.breite = 4.0;
        blau.laenge = 3.0;
        System.out.println("Flaeche() = " + blau.calcFlaeche());
        System.out.println("Diagonale() = " + blau.calcDiagonale());
        
        Quader rot = new Quader();
        rot.hoehe = 4.0;
        rot.laenge = 3.0;
        rot.breite = 5.0;
        System.out.println("rot.calcVolumen() = " + rot.calcVolumen());
        System.out.println("Oberfläche = " + rot.calcOberfleache());
    }
}
