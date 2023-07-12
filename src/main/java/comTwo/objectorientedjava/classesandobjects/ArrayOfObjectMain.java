package comTwo.objectorientedjava.classesandobjects;

import java.util.Scanner;

public class ArrayOfObjectMain {

    public static void main(String[] args) {
        ArrayOfObjectExample[] obj=new ArrayOfObjectExample[3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < obj.length; i++) {
            obj[i]=new ArrayOfObjectExample();
        }

        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter the Id ");
            int empId=input.nextInt();
            System.out.println("Enter the Name");
            String empName=input.next();
            System.out.println("Enter the Salary");
            double empSalary=input.nextDouble();


            obj[i].setEmpId(empId);
            obj[i].setEmpName(empName);
            obj[i].setEmpSalary(empSalary);
        }

        for (int i = 0; i < obj.length; i++) {
            System.out.println("Employe Id is= "+obj[i].getEmpId());
            System.out.println("Employe Name is= "+obj[i].getEmpName());
            System.out.println("Employe Salary is= "+obj[i].getEmpSalary());
        }
    }


}
