package com.StringEx;

public class SubStringEx {
    public static void main(String[] args) {
        //WAP to use substring() and split the word from each other
        String text="Totalfoldersingivenstring";
        //substring
        //beginIndex
        //lastIndex
        System.out.println(text);
        String subString=text.substring(5);
        System.out.println(subString);

        System.out.println("=========================");

        //WAP to count last word characters in a string
        int str=text.length();
        String str2=text.substring(str-6);
        System.out.println(str2);

        System.out.println("=========================");

        //WAP to count middle word characters in a string

        String str3=text.substring(text.indexOf("f"),12);
        System.out.println(str3);
    }
}
