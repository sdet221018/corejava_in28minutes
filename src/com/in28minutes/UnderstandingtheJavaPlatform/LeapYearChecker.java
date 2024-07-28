package com.in28minutes.UnderstandingtheJavaPlatform;

public class LeapYearChecker {
//    public boolean isLeapYear(int year) {
//        if ((year / 4 == 0) && (year / 100 != 0) && (year / 400 == 0)) {
//            return true;
//        } else if ((year / 400 == 0) {
//
//        }
//        return false;
//    }

        public boolean isLeapYear(int year) {
            if (year < 1) {
                return false;
            } else if (year / 4 != 0) {
                return false;
            } else if (year / 100 == 0) {
                return false;
            } else if ((year / 400 == 0)) {
                return true;
            }
            return true;
        }
}
