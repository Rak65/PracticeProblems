package com.bridgelabz;

import java.util.Scanner;
/*
 Step 1 : Start
 Step 2 : Declare variables firstString and secondString
 Step 3 : Read Variables firstString and secondString
 Step 4:  if(firstString.equals(secondString))
                Display Both strings are equal
          else
                Display Both strings are not equal
 Step 5 : Stop

 */
public class TwoStringsEqualOrNot {
    Scanner sc=new Scanner(System.in);
    public void twoString(){
        System.out.println("Enter First string : ");
        String firstString=sc.nextLine();
        System.out.println("Enter Second String : ");
        String secondString=sc.nextLine();
        boolean isEqual = firstString.equals(secondString);
        System.out.println("The strings are " + (isEqual ? "equal" : "not equal"));
    }
}
