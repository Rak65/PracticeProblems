package com.bridgelabz;

import java.util.Scanner;

public class ReverseNoUsingForLoop {
    public void revNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= sc.nextInt();
        int rev=0;
        for(;number!=0 ;){
            int rem = number%10;
            rev = rev*10+rem;
            number=number/10;
        }
        System.out.println("Reverse no : "+rev);
    }
}
