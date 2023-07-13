package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.constrctorInheritance;

public class A3 {

	
	protected int x;
	
	public A3()
	{
		 x=10;
	}
	
}

class B3 extends A3
{
	int x;
	
	public B3()
	{
		x=20;
		super.x=30;
//		System.out.println(super.x); //30
	}
	
	public int getX()
	{
		return x;  
	}
}