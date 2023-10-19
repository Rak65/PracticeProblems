package com.bridgelabz;

import java.util.Scanner;

public class VowelConsonant {
        public void vowelCons(){

            Scanner s1=new Scanner(System.in);
            System.out.println("enter the alphabet");
            char ch=s1.next().charAt(0);
            if(ch>='A' && ch <='Z')
            {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    System.out.println("vowel");
                else
                    System.out.println("constant");
            }
            else if(ch>='a' && ch<='z')
            {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    System.out.println("vowel");
                else
                    System.out.println("constant");
            }
            else
                System.out.println("some other");
        }
}
