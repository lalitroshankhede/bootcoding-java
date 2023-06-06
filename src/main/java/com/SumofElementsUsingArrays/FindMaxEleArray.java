package com.SumofElementsUsingArrays;

public class FindMaxEleArray {

    public static void main(String[] args) {

        int arr[] = {5, 30, 92, 2, 62};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is :" + max);
    }
}
