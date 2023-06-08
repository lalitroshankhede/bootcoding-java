package com.arrayex;

public class PassingArrayEleToMethod {

    public static void getArray(int array[])
    {
        for (int i = 0; i < array.length; i++) {

            System.out.println("Array of ["+i+"]"+"is"+array[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={2,35,7,6,5,4,5,6,7};
        getArray(arr);
    }
}
