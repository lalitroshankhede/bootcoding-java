package com.stringex.StringBasicPrograms;

public class CalculateTotalCharacter {

    public static void main(String[] args) {

        String str="The best of both worlds";
        char ch[]=str.toCharArray();
        int count=0;
        for (int i = 0; i < ch.length ; i++) {
            if (ch[i]!=' ')
            {
                count++;
            }
        }

        System.out.println("Total No Character is : "+count);
    }

}
