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

    }
}
