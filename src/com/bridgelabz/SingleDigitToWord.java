package com.bridgelabz;
import java.util.Scanner;
public class SingleDigitToWord {
    public  void digitToWord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit number (0-9): ");
        int num = scanner.nextInt();

        String[] digitWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (num >= 0 && num <= 9) {
            System.out.println(num + " is: " + digitWords[num]);
        } else {
            System.out.println("Invalid input. Please enter a single-digit number (0-9).");
        }
    }
}





