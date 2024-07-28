package com.in28minutes.UnderstandingtheJavaPlatform;

public class MultiplicationTableRunner {

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();

        System.out.println("\nPrint Method with Default Table & Count until:");
        table.print();

        System.out.println("\nPrint Method with given Table & Default Count until:");
        table.print(101);

        System.out.println("\nPrint Method with given Table & Count until:");
        table.print(7, 8);

        System.out.println("\nPrint Method with given Table & Count:");
        table.print(12, 5, 12);
    }
}
