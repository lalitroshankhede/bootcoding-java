package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.superkeywordInstanceVariable;

public class Dog extends Animal
{
	String color="black";
	
	 void printColor()
	 {
		 System.out.println(color);
		 System.out.println(super.color);
	 }
	
}