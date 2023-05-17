package com.Assignment2;

public class Harmonic_Series {

    public static void main(String[] args) {

         float num=5;
         float sum=0;
         for (int i=1;i<=num;i++)
         {
             sum=sum+(float)1/i;

         }

        System.out.println("Harmonic_Series Result is : "+sum);
    }

}
