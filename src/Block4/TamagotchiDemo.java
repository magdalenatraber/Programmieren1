package Block4;

public class TamagotchiDemo {
    public static void main(String[] args) {


        Tamagochi blau = new Tamagochi();
        blau.x = 5;
        blau.y = 4;
        blau.foodlevel = 5;
      blau.feed(6);
        System.out.println(blau.x + ", " + blau.y + ", " + blau.foodlevel);
          }

}
