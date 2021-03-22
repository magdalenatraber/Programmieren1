package Block2;

public class FindFactorDemo {
    public static void main(String[] args) {
        int number;

        findFactors(21);
        findFactors(10);
    }
    public static void findFactors(int number){

        System.out.println("Faktoren für" + number);
        int counter = 1;
        while (counter <= number){
        if (number % counter == 0) {
            System.out.print(counter+" ");
        }
        counter ++;
        }
        System.out.println();
    }

}
