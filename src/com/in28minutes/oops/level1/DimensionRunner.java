package com.in28minutes.oops.level1;

public class DimensionRunner {

    public static void main(String[] args) {

        Dimension dim = new Dimension(25);
        System.out.println("Given Inches: 25 is equivalent to: ");
        System.out.print(dim.getFeet() + " Feet and ");
        System.out.print(dim.getInches() + " Inches");

        Dimension dim1 = new Dimension(-1);
        System.out.println("\n\nGiven Inches: -1 is equivalent to: ");
        System.out.print(dim1.getFeet() + " Feet and ");
        System.out.print(dim1.getInches() + " Inches");

        Dimension dim0 = new Dimension(0);
        System.out.println("\n\nGiven Inches: 0 is equivalent to: ");
        System.out.print(dim0.getFeet() + " Feet and ");
        System.out.print(dim0.getInches() + " Inches");
    }
}
