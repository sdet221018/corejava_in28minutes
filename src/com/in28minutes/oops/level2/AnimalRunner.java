package com.in28minutes.oops.level2;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.bark();

//        AbstractAnimal abstractanimal = new AbstractAnimal();
//        abstractanimal.bark();

        Dog dog = new Dog();
        dog.bark();
    }
}
