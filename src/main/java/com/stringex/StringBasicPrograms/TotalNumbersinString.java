package com.stringex.StringBasicPrograms;

public class TotalNumbersinString {
    public static void main(String[] args) {

        String str="Hello123Ja78va98";
        String finalString=str.toLowerCase();
        char[] ch=finalString.toCharArray();
        int number=0;
        for (int i = 0; i < finalString.length(); i++) {

            if (Character.isDigit(ch[i]))
            {
                number++;
            }
        }
        System.out.println("Total No. of Digit is Present in String is : "+number);
    }
}
