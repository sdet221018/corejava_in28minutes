package com.in28minutes.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe {


    @Override
    void getReady() {
        System.out.println("Get the Raw Materials");
        System.out.println("Switch On the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get the stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleanup the Utensils");
        System.out.println("Switch On the microwave");

    }
}
