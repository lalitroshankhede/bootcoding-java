package com.methodsex.methodoverriding;

public class LoanApp {
    public static void main(String[] args) {
        HomeLoan homeLoan=new HomeLoan();
        double result=homeLoan.calculateROI();
        System.out.println(result);

    }
}
