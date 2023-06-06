package com.SumOfSeries;

public class FactorialNo {
    public static void main(String[] args) {

        int num=5;
        int org=num;
        int temp=1;
        while (org!=0)
        {
            temp=temp*org;
            org--;
        }
        System.out.println("The Factorial of "+num+" is : "+temp);
    }
}
