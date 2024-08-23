package com.in28minutes.oops.level2.inheritance;

public class Cat extends Pet{
    @Override
    public String toString() {
        return super.toString() + "Cat";
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.groom();
        System.out.println(cat.toString());
    }
}
