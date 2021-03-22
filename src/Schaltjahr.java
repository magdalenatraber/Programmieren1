public class Schaltjahr {
    public static void main(String[] args) {
        for (int year = 1; year <= 2100; year++) {

            isLeapYear(year);
        }
    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && !(year % 100 == 0) ) {

                System.out.println(year + "= Schaltjahr");
            }
        if(year % 400 == 0){
            System.out.println(year + " = Schaltjahr");
        }
        }
    }
