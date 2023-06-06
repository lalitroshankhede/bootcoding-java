package com.SumOfSeries;

public class SumOfOddNaturalNo {

    public static void main(String[] args) {
        int num = 20;
        int sum = 0;
        int count=1;
        System.out.print("The odd numbers are : ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(" " + i);
            }
        }
        System.out.println("\n" + "The Sum of Odd Natural Number : " + num + " terms : " + sum);
    }
}
