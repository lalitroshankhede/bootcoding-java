package com.arrayex;

public class AddOfTwoMatrix {
    public static void main(String[] args) {

        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{10,11,12},{13,14,15},{16,17,18}};
        int FinalArray[][]=new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                FinalArray[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("============== Printing Sum of Two Array ==========");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(FinalArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
