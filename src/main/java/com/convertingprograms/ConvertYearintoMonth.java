package com.convertingprograms;

public class ConvertYearintoMonth {

    public static void main(String[] args) {

        float arr[]={1,2.5f,3.2f,10.5f,15};
        float months=0;

        for (int i=0;i< arr.length;i++)
        {
            months=arr[i]*12;
            System.out.println(arr[i]+" Years"+"-> "+months+" Months");
        }

    }
}
