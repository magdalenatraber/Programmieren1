public class LoopDemo {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 100) {
            counter = counter + 1;
            System.out.print(counter);
            if (counter % 2 == 0) {
                System.out.println(" pong");
            } else {
                System.out.println(" ping");
            }
        }
    }
}