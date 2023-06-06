package com.methodsex;

import java.util.Scanner;

public class Average_of_ThreeNo {
    public static void main(String[] args) {

        int num1=25;
        int num2=45;
        int num3=65;
        System.out.println("Average of Three No. is "+avgNo(num1,num2,num3));
    }

    public static float avgNo(int a,int b,int c )
    {
        int sum=0;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Size Dimension");
        int size=input.nextInt();
        for (int i = 1; i <=size ; i++) {
            count++;
        }
        sum=a+b+c;
        float result=sum/count;
        return result;
    }
}
