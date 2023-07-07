package com.stringex;

import java.util.Arrays;

public class StringAllAdvanceMethodExamples {

    public static void main(String[] args) {

        //String advanced method Examples

        //1. substring

//        String str="SachinTendulkar";
//        System.out.println("=========================");
//
//        System.out.println("Substring Starting index from 6 : "+str.substring(6)); //Tendulkar
//        System.out.println("=========================");
//
//        System.out.println("Substring Starting index from 0 to 6 : "+str.substring(0,7));  // SachinT
//
//        System.out.println("=========================");
//
//        //WAP to use substring() and split the word from each other
//        String text="Totalfoldersingivenstring";
//
//        System.out.println(text); //Totalfoldersingivenstring
//        String subString=text.substring(5); //foldersingivenstring
//        System.out.println(subString); //foldersingivenstring
//
//        System.out.println("=========================");
//
//        //WAP to count last word characters in a string
//        int str2=text.length(); //25
//        String str3=text.substring(str2-6); //string
//        System.out.println(str3);
//
//        System.out.println("=========================");



        //2.charAt

//        String str="helloJava";
//        System.out.println(str.charAt(5));
//
//        String string1="HelloJavaWorld";
//        int resultString=string1.length();
//
//        System.out.println("Stating String character is : "+string1.charAt(0));  // H
//        System.out.println("Last String character is : "+string1.charAt(resultString-1)); //string1.charAt(14-1) d

           //3.indexOf

//        String str="welcome to the java programming";
//        System.out.println(str.indexOf('j')); //15
//
//        String str2="this is index of example";
//        int index=str2.indexOf("is",4); //5  he except first is and calculate from index 0 to 4
//        System.out.println(index);

        //WAP to count middle word characters in a string

//        String text="Totalfoldersingivenstring";
//        String str3=text.substring(text.indexOf("f"),12); // to print folders upto index 12 from starting f rest is skipped.
//        System.out.println(str3);

        //4. lastIndexOf

//        String str="this is index of example";
//        int index=str.lastIndexOf("is"); //5
//        System.out.println(index);   // to move start from 0 to last index of the value
//                                    // Note : it except also those value which is placed before last Index value

        //5.toCharArray

//        String str="welcome to the javatpoint";
//        char arr[]=str.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println("====================================== ");
//        String str1="welcome to the javatpoint";
//        char arr2[]=str1.toCharArray();
//        int lengthChar=arr2.length;
//        System.out.println("Length of array is : "+lengthChar);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }




        //6. valueOf

//        int number=100;
//        char ele='S';
//        float decimalNo=456.643f;
//        double longDecimalno=4354364564564.46757574523;
//        boolean result=true;
//        int arr[]={45,456,45,323,66,75};
//
//        String numberString=String.valueOf(number);
//        String charEle=String.valueOf(ele);
//        String decimalNoString=String.valueOf(decimalNo);
//        String longDecimalString=String.valueOf(longDecimalno);
//        String booleanString=String.valueOf(result);
//
//         //TO Convert Integer Array into String Array  using Arrays Class and valueOf method
//        String array[] =new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//             array[i]=String.valueOf(arr[i]);
//        }
//        System.out.println(Arrays.toString(array));  //To Print String Array
//
//        System.out.println(numberString);  //Number String
//        System.out.println(charEle);  // Character String
//        System.out.println(decimalNoString);  // Float String
//        System.out.println(longDecimalString); // Double String
//        System.out.println(booleanString);   // Boolean String



        // 7. intern


//         // Normal String object created in Heap Area
//         // and Str 1 and Str 2 points on different values because
//        // using new keyword two objects will be created differenly for Str1 and Str2
//        String str1=new String("Hello Java");
//        String str2=new String("Hello Java");
//        System.out.println(str1==str2); // false
//
//        //Using intern() method
//        // it will create only one object for Str1 and the JVM will provide instace reference to Str2
//        // which is to be point by str1 and str2 on same value
//        // intern method create and store exact copy into String Constant Pool
//        // to save memory and gives the instace variable reference to Str2
//
//        String string1=new String("Hello Java").intern();
//        String string2=new String("Hello Java").intern();
//        System.out.println(string1==string2); // true


     //8. compareTo

//        String str1="hii";
//        String str2="hello";
//        System.out.println(str1.compareTo(str2));


         //9. spilt

//          String str="hello welcome to the java programming tutorial";
//          String arrString[]=str.split("\\s"); // to split the string when white space comes up.
//        for (String arrEle:arrString) {
//
//            System.out.println(arrEle);
//        }
//
//
//        //WAP to split the string using "," and display is one line
//        // as well as count total no. of words in String
//        String technologies = "java,c,c++,html";
//        String[] words = technologies.split(",");
//
//        for (int i = 0; i < words.length; i++) {
//
//            System.out.println(words[i].toUpperCase() + "|");
//        }
//        System.out.println("Total no. of Technologies is " + words.length);
//
//        System.out.println("==========================================");
//
////        //WAP to split the string using "/" and display is one line
////
//        String filepath="/Users/bootcoding/bootcoding-services/bootcoding-work/product-work/github-work/bootcoding-product";
//        String[] folders=filepath.split("/");
//        System.out.println("Total no. of folder in given path :"+folders.length);
//
//        System.out.println("==========================================");
//
//        //WAP to split the string using "/" and display is one line
//
//        String data="The-data-table-that-we-have-been-presenting-receives";
//        String tokens[]=data.split("-");
//        System.out.println("Total words in given data is "+tokens.length);
//
//        System.out.println("==========================================");
//
//        // try with double quote (escape sequence)
//
//        String quote="[columns]\"columns\"";
//        System.out.println(quote);






    }
}
