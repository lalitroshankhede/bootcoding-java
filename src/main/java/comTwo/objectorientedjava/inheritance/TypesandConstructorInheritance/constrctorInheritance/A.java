package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.constrctorInheritance;

public class A {

	public void method1() {
		System.out.println("A");
	}
}

class B extends A {

	public void method2() {
		System.out.println("B");
	}
}

class Main {

	public static void main(String[] args) {

		A obj = new B();
		obj.method1();
//		obj.method2();  gives compile time error you cannot call directly to method2 because reference variable 
//		can call of its own class methods .

		/*
		 * Explanation
		 * 
		 * The object obj is of type A and is assigned an instance of class B. This is
		 * possible because of polymorphism in Java. Since class B is a subclass of
		 * class A, an object of class B can be assigned to a reference variable of type
		 * A.
		 * 
		 * This line of code A obj = new B(); is an example of polymorphism, where a
		 * reference variable of a superclass (A) is used to refer to an instance of a
		 * subclass (B).
		 * 
		 * This polymorphic assignment allows you to access the overridden methods of
		 * the subclass (B), but only through the reference variable of the superclass
		 * (A). In other words, you can only call the methods that are declared in class
		 * A using the obj reference variable.
		 * 
		 * In this specific code snippet, since the method2() is not declared in class
		 * A, you cannot directly call obj.method2(). However, you can still access the
		 * methods defined in class A using obj. For example, you could call
		 * obj.method1() which would print "A" to the console.
		 * 
		 */
		
		
		
		// Example 2 

//		B obj2=new A(); it gives compile time error because instance variable cannot assign value to reference variable 

		// Here is B obj2 is reference variable and =new A() is instance of class A i.e
		// object

		/*
		 * Explanation
		 * 
		 * The code you provided has a compilation error because you are trying to
		 * assign an instance of class `A` to a reference variable of type `B`, which is
		 * not allowed in Java.
		 * 
		 * In the line `B obj = new A();`, you are trying to create an object of class
		 * `A` and assign it to a reference variable `obj` of type `B`. However, since
		 * class `B` is a subclass of class `A`, it is not possible to assign an
		 * instance of the superclass (`A`) to a reference variable of the subclass
		 * (`B`).
		 * 
		 * In Java, you can assign an instance of a subclass to a reference variable of
		 * the superclass because the subclass inherits all the properties and methods
		 * of the superclass. This is called upcasting and is allowed due to the "is-a"
		 * relationship between the subclass and the superclass. However, the reverse
		 * assignment (assigning an instance of the superclass to a reference variable
		 * of the subclass) is not allowed because the superclass may not have all the
		 * properties and behaviors defined in the subclass.
		 * 
		 * To fix the compilation error, you need to change the assignment to create an
		 * object of class `B` or any subclass of `B` instead of class `A`. For example:
		 * 
		 * ``` B obj = new B(); ```
		 * 
		 * This will create an object of class `B` and assign it to the reference
		 * variable `obj` of type `B`, which is allowed.
		 * 
		 */

	}

}
