package edu.ben.lab3;

public class Math {

    public static int add(int augend, int addend) {
        return augend + addend;
    }

    public static int sum(int... summands) {
        int sum = 0;
        for (int x : summands) {
            sum = add(sum, x);
        }
        return sum;
    }


    public static int multiply(int multiplier, int multiplicand) {
        return multiplier * multiplicand;
    }

    public static int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public static int exponentiate(int base, int power) {
        int result = base;

        for (int i = 0; i < power - 1 ; i++) {
            result = multiply(result, base);
        }
        return result;
    }
}
