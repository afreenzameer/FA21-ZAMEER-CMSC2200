package edu.ben.lab2;

public class Variable {
    public static void main(String[] args) {

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }


        byte b1 = 122;
        short s1 = -30000;
        int i1 = 1;
        long l1 = 500L;
        float f1 = 56.0F;
        double d1 = 467.0D;
        boolean bo1 = false;
        char c1 = 'Z';
        String str1 = "afreen";

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(bo1);
        System.out.println(c1);
        System.out.println(str1);
    }


}