package com.ass6.reportcard;

public class REPORTCARD {
    public static void main(String[] args) {
        System.out.println("Enter the numbers between 1-100");
        int marks = 67;
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75 ) {
            System.out.println("B");

        } else if (marks >= 50) {
            System.out.println("C");

        } else {
            System.out.println("FAIL");
        }


    }
}
