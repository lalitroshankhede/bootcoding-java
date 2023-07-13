package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.constrctorInheritance;

public class Base {

	
	int x;
	
	Base(int _x)	{
		
		x=_x;
	}
}

class Derived extends Base
{
	
	int y;
	 
	public Derived(int _x,int _y) {
		
		super(_x);
		y=_y;
		 
	}
	
	
	void disp()
	{
		System.out.println("X= "+x+" "+"Y= "+y);
	}
}
