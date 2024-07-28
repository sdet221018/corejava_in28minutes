package com.in28minutes.oops;

public class MotorBike {

    MotorBike() {
        this(5);
    }

    MotorBike(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
        else
            this.speed = 0;

//        System.out.println("Local variable Speed: " + speed);
//        System.out.println("Member variable Speed: " + this.speed);
    }

    //state
    private int speed; // member variable

    // behaviour
    //method
    //inputs
    //outputs
    //name

    void start() {
        System.out.println("Bike started");
    }

    public void increaseSpeed(int howmuch) {
        //this.speed += howmuch;
        setSpeed(this.speed + howmuch);
    }

    public void decreaseSpeed(int howmuch) {
        //this.speed -= howmuch;
        setSpeed(this.speed - howmuch);
    }
}
