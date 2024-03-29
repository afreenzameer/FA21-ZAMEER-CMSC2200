package edu.ben.lab8;

public class HexConverter {
    public static void toDecimal(String... args) {
        for (String arg : args) {
            arg = arg.toUpperCase();
            validate(arg);
            System.out.println(convertHexToDecimal(arg));
        }
    }

    protected static void validate(String value) throws CustomInputException {
        char[] validChars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        for (char c : value.toCharArray()) {
            if (!contains(validChars, c)) {
                throw new CustomInputException(c + "is not a valid hexadecimal digit.");
            }
        }
    }

    protected static int convertHexToDecimal(String value) {
        int result = 0;
        String[] valueArray = value.split("");
        int p = valueArray.length - 1;
        for (String s : valueArray) {
            int coefficient;
            if (s.equals("A")) {
                coefficient = 10;
            } else if (s.equals("B")) {
                coefficient = 11;
            } else if (s.equals("C")) {
                coefficient = 12;
            } else if (s.equals("D")) {
                coefficient = 13;
            } else if (s.equals("E")) {
                coefficient = 14;
            } else if (s.equals("F")) {
                coefficient = 15;
            } else {
                coefficient = Integer.parseInt(s);
            }

            result += coefficient * Math.pow(16, p--);
        }
        return result;
    }


    private static boolean contains(char[] chars, char check) {
        for (char c : chars) {
            if (c == check) {
                return true;
            }
        }
        return false;
    }
}
