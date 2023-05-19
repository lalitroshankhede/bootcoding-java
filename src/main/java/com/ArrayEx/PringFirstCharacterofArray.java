package com.ArrayEx;

// WAP to take first character of Array element and compare first character with 'A' or 'a'
public class PringFirstCharacterofArray {
    public static void main(String[] args) {

        String arr[]={"Dell","Hp","Asus","Lenovo","apple","Samsung"};

        int size=arr.length;
        for (int i = 0; i < size; i++) {

              String companyNames=arr[i].toLowerCase();  //to convert all string to upper case to find all capital as well as small characters.
              char ch=companyNames.charAt(0);
              if ( ch=='A')
              {
                  System.out.println(arr[i]);
              }
        }
    }
}
