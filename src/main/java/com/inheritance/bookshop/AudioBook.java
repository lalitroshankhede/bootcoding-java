package com.inheritance.bookshop;

public class AudioBook extends  Book{

    String audio_book_name="Rich Dad Poor Dad";
    float audio_book_price=20.30f;

    void dispAudiBook()
    {
        dispBoodInfo();
        getPublishDateAndbookType();
        System.out.println(" Audio Book Name :"+audio_book_name);
        System.out.println(" Audio Book Price :"+audio_book_price);
    }
}
