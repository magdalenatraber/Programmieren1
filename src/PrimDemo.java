public class PrimDemo {
    public static void main(String[] args) {
        System.out.println("isPrim(41) = " + isPrim(41));
        System.out.println("isPrim(4119991) = " + isPrim(4119991));
        System.out.println("isPrim(4119957) = " + isPrim(4119957));
        System.out.println("isPrim(4119954) = " + isPrim(4119954));



    }

    public static boolean isPrim(int number) {


        for (int checkValue = 2; checkValue < Math.sqrt(number); checkValue++) {
            if (number % checkValue == 0) {

                return false;
            }

        }

        return true;


    }
}

  
        
        
