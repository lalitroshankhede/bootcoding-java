package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.constrctorInheritance;

public class A2 {

	protected int x;
	
	public A2()
	{
		x=10;
	}
}

class B2 extends A2
{
	
	private int x;
	
	public B2()
	{
		 x=20;
	}
	
	public void disp()
	{
		System.out.println(super.x+" "+x);
	}
}
