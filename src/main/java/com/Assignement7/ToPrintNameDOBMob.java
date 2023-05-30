package com.Assignement7;

import java.util.Scanner;

public class ToPrintNameDOBMob {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=input.nextLine();
        System.out.println("Enter DOB");
        String DOB=input.nextLine();
        System.out.println("Enter Mobile No");
        long mob=input.nextLong();

        System.out.println("Name :"+name+"\n"+"DOB :"+DOB+"\n"+"Mobile :"+mob);





    }
};
