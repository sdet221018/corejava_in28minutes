package com.in28minutes.oops.level2.inheritance;

public class Dog extends Pet{

    @Override
    public String toString() {
        return super.toString() + "Dog";
    }

    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.groom();
        System.out.println(pet.toString());

        System.out.println("Is pet an Instance of " + pet.getClass().getName() + " ? " + (pet instanceof Dog));
        Pet pet1 = new Pet();
        System.out.println("Is pet1 an Instance of " + pet1.getClass().getName() + " ? " + (pet1 instanceof Pet));
        Animal animal = new Animal();
        System.out.println("Is animal an Instance of " + animal.getClass().getName() + " ? " + (animal instanceof Animal));
        System.out.println("Is animal an Instance of Object ? " + (animal instanceof Object));

        System.out.println("*****************Positive Scenarios**********************************");
        System.out.println("Is pet an Instance of Object ? " + (pet instanceof Object));
        System.out.println("Is pet1 an Instance of Object ? " + (pet1 instanceof Object));
        System.out.println("Is pet1 an Instance of Animal ? " + (pet1 instanceof Animal));
        System.out.println("Is pet an Instance of Animal ? " + (pet instanceof Animal));

        System.out.println("*****************Negative Scenarios**********************************");
        System.out.println("Is animal an Instance of Pet ? " + (animal instanceof Pet));
        System.out.println("Is pet1 an Instance of Dog ? " + (pet1 instanceof Dog));
    }
}
