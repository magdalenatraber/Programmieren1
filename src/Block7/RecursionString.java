package Block7;

import javax.swing.*;

public class RecursionString {
    public static void main(String[] args) {
        System.out.println(containString("David Hasselhoff","Dav"));
        System.out.println(containString("David Hasselhoff","Hass"));
        System.out.println(containString("David Hasselhoff","v"));
        System.out.println(containString("David Hasselhoff","Haus"));
        System.out.println(containString("David Hasselhoffu","u"));
        System.out.println(containString(""," "));
        System.out.println(containString("David Hasselhoff",null));

    }

    public static boolean containString (String full, String part) {
        if (full == null || part == null ){
            return false;
        }
        else
        if (full.startsWith(part)){
            return true;
        }
        else
        if (!full.startsWith(part) && full.length() != 0){
            System.out.println(full);
            return containString(full.substring(1), part);
        }
        return false;
    }
}
