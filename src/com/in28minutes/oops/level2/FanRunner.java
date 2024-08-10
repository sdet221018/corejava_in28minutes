package com.in28minutes.oops.level2;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Bajaj", 0.54534, "Green");
        System.out.println(fan);

        fan.switchOn();
        System.out.println(fan);

        fan.setSpeed((byte)15);
        System.out.println(fan);

        fan.switchOff();
        System.out.println(fan);
    }
}
