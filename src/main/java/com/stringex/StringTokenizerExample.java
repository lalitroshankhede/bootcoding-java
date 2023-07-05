package com.stringex;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

        //String Tokenizer Methods

        //1. hasMoreTokens()
//        StringTokenizer str=new StringTokenizer("my name is lalit");
//        while (str.hasMoreTokens())
//        {
//            System.out.println(str.nextToken());
//        }

        //2. nextTocken()

//        StringTokenizer str=new StringTokenizer("my,name,is,lalit");
//
//        System.out.println("Next Token is: "+str.nextToken(","));  //print only my

        //3. hasMoreElements()

//        StringTokenizer str=new StringTokenizer("my name is lalit");
//        while (str.hasMoreElements()) // This method returns the same value as hasMoreTokens() method of StringTokenizer class.
//                                      //The only difference is this class can implmenet the Enumeration interface.
//        {
//            System.out.println(str.nextToken());
//        }


        //4.nextElement()

//        StringTokenizer str=new StringTokenizer("my name is lalit");
//        while (str.hasMoreElements())
//        {
//            System.out.println(str.nextElement()); // nextElement() method returns the next token object in the tokenizer String. It can
//                                           // implement Enumeration interface
//        }

        //5. countTokens()
        StringTokenizer str=new StringTokenizer("my name is lalit");

            System.out.println(str.countTokens()); // this method calculates the number of tokens present in the tokenizer String.

    }
}
