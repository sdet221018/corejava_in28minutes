package com.in28minutes.oops.level2;

public class Recipe1 extends AbstractRecipe{


    @Override
    void getReady() {
        System.out.println("Get the Raw Materials");
        System.out.println("Get the Utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("get the stuff ready");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleanup the Utensils");
    }
}
