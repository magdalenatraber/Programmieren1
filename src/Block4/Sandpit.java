package Block4;

public class Sandpit {
    double length;
    double width;
    double heigth;
    String name;
    double price;

    public double calcVolume(){
        return length * width * heigth;
    }
    public void print(){
        System.out.println("Für " + name + " benötigen wir = " + calcVolume() + " m³ Sand. Kosten: " + price + " EUR");
    }
}
