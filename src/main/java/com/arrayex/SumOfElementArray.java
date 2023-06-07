package com.arrayex;

import java.util.Scanner;

public class SumOfElementArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dimension = 0;
        System.out.println("Enter Dimension of Array");
        dimension=input.nextInt();
        int arr[]=new int[dimension];
        int sum=0;
        System.out.println("Enter the Element of Array");
        for (int i = 0; i < dimension-1; i++) {
            arr[i]=input.nextInt();
            sum=sum+arr[i];

        }
        System.out.println("Sum of Element of Array is :"+sum);

    }
}
