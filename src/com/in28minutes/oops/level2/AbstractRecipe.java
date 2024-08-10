package com.in28minutes.oops.level2;

public abstract class AbstractRecipe {
    // Prepare
    // Recipe
    // Cleanup

    public void execute() {
        getReady();
        doTheDish();
        cleanUp();
    }

    // Prepare
    abstract void getReady();
    // Recipe
    abstract void doTheDish();
    // Cleanup
    abstract void cleanUp();

}
