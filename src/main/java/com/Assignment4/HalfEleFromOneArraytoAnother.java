package com.Assignment4;

import java.util.Scanner;

public class HalfEleFromOneArraytoAnother {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int sizeArray=input.nextInt();
        int arr1[]=new int[sizeArray];
        int arr2[]=arr1;
        System.out.println("Enter Element of Array");
        for (int i = 0; i < arr1.length; i++) {

            arr1[i]=input.nextInt();

        }
        System.out.println("Array 1");
        for (int i = 0; i < arr1.length; i++) {

            System.out.print("\t"+arr1[i]);
        }
        System.out.println("\n Array 2");
        for (int i = 0; i < arr2[arr1[sizeArray/2]-1]; i++) {
            System.out.print("\t"+arr2[i]);
        }
    }
}
