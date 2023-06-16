package com.methodsex;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class LinearSerachUsingMethod {

    public static int linearSearch(int array[],int number)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={1,6,4,32,6,8,4,2};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any No to Search");
        int key=input.nextInt();
        System.out.println(key+" is Present on "+(linearSearch(arr,key)+1)+" Postion");
    }
}
