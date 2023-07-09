package com.stringex.StringBasicPrograms;

public class CountTotalVowelandConsonant {

    public static void main(String[] args) {

        String str="Hello Java Programmers how are you its fine !";
        int vowel=0,consonant=0;
        String finalString=str.toLowerCase();
        for (int i = 0; i < finalString.length(); i++) {

           if (finalString.charAt(i)!=' ')
           {
               if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                   vowel++;
               }
               else {
                   consonant++;
               }
           }

        }

        System.out.println("Total No. of Vowel is : "+vowel);
        System.out.println("Total No. of Consonants is : "+consonant);

    }
}
