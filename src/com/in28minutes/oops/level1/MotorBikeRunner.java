package com.in28minutes.oops.level1;

public class MotorBikeRunner {

    public static void main(String[] args) {
        System.out.println("\nBikes Speed through Constructor: ");
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        MotorBike suzuki = new MotorBike();

        System.out.println("Ducati Speed: " + ducati.getSpeed());
        System.out.println("Honda Speed: " + honda.getSpeed());
        System.out.println("Suzuki Speed: " + suzuki.getSpeed());

        ducati.start();
        honda.start();
        suzuki.start();

        ducati.setSpeed(100);
//        int ducatiSpeed = ducati.getSpeed();
//        ducatiSpeed += 100;
//        ducati.setSpeed(ducatiSpeed);

        honda.setSpeed(80);
//        int hondaSpeed = honda.getSpeed();
//        hondaSpeed += 100;
//        honda.setSpeed(hondaSpeed);

        System.out.println("\nBikes Speed Increasing !");
        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        System.out.println("Bikes Speed after Increasing Speed of 100: ");
        System.out.println("Ducati Speed: " + ducati.getSpeed());
        System.out.println("Honda Speed: " + honda.getSpeed());

        System.out.println("\nBikes Speed Decreasing !");
        ducati.decreaseSpeed(150);
        honda.decreaseSpeed(200);

//        ducati.setSpeed(-50);
//        honda.setSpeed(0);

        System.out.println("Bikes Speed after Decreasing Speed of 250: ");
        System.out.println("Ducati Speed: " + ducati.getSpeed());
        System.out.println("Honda Speed: " + honda.getSpeed());
    }
}
