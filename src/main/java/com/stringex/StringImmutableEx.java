package com.stringex;

final class ImmutableEx {
   final String pancardNo;

    public ImmutableEx(String pancardNo)
    {
         this.pancardNo=pancardNo;
    }

    public String getPancardNo() {
        return pancardNo;
    }

}

public class StringImmutableEx
{
    public static void main(String[] args) {

        ImmutableEx obj=new ImmutableEx("EGBDP5600R");
        String str1= obj.getPancardNo();

        System.out.println("Pan Card No is : " +str1 );
    }
}

 /*Note:  1) The Instance variable of the class is final i.e we cannot change the value of after creating an object.
        2) The class is final so we  cannt create the subclass
        3) There is no setter method i.e we have no option to change the value of the instance variable.*/
