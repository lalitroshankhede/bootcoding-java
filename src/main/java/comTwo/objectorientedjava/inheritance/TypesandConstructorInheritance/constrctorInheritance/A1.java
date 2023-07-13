package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.constrctorInheritance;

public class A1 {
	public void method1() {
		System.out.println("A");
	}
}


class B1 extends A1 {

	@Override //override this method internally 
	public void method1() {
		System.out.println("B");
	}
	
	public void method2() {
		System.out.println("B++");
	}
	
}

 
 
	 	
		 

		
	 
	 
	
 
