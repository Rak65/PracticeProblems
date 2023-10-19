package com.bridgelabz;

import java.util.Scanner;

public class ArithmeticOperation {
    public void arithmetic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third number: ");
        double c = sc.nextDouble();

        double res1 = a + b * c;
        double res2 = c + a / b;
        double res3 = a % b + c;
        double res4 = a * b + c;
        double max = Math.max(Math.max(res1,res2),Math.max(res3,res4));
        double min = Math.min(Math.min(res1,res2),Math.min(res3,res4));
        System.out.println("Equation one : "+ res1);
        System.out.println("Equation two: "+ res2);
        System.out.println("Equation three : "+ res3);
        System.out.println("Equation four: "+ res4);
        System.out.println("Maximum value "+ max);
        System.out.println("Minimum value "+ min);
    }
}
