package edu.ben.lab6;

import edu.ben.lab3.Math;
import edu.ben.lab5.StringUtils;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;
        String myInput;
        while (running) {
            System.out.print("Enter a command (ADD, SUBTRACT, MULTIPLY, EXPONENTIATE, SUM, REVERSE, EXIT):");
            myInput = input.next();
            switch (myInput) {
                case "ADD":
                    int augend, addend, add;
                    System.out.println("Enter first number");
                    augend = input.nextInt();
                    System.out.println("Enter second number");
                    addend = input.nextInt();
                    System.out.println("The sum of your numbers is " + (Math.add(augend, addend)));
                    break;
                case "SUBTRACT":
                    int minuend, subtrahend, subtract;
                    System.out.println("Enter first number");
                    minuend = input.nextInt();
                    System.out.println("Enter second number");
                    subtrahend = input.nextInt();
                    System.out.println("The difference of your numbers is " + (Math.subtract(minuend, subtrahend)));
                    break;
                case "MULTIPLY":
                    int multiplier, multiplicand, multiply;
                    System.out.println("Enter first number");
                    multiplier = input.nextInt();
                    System.out.println("Enter second number");
                    multiplicand = input.nextInt();
                    System.out.println("The product of your numbers is " + (Math.multiply(multiplier, multiplicand)));
                    break;
                case "EXPONENTIATE":
                    int base, power, exponentiate;
                    System.out.println("Enter first number");
                    base = input.nextInt();
                    System.out.println("Enter second number");
                    power = input.nextInt();
                    System.out.println("The exponential value of your numbers is " + (Math.exponentiate(base, power)));
                    break;
                case "SUM":
                    System.out.println("Enter comma separated numbers:");
                    String a = input.nextLine();
                    String number = input.nextLine();
                    String[] myArray = number.split(",");
                    int[] myIntArray = new int[myArray.length];
                    for (int i = 0; i < myArray.length; i++) {
                        myIntArray[i] = Integer.parseInt(myArray[i]);
                    }
                    System.out.println(Math.sum(myIntArray));
                    break;
                case "REVERSE":
                    System.out.println("Enter a comma separated string:");
                    String s = input.nextLine();
                    String word = input.nextLine();
                    String[] wordArray = word.split(",");
                    System.out.println((((Arrays.toString(StringUtils.reverseAll(wordArray))))));
                    break;
                case "EXIT":
                    running = false;
                    continue;
                default:
                    System.out.println("error");
                    break;

            }
        }
    }
}
