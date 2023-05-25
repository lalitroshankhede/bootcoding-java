package com.MethodsEx;

import java.util.Scanner;

public class PrimeNoUsingMethod {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=0;
        while(true)
        {
            if (number>=0)
            {
                System.out.println("Enter Any No.");
                 number=input.nextInt();
                System.out.println(number+" is "+primeNo(number));
            }
            else {
                break;
            }
        }

    }
    public static String primeNo(int num)
    {
        int result=num;
        for (int i=2;i<num;i++)
        {
            if (num%2==0)
            {
                return " Not Prime";
            }

        }
        return " Prime No";
    }
}
