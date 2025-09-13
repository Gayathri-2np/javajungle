package com.ass5.leapyear;



public class LEAPYEAR {
    public static void main(String[] args) {
        int y = 2020;
        if (y % 4==0) {
            System.out.println(" IT IS A LEAP YEAR IN THIS MAGIC CALENDER");
        } else if (y % 100==0) {
            System.out.println("IT IS A LEAP YEAR IN THIS MAGIC CALENDER");
        } else {


            System.out.println("IT IS NOT A LEAP YEAR");
        }

    }


}
