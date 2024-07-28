package com.in28minutes.UnderstandingtheJavaPlatform;

public class MultiplicationTable {
    // 5*1 = 5
    // 5*10 = 50

    void print() {
        print(5, 1, 10);
//        for(int i = 1; i <= 10; i++) {
//            System.out.printf("%d * %d = %d\n", 5, i, 5 * i);
//        }
    }

    void print(int table) {
        print(table, 1, 10);
//        for(int i = 1; i <= 10; i++) {
//            System.out.printf("%d * %d = %d\n", table, i, table * i);
//        }
    }

    void print(int table, int count_until) {
        print(table, 1, count_until);
//        for(int i = 1; i <= count_until; i++) {
//            System.out.printf("%d * %d = %d\n", table, i, table * i);
//        }
    }

    void print(int table, int count_from, int count_until) {
        for(int i = count_from; i <= count_until; i++) {
            System.out.printf("%d * %d = %d\n", table, i, table * i);
        }
    }
}
