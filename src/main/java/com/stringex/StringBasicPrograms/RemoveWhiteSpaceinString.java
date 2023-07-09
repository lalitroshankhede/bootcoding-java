package com.stringex.StringBasicPrograms;

public class RemoveWhiteSpaceinString {
    public static void main(String[] args) {

        String str="Hello Java Programmers how are you its fine !";
       str=str.replaceAll(" ","");
        System.out.println(str);

    }
}
