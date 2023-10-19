package com.bridgelabz;
import java.util.Scanner;
public class UnitTenHundred {
    public static void Number(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number==1)
            System.out.println("UNIT");
        else if (number==10)
            System.out.println("TEN");
        else if (number==100)
            System.out.println("Hundred");
        else if (number==1000)
            System.out.println("Thousands");
        else
            System.out.println("Try again---");
    }
}
