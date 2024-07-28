package com.in28minutes.UnderstandingtheJavaPlatform;

public class Planet {
    void revolve() {
        System.out.println("Planet Revolves Again!");
    }

    public static void main(String[] args) {
        Planet earth = new Planet();
        Planet venus = new Planet();

        earth.revolve();
        venus.revolve();
    }
}