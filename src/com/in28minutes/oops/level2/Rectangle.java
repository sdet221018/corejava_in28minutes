package com.in28minutes.oops.level2;

public class Rectangle {
    // State or Member Variables
    private int length, width;

    // Constructor or Creation
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Behaviour or Member Methods or Operations
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return (2*(length + width));
    }

    public String toString() {
        return String.format("Rectangle Length: %d Width: %d area: %d perimeter: %d" , length, width, area(), perimeter());
    }

}
