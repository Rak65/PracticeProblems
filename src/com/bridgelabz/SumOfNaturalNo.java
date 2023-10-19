package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N= sc.nextInt();
        int i=1,sum=0;
        while (i<=N){
            sum+=i;
            i++;
        }
        System.out.println("Sum = "+sum);
    }
}
