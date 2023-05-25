package com.MethodsEx;

import java.util.Scanner;

public class EligibleforVote {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any Age");
        int age=input.nextInt();
        System.out.println("Person "+isEligible(age));
    }

    public static String isEligible(int ageNum)
    {
        int voteAge=ageNum;
        if (voteAge>=18)
        {
            return "Eligible for Vote";
        }

        else {
            return "Not Eligible for Vote";
        }

    }
}
