package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.superkeywordParentclassMethod;

public class Dog extends Animal
{
	String color="black";
	
   public void eat()
	 {
		
	      super.eat();
	      System.out.println("This is Dog Method");
	 }
	
}