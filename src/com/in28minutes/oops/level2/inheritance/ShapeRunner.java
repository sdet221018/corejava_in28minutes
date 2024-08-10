package com.in28minutes.oops.level2.inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
//        Circle circle = new Circle("Circle", 5.0);
//        Rectangle rect = new Rectangle("Rectangle", 4.0, 6.0);
        Shape[] shapes = new Shape[]{new Circle("Circle", 5.0), new Rectangle("Rectangle", 4.0, 6.0)};

        for(Shape shape : shapes) {
//            shape.calculateArea();
            shape.displayInfo();
        }
    }
}
