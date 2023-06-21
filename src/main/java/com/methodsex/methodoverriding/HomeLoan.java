package com.methodsex.methodoverriding;

public class HomeLoan extends BaseLoan{
    public double calculateROI(){

        System.out.println("Child method Invoked");
        return 9.5;
    }
}
