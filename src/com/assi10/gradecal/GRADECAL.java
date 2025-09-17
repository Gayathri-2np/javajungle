package com.assi10.gradecal;

public class GRADECAL {
    public static void main(String[] args){
        System.out.println("Marks of Santhosh in his annual examination");
        int mar=85;
        if(mar>=90){
            System.out.println("Grade A");
        } else if (mar>=75) {
            System.out.println("Grade B ");

        }
        else if(mar>=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Sorry u failed  in the exam");
        }

    }
}
