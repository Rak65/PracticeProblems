package com.bridgelabz;

import java.util.Scanner;

public class Palindrome {
    public void revNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number= sc.nextInt();
        int rev=0, num=number;
        while (number!=0){
            int rem = number%10;
            rev = rev*10+rem;
            number=number/10;
        }
        if(num==rev)
            System.out.println(num+" is a Palindrome number.");
        else
            System.out.println(num+" is not Palindrome number.");
    }
}
