package com.in28minutes.UnderstandingtheJavaPlatform;

public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        int minsH;
        if (hours < 0) {
            return -1;
        } else {
            minsH = hours * 60;
            return minsH;
        }

    }

    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method

        int minsD;
        if (days < 0) {
            return -1;
        } else {
            minsD = days * 24 * 60;
            return minsD;
        }

    }
}