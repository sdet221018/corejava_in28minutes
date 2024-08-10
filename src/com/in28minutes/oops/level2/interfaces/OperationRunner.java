package com.in28minutes.oops.level2.interfaces;

public class OperationRunner {

    public static void main(String[] args) {
        Add add = new Add();
        Subtract sub = new Subtract();
        Divide div = new Divide();

        System.out.println("Addition: " + add.perform(4,5));
        System.out.println("Subtraction: " + sub.perform(9,2));
        System.out.println("Division: " + div.perform(27,3));
        System.out.println("Division by Zero: " + div.perform(7,0));
    }
}
