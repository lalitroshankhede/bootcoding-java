package com.even;

public class EvenApp {

    public static void main(String[] args) {

        EvenNumber obj1=new EvenNumber();
      boolean result1=obj1.isEven(53);

        int arr[]={10,22,30,40,50};
       boolean result2= obj1.allEven(arr);
        System.out.println(result1);
        System.out.println(result2);
    }
}
