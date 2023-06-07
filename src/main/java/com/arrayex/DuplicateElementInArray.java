package com.arrayex;

public class DuplicateElementInArray {
    public static void main(String[] args) {

        int arr[]={2,3,4,5,6,2,6,7,4};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
