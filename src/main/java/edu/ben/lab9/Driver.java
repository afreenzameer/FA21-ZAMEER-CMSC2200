package edu.ben.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String... args) {
        File file = new File("C:/Users/Afree/Documents/cmsc2200/code/src/main/java/edu/ben/lab9/cars.csv");
        try {
            Scanner carsScanner = new Scanner(file);
            while (carsScanner.hasNext()) {
                String data = carsScanner.next();
                String[] cars = data.split(",");
                Car input = new Car(cars[0], cars[1], cars[2]);
                System.out.println(input);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

