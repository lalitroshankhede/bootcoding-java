package com.inheritance.bookshop;

public class BookApp {

    public static void main(String[] args) {

        Book book=new Book();
        book.dispBoodInfo();
//        book.buy();     gives error because it can't access private method
        System.out.println("==================================");
        TextBook textBook=new TextBook();
        textBook.dispTextBook();
        textBook.sale();
        System.out.println("==================================");
        EBook eBook=new EBook();
        eBook.dispEBook();
        eBook.sale();
        System.out.println("==================================");
        AudioBook audioBook=new AudioBook();
        audioBook.dispAudiBook();
        eBook.sale();
    }

}
