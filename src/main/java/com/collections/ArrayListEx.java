package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

    public static void main(String[] args) {
        /*ArrayList<Integer> integerList=new ArrayList<>();
        System.out.println(integerList+" Empty Integer Array");
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        System.out.println("=========== Integer Array =============");
        System.out.println(integerList);

        System.out.println();

        ArrayList<String> stringList=new ArrayList<>();
        System.out.println(stringList+" Empty String Array");
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Mango");
        stringList.add("Graps");
        stringList.add("Orange");
        System.out.println("=========== String Array =============");
        System.out.println(stringList);  */


       int dimension=0;
        ArrayList<String> integersArrEle=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Dimension of Array ");
        dimension=input.nextInt();
        System.out.println("Enter String Array Elements");
        for (int i = 0; i < dimension; i++) {
            integersArrEle.add(input.next());

        }
        System.out.println("======== Printing Integer Array Elements");
        System.out.println(integersArrEle);
        System.out.print("Total Element Size of Array is : "+integersArrEle.size());

        System.out.println();


    }


}
