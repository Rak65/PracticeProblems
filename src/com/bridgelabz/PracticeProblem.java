package com.bridgelabz;

import java.util.Scanner;

public class PracticeProblem {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        boolean isRunning=true;
        while (isRunning){
            System.out.println("Which program you want to run:");
            System.out.println("1. Display any message.");
            System.out.println("2. Display the default value of all primitive data types.");
            System.out.println("3. Two strings are equal or not.");
            System.out.println("4. Leap Year.");
            System.out.println("5. Read single Digit Number and write in word");
            System.out.println("6. Display unit, ten hundred");
            System.out.println("7. Sum of N Natural number.");
            System.out.println("8. Reverse number.");
            System.out.println("9. Sum of N natural no using for loop.");
            System.out.println("10. Reverse number using for loop");
            System.out.println("11. Palindrome number.");
            System.out.println("12. Vowels and Consonant.");
            System.out.println("13. Print the month name for the given number");
            System.out.println("14. Arithmetic Operation.");
            System.out.println("15. Spring Season.");
            System.out.println("16. Quadratic Equation.");
            System.out.println("17. Euclidean distance");
            System.out.println("18. Exit.");

            String choice=sc.next();
            switch (choice){
                case "1" :
                    //Step 1 : Start
                    //Step 2 : Display any message
                    //Step 3 : Stop
                    System.out.println("Display Any message");
                    break;
                case "2" :
                    PrimitiveDefaultDataType p=new PrimitiveDefaultDataType();
                    p.primitiveDataType();
                    break;
                case "3":
                    TwoStringsEqualOrNot t= new TwoStringsEqualOrNot();
                    t.twoString();
                    break;
                case "4":
                    LeapYear.year();
                    break;
                case "5":
                    SingleDigitToWord digit= new SingleDigitToWord();
                    digit.digitToWord();
                    break;
                case "6":
                    UnitTenHundred.Number();
                    break;
                case "7":
                    SumOfNaturalNo.sum();
                    break;
                case "8":
                    ReverseNumber r= new ReverseNumber();
                    r.revNo();
                    break;
                case "9":
                    SumOfNaturalNoUsingForLoop.sumNo();
                    break;
                case "10":
                    ReverseNoUsingForLoop rr= new ReverseNoUsingForLoop();
                    rr.revNumber();
                    break;
                case "11":
                    Palindrome palindrome = new Palindrome();
                    palindrome.revNum();
                    break;
                case "12":
                    VowelConsonant v= new VowelConsonant();
                    v.vowelCons();
                    break;
                case "13":
                    MonthName m= new MonthName();
                    m.month();
                    break;
                case "14":
                    ArithmeticOperation ar = new ArithmeticOperation();
                    ar.arithmetic();
                    break;
                case "15":
                    SpringSeason springSeason=new SpringSeason();
                    springSeason.season();
                    break;
                case "16":
                    QuadraticEquation quadraticEquation = new QuadraticEquation();
                    quadraticEquation.equation();
                    break;
                case "17":
                    Distance distance = new Distance();
                    distance.distanceCal();
                    break;
                case "18" :
                    isRunning=false;
                    break;
                default:
                    System.out.println("Try again :----");
            }
        }
    }

}
