package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.constrctorInheritance;

public class A4 {

	protected int  x;
	 
	
	public A4(int x)
	{
		this.x=x;
		
	}
}

class B4 extends A4
{
	private int y;
	
	
	public B4(int x,int y)
	{
		super(x); //5 
		this.y=y;  //10 
	}
	
	public int getX()
	{
		return x; //5
	}
	
	public int getY()
	{ 
		return y; //10
	}
}