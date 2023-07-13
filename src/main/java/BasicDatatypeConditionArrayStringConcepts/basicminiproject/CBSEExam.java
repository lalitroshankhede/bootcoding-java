package BasicDatatypeConditionArrayStringConcepts.basicminiproject;

import java.util.Scanner;

//WAP to calculate percentage for student of 5 subjects
public class CBSEExam {
    public static void main(String[] args) {
        int orgRoll = 71147;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CBSE Board Exam Result 2023");
        System.out.println("Enter Student Roll");
        int rollNo = input.nextInt();
        int engMarks = 80, sciMarks = 90, mathMarks = 90, hisMarks = 94, geoMarks = 89;
        int total = engMarks + sciMarks + mathMarks + hisMarks + geoMarks;
        float percentage = (total * 100) / 500;

        if (rollNo == orgRoll) {
            System.out.println("Welcome Mr./Miss. XYZ");
            if (percentage >= 60) {
                System.out.println("English "+engMarks+"\n"+"Science "+sciMarks+"\n"+"Maths "+mathMarks+"\n"+"History"+hisMarks+"\n"+"Geography"+geoMarks);
                System.out.println("Percentage = " + percentage);
                System.out.println("Result : Passed");
            } else {
                System.out.println("Failed Better Luck Next Time");
            }

        } else {
            System.out.println("Roll No. not Found Try Again");

        }


    }


}



