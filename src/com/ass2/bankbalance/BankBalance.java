package com.ass2.bankbalance;

public class BankBalance {
    public static void main(String[] args){
        int balance=1000;
        if(balance>0){
            System.out.println("POSITIVE BALANCE");

        }
        else if(balance<0){
            System.out.println("OVERDRAFT");

        }
        else{
            System.out.println("ZERO BALANCE");

        }

    }
}
