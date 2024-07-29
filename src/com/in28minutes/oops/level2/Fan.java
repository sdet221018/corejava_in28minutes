package com.in28minutes.oops.level2;

public class Fan {
    // State or Member Variables

    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; // 0 to 5

    // Constructor or Creation
    public Fan() {
        this.make = "";
        this.radius = 0;
        this.color = "";
    }

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    // Behaviour or Member Methods
    void switchOn() {
        this.isOn = true;
        setSpeed((byte)5);
    }

    void switchOff() {
        this.isOn = false;
        setSpeed((byte)0);
    }

    void setSpeed(byte speed) {
        this.speed = speed;
    }

    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn, speed);
    }
}
