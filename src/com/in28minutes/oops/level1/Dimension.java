package com.in28minutes.oops.level1;

public class Dimension {
    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    private int feet;
    private int inches;

    public Dimension(int inches) {
        //25/12 = 2
        //25 % 12 = 1

        //25 inches
        //12 inches = 1 foot
        //25 inches = 2 foot 1 inches

        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.

        //Dimension(int inches) - This constructor will take one parameter, inches (an integer), and it should convert the given inches into feet and inches.
        //If the input inches are less than 0, set feet and inches to -1 to indicate invalid input. One foot is equal to 12 inches.

        //25 inches
        //12 inches = 1 foot
        //25 inches = 2 foot 1 inches

        if(inches < 0) {
            this.feet = -1;
            this.inches = -1;
        }
//        else if (inches == 0 ) {
//            feet = 0;
//            this.inches = 0;
//        }
        else {
            this.feet = inches / 12;
            this.inches = inches % 12;
        }
    }

    public int getFeet() {
        // TODO: Return the value of feet.
//        getFeet() - This method should return the calculated feet from the constructor.
        return feet;
    }

    public int getInches() {
        // TODO: Return the value of inches.
//        getInches() - This method should return the remaining inches (less than 12) from the constructor.
        return inches;
    }
}