package com.sumofelementsusingarrays;

public class FirstIndexLastIndexEleSame {
    public static void main(String[] args) {

        int arr[] = {7,22,19,44,45,65,7};
        for (int i = 0; i < arr.length; i++) {
              if ( arr[0] ==  arr[arr.length-1])
              {
                  System.out.print("\t"+arr[i]);
              }
              else {
                  System.out.println("Elements are not same");
                  break;
              }
        }
    }
}
