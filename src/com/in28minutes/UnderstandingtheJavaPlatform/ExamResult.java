package com.in28minutes.UnderstandingtheJavaPlatform;

public class ExamResult {

    public boolean isPass(int marks) {
        // Update Code : If the student's marks are greater than 50, they have passed the exam.

//        if (marks <= 50) {
//            return false;
//        } else {
//            return true;
//        }
        return marks > 50;
    }
}
