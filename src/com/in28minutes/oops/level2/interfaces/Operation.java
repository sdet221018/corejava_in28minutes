package com.in28minutes.oops.level2.interfaces;

interface Operation {
    int perform(int x, int y);
}

// Complete the classes below by implementing the Operation interface and providing your own implementation of the perform method.
class Add implements Operation {
    @Override
    public int perform(int x, int y) {
        return x+y;// Write your code here
    }
}

class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        return x-y;// Write your code here
    }
}

class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        if (y == 0) {
            return -1;
        }
        else
            return x/y;
    }
}