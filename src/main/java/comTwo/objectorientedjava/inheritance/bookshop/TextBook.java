package comTwo.objectorientedjava.inheritance.bookshop;

public class TextBook extends Book {

    String text_book_name="God of The Rings";
    float text_book_price=220.30f;

    void dispTextBook()
    {
        dispBoodInfo();
        getPublishDateAndbookType();
        System.out.println("Text Book Name :"+text_book_name);
        System.out.println("Text Book Price :"+text_book_price);
    }

}
