package com.MethodsEx;

import java.util.Scanner;

public class CheckVowelOrNotusingMethod {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Any Character");
        String str=input.next();
        char ch[]=str.toCharArray();

        System.out.println(checkVowel(ch));
          if (checkVowel(ch)==true)
          {
              System.out.println(str+" is Vowel");
          }
          else
          {
              System.out.println(str+" is Consonant");
          }
    }

    public static boolean checkVowel(char arr[])
    {
        char vowel[]=arr;
        for (int i = 0; i < vowel.length; i++) {

            if (vowel[i]=='a'||vowel[i]=='e'||vowel[i]=='i'||vowel[i]=='o'||vowel[i]=='u')
            {
                return true;
            }
        }
        return false;

    }

}
