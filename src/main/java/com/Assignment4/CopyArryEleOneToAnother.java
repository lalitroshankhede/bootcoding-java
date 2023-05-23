package com.Assignment4;

public class CopyArryEleOneToAnother {
    public static void main(String[] args) {

        int arr[]={5,9,4,6,3,7,8};
        int arr2[]=arr;

        System.out.println("*********** Array 1 ************");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print("\t"+arr[i]);
        }

        System.out.println(" \n *********** Array 2 ************");

        for (int i=0;i<arr2.length;i++)
        {
            System.out.print("\t"+arr2[i]);
        }



    }
}
