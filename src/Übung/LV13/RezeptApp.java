package Übung.LV13;

public class RezeptApp {
    public static void main(String[] args) {
        Rezept pizza = new Rezept();
        pizza.anzahlPersonen = 4;
        pizza.zutatenName = new String[]{"Teig", "Tomaten", "Käse", "Basilikum"};
        pizza.zutaten = new double[][]{{500,1},{300,2},{200,3}, {10,1}};
        Rezept milchreis = new Rezept();
        milchreis.anzahlPersonen = 2 ;
        milchreis.zutatenName = new String[]{"Milch", "Reis", "Zucker"};
        milchreis.zutaten = new double[][]{{200,1},{100,3},{5,2.50}};
        Rezept salat = new Rezept();
        salat.anzahlPersonen = 1;
        salat.zutatenName = new String[]{"Salat", "Kernöl", "Essig"};
        salat.zutaten = new double[][]{{500,1},{50,10},{5,3.50}};
        System.out.println("pizza.allergisch(\"Käse\") = " + pizza.allergisch("Käse"));
        System.out.println("pizza.allergisch(\"Pfeffer\") = " + pizza.allergisch("Pfeffer"));
        System.out.println("pizza.laktoseFrei() = " + pizza.laktoseFrei());
        System.out.println("salat.laktoseFrei() = " + salat.laktoseFrei());
        System.out.println("milchreis.laktoseFrei() = " + milchreis.laktoseFrei());
        printMatrix(pizza.zutaten);
        System.out.println();
        printMatrix(milchreis.zutaten);
        System.out.println();
        printMatrix(salat.zutaten);
        System.out.println();
        System.out.println("pizza.kostet() = " + pizza.kostet());
        System.out.println("salat.kostet() = " + salat.kostet());
        System.out.println("milchreis.kostet() = " + milchreis.kostet());
        System.out.println();
        System.out.println("pizza.kostetProPerson() = " + pizza.kostetProPerson());
        System.out.println("salat.kostetProPerson() = " + salat.kostetProPerson());
        System.out.println("milchreis.kostetProPerson() = " + milchreis.kostetProPerson());
        System.out.println();
        pizza.aenderePersonen(1);
        System.out.println("pizza.anzahlPersonen = " + pizza.anzahlPersonen);
        printMatrix(pizza.zutaten);



    }
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
