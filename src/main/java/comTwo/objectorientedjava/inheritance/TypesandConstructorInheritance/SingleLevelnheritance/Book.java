package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.SingleLevelnheritance;

public class Book {
	
	private int bookId;
	private String bookName;
	private double bookPrice;
	
	void getBookInfo(int bookId,String bookName,double bookPrice)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
	
	void dispBookInfo()
	{
		System.out.println("Book Id "+bookId+" "+"Book Name "+bookName+" "+"Book Price "+bookPrice);
	}
	
	

}
