package com.in28minutes.UnderstandingtheJavaPlatform;

public class Country {
    void comingSoon() {
        System.out.println("Coming Soon");
    }

    public static void main(String[] args) {
        Country india = new Country();
        Country usa = new Country();
        Country uk = new Country();
        Country netherlands = new Country();

        uk.comingSoon();
        india.comingSoon();

    }
}
