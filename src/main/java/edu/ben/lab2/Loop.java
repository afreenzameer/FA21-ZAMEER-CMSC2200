package edu.ben.lab2;

public class Loop {
    public static void main(String... args) {
        System.out.println(myForLoop(5));
        System.out.println(myEnhancedForLoop(6));

    }

    private static int myForLoop(int[] values) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int values = 5; values > 5; values++) {
            System.out.println(values);
        }

    }

    private static int myEnhancedForLoop(int[] value) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int value : numbers) {
            if (value % 3 != 0)
                continue;
            System.out.println(value);
        }
    }

    private static int myWhileLoop(int[] values) {
        int i = 5;
        while (i <= 50) {
            System.out.println(i);
            i++;
        }
    }

}
