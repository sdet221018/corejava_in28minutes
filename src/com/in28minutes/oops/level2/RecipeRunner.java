package com.in28minutes.oops.level2;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        System.out.println("Running execute method for Recipe1 Class");
        recipe.execute();

        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        System.out.println("Running execute method for RecipeWithMicrowave Class");
        recipeWithMicrowave.execute();

    }
}
