package com.datatypeEx;

import java.util.Random;

public class Loops {

    public static void main(String[] args) {

        //For  Loop
        //Syntax for(initialization,condition;incre/decre)

        for (int i=1;i<=100;i++)
        {
            int num=new Random().nextInt();
            if (num%2==0)
            {
                System.out.println(num+" is Even");
            }
            else
            {
                System.out.println(num+" Odd");
            }
        }

        //Multiplication table

        int number=20;

        for (int i=1;i<=10;i++)
        {
            System.out.println(number+"*"+i+"="+number*i);
        }

        System.out.println("=================== WHILE LOOP ===============================");

// WAP to check whether a given number is palindrom or not
        // 123 == 321 - Not a Palindrom
        // 121 == 121 - Palindrom

        int num = 12221;
        int org = num;
        int r = 0;
        while(num != 0){
            int d = num / 10; // quotient
            r = r * 10 + num % 10; // remainder
            num = d; // 1234 -> 123
        }
        System.out.println(org);
        System.out.println(r);
        if(r == org){
            System.out.println(org + " is a palindrome!");
        }else{
            System.out.println(org + " is not a palindrome");
        }
        // Iteration



    }
}
