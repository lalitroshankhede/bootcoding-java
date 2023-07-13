package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.SingleLevelnheritance;



public class Student extends Book{

	private int StudId;
	private String StudName;
	private int StudAge;
	
	
	public void getStudInfo(int StudId,String StudName, int StudAge)
	{
		this.StudId=StudId;
		this.StudName=StudName;
		this.StudAge=StudAge;
		
	}
	
	public void dispStudInfo()
	{
		System.out.println("Student Id "+StudId+" "+"Student Name "+StudName+" "+"Student Age "+StudAge);
	}
	
	
	
}
