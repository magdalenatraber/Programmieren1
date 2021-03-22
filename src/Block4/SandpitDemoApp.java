package Block4;

public class SandpitDemoApp {
    public static void main(String[] args) {
        double l =1.4;
        double w = 1.4;
        double h = 0.2;
        String name = "Homemade Sandpit";
        double price =0;
        System.out.println("Für " + name + " benötigen wir = " + calcVolume(l, w, h) + " m³ Sand. Kosten: " + price + " EUR");
        
        
        Sandpit homeMAde = new Sandpit();
        Sandpit bauhaus = new Sandpit();
        Sandpit wikey = new Sandpit();
        
        homeMAde.length =1.6;
        homeMAde.width =1.6;
        homeMAde.heigth =1.6;
        homeMAde.name = "Selbstgebaut";
        homeMAde.price =0;

        System.out.println("homeMAde.calcVolume() = " + homeMAde.calcVolume());
        System.out.println("homeMAde = " + homeMAde.name);
        
        bauhaus.length =1.6;
        bauhaus.width =1.7;
        bauhaus.heigth =0.5;
        bauhaus.name = "Bauhaus Sandkasten";
        bauhaus.price =60;
   

        wikey.length =2.0;
        wikey.width =1.8;
        wikey.heigth =0.6;
        wikey.name = "Wikey Sandkasten";
        wikey.price =200;

        homeMAde.print();
        bauhaus.print();
        wikey.print();
    }
    public static double calcVolume (double length, double width, double height){
        return length * width * height;
    }
}
