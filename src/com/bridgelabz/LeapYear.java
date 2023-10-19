package com.bridgelabz;

import java.util.Scanner;
/*
    Step 1 : Start
    Step 2 : Declare variable year
    Step 3 : Read year from the user
    Step 4 : if year > 1582
                if (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
                    Display year is a leap year
                else
                    Display year is not leap year.
             else
                Display Year should be greater than 1582.
    Step 5 : Stop
 */
public class LeapYear {
    public static void year(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year.");
        int year=sc.nextInt();
        if (year>1582) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                System.out.println(year + " is a Leap year");
            else
                System.out.println(year + " is not Leap Year");
        }else
            System.out.println("Year should be greater than 1582.");
    }
}
