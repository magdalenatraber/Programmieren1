public class LoopTeilen {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 500) {
            counter ++;
            if (counter % 3 == 0) {
                System.out.println(counter);
            } else if (counter % 5 == 0) {
                System.out.println(counter);
            } else if(counter % 7 == 0) {
                System.out.println(counter);

            }
        }
    }
}