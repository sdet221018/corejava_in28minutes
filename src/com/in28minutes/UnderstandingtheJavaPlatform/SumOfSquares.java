package com.in28minutes.UnderstandingtheJavaPlatform;

public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
        // write your code here
        long sum = 0;
        if (n < 0) {
            return -1;
//        } else if (n == 0) {
//            return 0;
        } else {
            for(int i = 1; i <= n; i++) {
                sum += (i*i);
            }
            return sum;
        }
    }
}
