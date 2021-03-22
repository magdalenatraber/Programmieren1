package Hausübung.LV5;

public class Strafe {
    String vorname;
    String nachname;
    String kennzeichen;
    String strafnummer;
    double strafe;
    int anzahl;

    public void schnellfahren (int geschwindigkeitsüberschreitung){
        if (geschwindigkeitsüberschreitung == 0) {
        }
        else
        if (geschwindigkeitsüberschreitung <= 20) {
            strafe += 30.00;
            anzahl++;
        }
        else
        if (geschwindigkeitsüberschreitung <= 30) {
            strafe += 50.00;
            anzahl++;
        }
        else
        if (geschwindigkeitsüberschreitung <= 50) {
            strafe += 100.00;
            anzahl++;
        } else
        if (geschwindigkeitsüberschreitung <= 100) {
            strafe += 500.00;
            anzahl++;
        } else
        if (geschwindigkeitsüberschreitung > 100) {
            strafe += 1500.00;
            anzahl++;
        }

        }
        public void verbandspaket (){
        strafe += 25.00;
            anzahl++;
        }
    public void alcohol (double wert){
        if(wert < 0.5){
    }
    else
        if(wert <= 1.0){
            strafe += 100.00;
            anzahl++;
            anzahl++;
        }
        else
        if(wert <= 2.0){
            strafe += 400.00;
            anzahl++;
            anzahl++;
        }
        else
        if(wert <= 3.0){
            strafe += 1000.00;
            anzahl++;
            anzahl++;
        }
        else
        if(wert >= 3.0){
            strafe += 5000.00;
            anzahl++;
            anzahl++;
        }
        }
        public void sonstiges (double wert){
        if (wert > 0) {
            strafe += wert;
            anzahl++;
        }

        }
    public double getStrafe () {
        if (anzahl == 0){
            System.out.println("Sie haben " + anzahl + " Strafen begangen. Gratulation! ");
    }
    else
        if
        (anzahl == 1){
            strafe = strafe * 0.7;
            System.out.println("Sie haben " + anzahl + " Strafen begangen. Aufgrund dessen reduziert sich die Strafe um " +
                    "30 %. Die Gesamtstrafe beträgt "+ strafe +" €." );
    }
        else
        if (anzahl == 2){
            strafe = strafe * 0.8;
            System.out.println("Sie haben " + anzahl + " Strafen begangen. Aufgrund dessen reduziert sich die Strafe um " +
                    "20 %. Die Gesamtstrafe beträgt "+ strafe +" €." );
        }
        else
        if (anzahl == 3){
            strafe = strafe * 0.9;
            System.out.println("Sie haben " + anzahl + " Strafen begangen. Aufgrund dessen reduziert sich die Strafe um " +
                    "10 %. Die Gesamtstrafe beträgt "+ strafe +" €." );
        }
        else
        if (anzahl >= 4){
            strafe = strafe;
            System.out.println("Sie haben " + anzahl + " Strafen begangen. Aufgrund dessen reduziert sich die Strafe " +
                    "nicht. Die Gesamtstrafe beträgt " + strafe + " €." );
        }
    return strafe;
    }

        }
