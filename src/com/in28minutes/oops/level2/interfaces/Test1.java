package com.in28minutes.oops.level2.interfaces;

public class Test1 implements Interface4 {
    public void print() {
        System.out.println("override");
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.print();
    }

}
