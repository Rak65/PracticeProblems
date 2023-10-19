package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNoUsingForLoop {
    public static void sumNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N= sc.nextInt();
        int sum=0;
        for (int i=1;i<=N;i++){
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
}
