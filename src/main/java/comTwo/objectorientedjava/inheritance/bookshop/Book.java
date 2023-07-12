package comTwo.objectorientedjava.inheritance.bookshop;

public class Book {
    String title="Harry Potter";
    float price= 500.50f;
    int pages=200;
   private   String publicationDate="12-March-1998";
   private String bookType="Comic Book";


    void dispBoodInfo()
    {
        System.out.println("Title of Book :"+title);
        System.out.println("Price :"+price);
        System.out.println("Total Pages :"+pages);
    }

    public void getPublishDateAndbookType()
    {
        System.out.println("Publication Date :"+publicationDate);
        System.out.println("Book Type :"+bookType);
    }

  private   void buy()
    {
        System.out.println("Buy Book "+title);
    }
    protected  void sale()
    {
        System.out.println("Price of Book "+price);
    }


}

