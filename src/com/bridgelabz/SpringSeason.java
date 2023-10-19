package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public void season(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month=sc.nextInt();
        System.out.println("Enter the day : ");
        int day = sc.nextInt();
        if(month%2==0){
            if (((month > 3 && month < 6) || (month == 6 && day <= 20)) && (day >=1 && day<=30))
                System.out.println("True");
            else
                System.out.println("False");
        }
        else {
            if (((month == 3 && day >= 20) || (month > 3 && month < 6))&& (day >=1 && day<=31))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
