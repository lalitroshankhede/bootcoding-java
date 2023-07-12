package comTwo.objectorientedjava.classesandobjects;

import java.util.Scanner;

public class Student {

    int roll;
    String name;

    Scanner input=new Scanner(System.in);
    public void getStudInfo()
    {
        System.out.println("Enter the Student Roll No");

        if (input.hasNextInt())
        {
            roll=input.nextInt();
            System.out.println("Enter the Student Name");
            name=input.next();
        }
        else
        {
            System.out.println("Please Enter valid input number");
        }

    }
    public void dispInfo()
    {
        System.out.println("Roll No= "+roll);
        System.out.println("Name= "+name);
    }


    public static void main(String[] args) {

        Student obj=new Student();
        obj.getStudInfo();
        obj.dispInfo();
    }
}
