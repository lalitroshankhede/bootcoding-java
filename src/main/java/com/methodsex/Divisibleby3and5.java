package com.methodsex;

public class Divisibleby3and5 {
    public static void divVal(int allEle[])
    {
        for (int i = 0; i <allEle.length ; i++) {
            if (allEle[i]%3==0 && allEle[i]%5==0)
            {
                System.out.println(allEle[i]);
            }
        }

    }

    public static void main(String[] args) {

        int arr[]={1,15,30,23,25,40,43,45,78,98,90,60};
        int eleArr[]=arr;
        divVal(eleArr);

    }
}
