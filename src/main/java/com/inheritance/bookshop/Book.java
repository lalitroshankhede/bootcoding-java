package com.inheritance.bookshop;

public class Book {
    String title="Harry Potter";
    float price= 500.50f;
    int pages=200;
    String publicationDate="12-March-1998";
    String bookType="Comic Book";


    void dispBoodInfo()
    {
        System.out.println("Title of Book :"+title);
        System.out.println("Price :"+price);
        System.out.println("Total Pages :"+pages);
        System.out.println("Publication Date :"+publicationDate);
        System.out.println("Book Type :"+bookType);
    }

}

