package com.arrayex;

public class LinearSerchUsingArray {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};
      int flag=0;
        int key=40;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==key)
            {
                System.out.println(key+"is"+" Present on  "+(i+1)+" Position");
                 flag=1;
            }
        }

        if (flag==0)
        {
            System.out.println(key+"is not Present in the list");
        }

    }
}
