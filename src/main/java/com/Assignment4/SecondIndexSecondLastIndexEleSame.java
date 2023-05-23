package com.Assignment4;

public class SecondIndexSecondLastIndexEleSame {
    public static void main(String[] args) {

        int arr[] = {7,22,19,44,45,22,17};
        for (int i = 0; i < arr.length; i++) {
            if ( arr[1] ==  arr[arr.length-2])
            {
                System.out.print("\t"+arr[i]);
            }
        }
    }
}
