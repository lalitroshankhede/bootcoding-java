package com.methodsex;

import java.util.Scanner;

public class FactorialNoUsingMethod {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any No.");
        int num=input.nextInt();

        System.out.println("Factorial given no is : "+getFactorial(num));
    }
    public static int getFactorial(int number)
    {
        int fact=1;
        while (number!=0)
        {
            fact=fact*number;
            number--;
        }
        return fact;
    }
}
