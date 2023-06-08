package com.arrayex;

import java.util.Scanner;
public class MultiDimensionalArrayInputValue {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter Array Value of ["+i+"]"+"["+j+"]");
                arr[i][j]=input.nextInt();
            }

        }
        System.out.println("============================ Print Array ==========================");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
