package com.stringex;

public class SpiltEx {
    public static void main(String[] args) {

        //WAP to split the string using "," and display is one line
        // as well as count total no. of words in String
        String technologies = "java,c,c++,html";
        String[] words = technologies.split(",");

        for (int i = 0; i < words.length; i++) {

            System.out.println(words[i].toUpperCase() + "|");
        }
        System.out.println("Total no. of Technologies is " + words.length);

        System.out.println("==========================================");

//        //WAP to split the string using "/" and display is one line
//
        String filepath="/Users/bootcoding/bootcoding-services/bootcoding-work/product-work/github-work/bootcoding-product";
        String[] folders=filepath.split("/");
        System.out.println("Total no. of folder in given path :"+folders.length);

        System.out.println("==========================================");

        //WAP to split the string using "/" and display is one line

        String data="The-data-table-that-we-have-been-presenting-receives";
        String tokens[]=data.split("-");
        System.out.println("Total words in given data is "+tokens.length);

        System.out.println("==========================================");

        // try with double quote (escape sequence)

        String quote="[columns]\"columns\"";
        System.out.println(quote);
    }
}
