package com.IfElseIf;

public class College {

    public static void main(String[] args) {

        String collegeGrad="B+";

        if (collegeGrad=="A+")
        {
            System.out.println("ETC, CSE, MLE, AIE, ME, EE, CE");
        } else if (collegeGrad=="A") {
            System.out.println("CSE,ETC, ME,EE,CE,MLE");
        } else if (collegeGrad=="B+") {
            System.out.println("ETC, CSE, ME,EE");
        } else if (collegeGrad=="B") {
            System.out.println("ETC,CSE,ME");
        }
        else {
            System.out.println("College grade not found !");
        }

    }
}
