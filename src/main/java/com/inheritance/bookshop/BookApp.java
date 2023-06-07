package com.inheritance.bookshop;

public class BookApp {

    public static void main(String[] args) {

        Book book=new Book();
        book.dispBoodInfo();
        System.out.println("==================================");
        TextBook textBook=new TextBook();
        textBook.dispTextBook();
        System.out.println("==================================");
        EBook eBook=new EBook();
        eBook.dispEBook();
        System.out.println("==================================");
        AudioBook audioBook=new AudioBook();
        audioBook.dispAudiBook();
    }
}
