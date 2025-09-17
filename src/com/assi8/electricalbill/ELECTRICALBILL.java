package com.assi8.electricalbill;

import java.sql.SQLOutput;

public class ELECTRICALBILL {
    public static void main(String[] args){
        int bill=1200;
        if(bill>1000){
            System.out.println("Congragulations,You won 1% discounts");
            bill= (int) (bill*0.1);
        } else if (bill>500) {
            System.out.println("Congragulations,You won 5% discounts");
            bill=(int)(bill*0.05);

        }
        else{
            System.out.println("You need to pay the money for the actual amount in the bill ,No discounts");

        }

    }
}

