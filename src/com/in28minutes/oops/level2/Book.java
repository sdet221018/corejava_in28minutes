package com.in28minutes.oops.level2;

import java.util.ArrayList;

public class Book {

    private int id;
    private String name;
    private String author;
    private ArrayList<Review> reviews =  new ArrayList<Review>();

    public Book(int i, String string, String string2) {
        this.id = i;
        this.name = string;
        this.author = string2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public String toString() {
        return String.format("Book Id: %d, Name: %s, Author: %s, \nReviews: [%s]" , id, name, author, reviews);
    }



//    private int noOfCopies;
//    protected String publisher;
//    String publishedDate;
//
//
//
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public String getPublishedDate() {
//        return publishedDate;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public void setPublishedDate(String publishedDate) {
//        this.publishedDate = publishedDate;
//    }
//
//    public int getNoOfCopies() {
//        return noOfCopies;
//    }
//
//    public void setNoOfCopies(int noOfCopies) {
//        if(noOfCopies > 0) {
//            this.noOfCopies = noOfCopies;
//        }
//        else {
//            this.noOfCopies = 0;
//        }
//    }
//
//    Book(int noOfCopies) {
//        this.noOfCopies = noOfCopies;
//    }
//
//
//
//    public void increaseCopies(int howManyCopies) {
//        setNoOfCopies(this.noOfCopies + howManyCopies);
////        this.noOfCopies += howManyCopies;
//    }
//
//    public void decreaseCopies(int howManyCopies) {
//        setNoOfCopies(this.noOfCopies - howManyCopies);
////        this.noOfCopies -= howManyCopies;
//    }
}
