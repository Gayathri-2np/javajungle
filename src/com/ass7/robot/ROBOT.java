package com.ass7.robot;

public class ROBOT {
    public static void main(String[] args){
        int a=3;
        int b=6;
        int c;
        int op=3;
        System.out.println(" Enter the number which represents the operation");
        switch(op){
            case 1:
                c=a+b;
                System.out.println("The addition operation is done,"+c);
                break;
            case 2:
                c=b-a;
                System.out.println("The subtraction operation is done "+c );
                break;
            case 3:
                c=a*b;
                System.out.println("The multiplication operation is done "+c);
                break;
            case 4:
                c=a/b;
                System.out.println("The  division operation is done "+c);
                break;

        }
    }
}
