package com.in28minutes.oops;

import static java.lang.Math.sqrt;

// Defining a Point class to represent a point in 2-dimensional space
public class Point {

    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    // TODO: Implement the method to move the point by dx and dy in x and y direction respectively
    public void move(int dx, int dy) {
        // Your code here
        // This method adjusts the current position of the point in the 2-dimensional space.
        // The parameters dx and dy represent the changes in x-coordinate and y-coordinate respectively.
        // After calling this method, the new coordinates of the point should be (current x + dx, current y + dy).
        // Example: If we have a point at (3, 4) and call the move method with arguments 1 and 2, the new coordinates of the point should be (3+1, 4+2) i.e., (4, 6).

        setX(this.x+dx);
        setY(this.y+dy);

//        this.x += dx;
//        this.y += dy;
    }

    // TODO: Implement the method to calculate the distance from this point to another point
    public double distanceTo(Point other) {
        // This method calculates and returns the Euclidean distance between the current point and another point other.
        // The Euclidean distance d between two points (x1, y1) and (x2, y2) is calculated as:
        // d = sqrt((x2-x1)^2 + (y2-y1)^2).
        // Example: If we have a point at (3, 4) and want to calculate the distance to another point at (6, 8),
        // the distance should be sqrt((6-3)^2 + (8-4)^2) i.e., sqrt(9+16) i.e., sqrt(25) i.e., 5.0.
        // TIP: Use the Math.sqrt function to compute the square root of a number.

        int diffX = other.x - this.x;
        int diffY = other.y - this.y;

//        if (diffX < 0 || diffY < 0) {
//            return 0;
//        }
//        else
        {
            //double d = sqrt(xdiff^2 + ydiff^2);
            return Math.sqrt((diffX * diffX) + (diffY *diffY));
        }
        //        return 0.0;
    }
}
