package com.stringex;

public class StringBufferandStringBuilderMethods {
    public static void main(String[] args) {


        //1. append
//        // which is used to contact the string with specified String
//        StringBuffer str = new StringBuffer("Hello");
//        str.append("Java");
//        System.out.println(str);


//        //2. insert
//        // it is used to insert the String into specified given position or index no.
//
//          StringBuffer string=new StringBuffer("Hello");
//          string.insert(1,"Java"); // to place String Java in 1st position of index String array
//        System.out.println(string); // HJavaello


        //3. replace
        //To replaces the given String from the specified beginIndex and endIndex

//        StringBuffer str=new StringBuffer("Hello");
//        str.replace(1,3,"Java"); //to replace the string in specified index position
//        System.out.println(str); // HJavalo


        //4. delete
        //To delete the String from specified beginIndex and endIndex

//        StringBuffer string1=new StringBuffer("Hello");
//        string1.delete(1,3);
//        System.out.println(string1); // Hlo

        //5. reverse
        //To reverse the specified String

//        StringBuffer str=new StringBuffer("Hello");
//        str.reverse();
//        System.out.println(str); //olleH

        //6.capacity
        // The capacity() method of the StringBuffer class returns the current capacity of the buffer.
        // The default capacity of the buffer is 16. If the number of character increases from its current capacity,
        // it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.

//        StringBuffer sb=new StringBuffer();
//        System.out.println(sb.capacity());//default 16
//        sb.append("Hello");
//        System.out.println(sb.capacity());//now 16
//        sb.append("java is my favourite language");
//        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

    }


}
