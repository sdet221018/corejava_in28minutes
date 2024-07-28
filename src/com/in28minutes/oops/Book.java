package com.in28minutes.oops;

public class Book {
    private int noOfCopies;

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies > 0) {
            this.noOfCopies = noOfCopies;
        }
        else {
            this.noOfCopies = 0;
        }
    }

    Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void increaseCopies(int howManyCopies) {
        setNoOfCopies(this.noOfCopies + howManyCopies);
//        this.noOfCopies += howManyCopies;
    }

    public void decreaseCopies(int howManyCopies) {
        setNoOfCopies(this.noOfCopies - howManyCopies);
//        this.noOfCopies -= howManyCopies;
    }
}
