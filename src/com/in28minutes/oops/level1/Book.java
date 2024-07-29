package com.in28minutes.oops.level1;

public class Book {

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    private int noOfCopies;
    protected String publisher;

    String publishedDate;

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

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
