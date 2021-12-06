package edu.ben.lab9;

public class Car {
           private String make;
           private String model;
           private String color;
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }


    public String toString(){
        return "Make:" + this.make + ", Model:" + this.model + ", Color:" + this.color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
}
