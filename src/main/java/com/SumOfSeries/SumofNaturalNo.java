package com.SumOfSeries;

public class SumofNaturalNo {

    public static void main(String[] args) {

        int num = 7;
        int sum = 0;
        System.out.println("The first 7 natural number is :");
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.print(i);
        }
        System.out.println("\n" + "The Sum of Natural Number upto " + num + " terms : " + sum);
    }
}
