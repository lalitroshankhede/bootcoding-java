
package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.realuseofSuperKeyword;

public class EmpProperty extends Employee{
	
	protected double PFAmount;

	
	 public EmpProperty(int empId,String empName,double empSalary,double PFAmount) // passing the value of super class constructor 
	 {
		 
		 super(empId, empName, empSalary); //reusing paret constructor
		 this.PFAmount=PFAmount;
		
	}
	 
	 public void dispEmpInfo()
	 {
		 System.out.println("Employee Id ="+empId+" "+"Employee Name "+empName+" "+"Employee Salary "+empSalary+" "+"Employee PF Amount "+PFAmount);
	 }
}
