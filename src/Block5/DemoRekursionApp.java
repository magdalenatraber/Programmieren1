package Block5;

import java.util.Locale;

public class DemoRekursionApp {
    public static void main(String[] args) {
        System.out.println("isPalindrom(\"Otto\") = " + isPalindrom("Otto"));
        System.out.println("isPalindrom(\"1122332211\") = " + isPalindrom("1122332211"));
        System.out.println("isPalindrom(\"Was it a car or a cat i saw\") = " + isPalindrom("Was it a car or a cat i saw"));
        System.out.println("isPalindrom(\"Was it a car or a at i saw\") = " + isPalindrom("Was it a car or a at i saw"));


    }

    public static boolean isPalindrom(String text) {

        text = text.toLowerCase();
        text = text.replace(" ","");
        char firstCharacter = text.charAt(0);
        char lastCharacter = text.charAt(text.length() - 1);

      //  System.out.println("firstCharacter = " + firstCharacter);
        // System.out.println("lastCharacter = " + lastCharacter);

        if (firstCharacter == lastCharacter) {
            text = text.substring(1, text.length() - 1);

            if (text.length() <= 1)
                return true;
            return isPalindrom(text);
        }
        return false;
    }
}
