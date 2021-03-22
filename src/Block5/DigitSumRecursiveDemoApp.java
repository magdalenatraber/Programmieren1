package Block5;

public class DigitSumRecursiveDemoApp {
    public static void main(String[] args) {
        System.out.println("getDigitSum(1245) = " + getDigitSum(1245));
        System.out.println("power(4, 1) = " + power(4, 1));
        System.out.println("power(5, 2) = " + power(5, 2));
        System.out.println("power(2, 8) = " + power(2, 8));
        System.out.println("power(3, 3) = " + power(-3, 3));
        System.out.println("multiplicate(4,8) = " + multiplicate(4,8));
    }


    /*   public static int getDigitSum(int number){
           int sum = 0;
           while (number > 0){
               sum = sum + number % 10;
               number = number / 10;
           }
           return sum;
       } */
    public static int getDigitSum(int number) {
        if (number < 10)
            return number;
        else {
            int lastNumber = number % 10;
            number = number / 10;
            return lastNumber + getDigitSum(number);

        }


    }
    public  static  int power(int a, int b){
        if (b <= 1) return a;
        return a * power(a, b-1);
        }
    public  static  int multiplicate(int a, int b){
        if (b >= 1 && a >= 1)
            return a + multiplicate(a,b-1);

        return 0;
    }


}
