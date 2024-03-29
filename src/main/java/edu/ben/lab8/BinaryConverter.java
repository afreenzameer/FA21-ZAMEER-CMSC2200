package edu.ben.lab8;

public class BinaryConverter {
    public static void toDecimal(String... args) {
        for (String arg : args) {
            validate(arg);
            System.out.println(convertBinaryToDecimal(arg));
        }
    }

    protected static void validate(String value) throws CustomInputException {
        char[] validChars = new char[]{'0', '1'};
        for (char c : value.toCharArray()) {
            if (!contains(validChars, c)) {
                throw new CustomInputException(c + "is not a valid binary digit.");
            }
        }
    }

    protected static int convertBinaryToDecimal(String value) {
        int result = 0;
        String[] valueArray = value.split("");
        int p = valueArray.length - 1;
        for (String s : valueArray) {
            int coefficient;
            coefficient = Integer.parseInt(s);
            result += coefficient * Math.pow(2, p--);
        }
        return result;


    }
    
    private static boolean contains(char[] chars, char check){
        for (char c : chars) {
            if (c == check) {
                return true;
            }
        }
        return false;
    }
}
