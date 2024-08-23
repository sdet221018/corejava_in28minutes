package com.in28minutes.oops.level2.inheritance;

public class Pet extends Animal{
    public void groom() {
        System.out.println("Groom");
    }

    @Override
    public String toString() {
        return "This is a Pet ";
    }
}
