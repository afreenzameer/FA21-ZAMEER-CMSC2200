package edu.ben.lab5;

public class StringUtils {

    public static boolean isEmpty(String phrase) {
        if (phrase == null || phrase == "") {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isBlank(String phrase) {
        if (isEmpty(phrase)) {
            return true;
        }
        for (char c : phrase.toCharArray()) {
            System.out.println(c);
        }
        return false;

    }

    public static String reverse(String phrase) {

        String reversedString = "";
        char[] chars = phrase.toCharArray();
        for (int c = chars.length - 1; c >= 0; c--) {
            reversedString += chars[c];
        }
        return reversedString;

    }

    public static String[] reverseAll(String... phrases) {
        String[] reversedAll = new String[phrases.length];
        for (int i = 0; i < phrases.length; i++) {
            reversedAll[i] = reverse(phrases[i]);
        }
        return reversedAll;
    }

}
