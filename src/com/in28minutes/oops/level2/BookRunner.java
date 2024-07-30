package com.in28minutes.oops.level2;

public class BookRunner {

    public static void main(String[] args) {

        Book book = new Book(123, "Object Oriented Programming with Java", "Ranga");
        book.addReview(new Review(10, "Great Books", 5));
        book.addReview(new Review(101, "Awesome", 5));

        System.out.println(book);

//
//
//
//
//        System.out.println("\nNumber of Copies of Books through Constructor: ");
//        Book artOfComputerProgramming = new Book(1000);
//        Book effectiveJava = new Book(1000);
//        Book cleanCode = new Book(1000);
//
////        System.out.println(cleanCode.publisher);
////        System.out.println(cleanCode.publishedDate);
//
//        System.out.println(artOfComputerProgramming.getNoOfCopies());
//        System.out.println(effectiveJava.getNoOfCopies());
//        System.out.println(cleanCode.getNoOfCopies());
//
//        System.out.println("\nNumber of Copies assigned through Setters: ");
//        artOfComputerProgramming.setNoOfCopies(10);
//        effectiveJava.setNoOfCopies(10);
//        cleanCode.setNoOfCopies(10);
//
//        System.out.println("Number of Copies of Books through getters / Setters: ");
//        System.out.println(artOfComputerProgramming.getNoOfCopies());
//        System.out.println(effectiveJava.getNoOfCopies());
//        System.out.println(cleanCode.getNoOfCopies());
//
//        System.out.println("\nNumber of Copies increased through methods: ");
//        artOfComputerProgramming.increaseCopies(100);
//        effectiveJava.increaseCopies(50);
//        cleanCode.increaseCopies(5);
//
//        System.out.println("Number of Copies of Books after increaseCopies Method: ");
//        System.out.println(artOfComputerProgramming.getNoOfCopies());
//        System.out.println(effectiveJava.getNoOfCopies());
//        System.out.println(cleanCode.getNoOfCopies());
//
//        System.out.println("\nNumber of Copies decreased through methods: ");
//        artOfComputerProgramming.decreaseCopies(105);
//        effectiveJava.decreaseCopies(60);
//        cleanCode.decreaseCopies(20);
//
//        System.out.println("Number of Copies of Books after decreaseCopies Method: ");
//        System.out.println(artOfComputerProgramming.getNoOfCopies());
//        System.out.println(effectiveJava.getNoOfCopies());
//        System.out.println(cleanCode.getNoOfCopies());
    }
}
