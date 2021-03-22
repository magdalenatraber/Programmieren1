package Block5;

public class Count99to0 {
    public static void main(String[] args) {
        reduce(99, 7);

    }
    public static void reduce(int value, int stopvalue){
        System.out.println(value);

            if(value == 0 || value == stopvalue){
return;
            }

reduce(value -1,stopvalue);

            }
    }

