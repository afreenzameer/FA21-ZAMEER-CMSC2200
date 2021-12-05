package edu.ben.lab7;

public class Square {

    private double sideLength;

    public Square(double sideLength) {
        setSideLength(sideLength);
    }

    public Square() {

    }

    public double getSideLength() {
        return this.sideLength;
    }

    public double area() {
        return this.sideLength * this.sideLength;
    }

    public double perimeter() {
        return (this.sideLength * 4);
    }

    public void setSideLength(double length) {
        if (length < 0) {
            System.out.println("Error: negative integers not allowed!");
            return;
        }
        this.sideLength = length;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square)) {
            return false;
        }
        Square oSquare = (Square) o;
        return this.sideLength == oSquare.sideLength;
    }
}
