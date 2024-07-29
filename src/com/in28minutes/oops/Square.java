package com.in28minutes.oops;

public class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        // Implement the Square constructor.
        // This constructor should take an integer argument and
        // initialize the side attribute with the value of this argument.
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        // Implement the calculateArea() method.
        // If the side attribute is less than or equal to zero, return -1.
        // Otherwise, calculate and return the area of the square using the formula: side * side.
        if (side <= 0) {
            return -1;
        }
        else
            return side * side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        // Implement the calculatePerimeter() method.
        // If the side attribute is less than or equal to zero, return -1.
        // Otherwise, calculate and return the perimeter of the square using the formula: 4 * side.
        if (side <= 0) {
            return -1;
        }
        else
            return 4 * side;
    }

}
