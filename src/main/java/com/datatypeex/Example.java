package com.datatypeex;

public abstract class Example {

    static int num=10;
    public   static void getVal()
    {

        int number=100;
        num=20;
        System.out.println(num);
        System.out.println(number);

    }

    public abstract void nonStatic();


}
