package com.inheritance.bookshop;

public class EBook extends  Book{

    String ebook_name="The Avengers";
    float ebook_price=320.30f;

    void dispEBook()
    {
        dispBoodInfo();
        getPublishDateAndbookType();
        System.out.println(" EBook Name :"+ebook_name);
        System.out.println(" EBook Price :"+ebook_price);
    }

}
