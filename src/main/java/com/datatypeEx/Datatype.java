package com.datatypeEx;

public class Datatype {
    public static void main(String[] args) {

        System.out.println("Hello World");

        // Integer Datatype
        System.out.println("============== Integer Datatype =================");
        int rollNo=12;
        System.out.println(rollNo);
        //Your roll number is 12
        System.out.println("Your roll no is "+rollNo);
        long phone=8975648525L;  // l/L type casting from integer number to long number
        System.out.println("Your phone number is "+phone);

        System.out.println("============== Float/Double Datatype =================");

        //Float and Double Datatype

        float percentage=(float)89.90; // f/F type casting from double to float number
        System.out.println("Total Percentage is "+percentage);

        double food_Price=199.80;
        System.out.println("Item Price = "+food_Price);

        System.out.println("============== Boolean Datatype =================");

        boolean orderDelivered=true;

        if (orderDelivered==true)
        {
            System.out.println("Ordered Delivered ");

        }
        else
        {
            System.out.println("Order not Delivered");
        }

    }
}
