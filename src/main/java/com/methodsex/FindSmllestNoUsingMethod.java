package com.methodsex;

import java.util.Scanner;

public class FindSmllestNoUsingMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter No.1");
        int num1 = input.nextInt();
        System.out.println("Enter No.2");
        int num2 = input.nextInt();
        System.out.println("Enter No.3");
        int num3 = input.nextInt();

        System.out.println("Minimum value is : " + minVal(num1, num2, num3));

    }

    public static int minVal(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            }
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
        return c;
    }
}
