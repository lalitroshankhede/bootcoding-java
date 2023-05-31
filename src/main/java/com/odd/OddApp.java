package com.odd;

public class OddApp {

    public static void main(String[] args) {

        OddNumber obj1=new OddNumber();
      boolean result1=obj1.isOdd(53);

        int arr[]={10,22,30,40,50};
       boolean result2= obj1.allOdd(arr);
        System.out.println(result1);
        System.out.println(result2);
    }
}
