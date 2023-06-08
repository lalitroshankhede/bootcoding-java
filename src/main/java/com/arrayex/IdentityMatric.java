package com.arrayex;

public class IdentityMatric {

    public static void main(String[] args) {

        int arr1[][]=new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

               if (arr1[i]==arr1[j])
               {
                   arr1[i][j]=1;
               }
               else
               {
                   arr1[i][j]=0;
               }
            }
        }
        System.out.println("============== Printing Transpose Matrix Array ==========");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
