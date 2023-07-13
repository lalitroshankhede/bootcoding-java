package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.SingleLevelnheritance;


public class StudBookMain {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.getBookInfo(1001, "Programming With Java", 200);
		student.getStudInfo(101, "ABC", 20);
		student.dispBookInfo();
		student.dispStudInfo();
	}
}
